import java.util.*;

class Principal {

public static int start=0;
public static int v1=0,v2=0,sb=0;

public static void main(String[] args) 
{
System.out.println("[]:::[ D ]:::[ O ]:::[ M ]:::[ I ]:::[ N ]:::[ O]:::[]\n");
crear_ficha();
System.out.println("Digite nombre de jugador 1");
String uno=Leer.dato();
System.out.println("Digite nombre de jugador 2");
String dos=Leer.dato();
System.out.println("Digite nombre de jugador 3");
String tres=Leer.dato();

System.out.println("Digite 1 para repartir fichas a: "+uno);
int q=Leer.datoInt();
if (q==1)
repartir_jugador(Listas.lj1,uno); 

System.out.println("Digite 2 para repartir fichas a: "+dos);
int w=Leer.datoInt();
if (w==2)
repartir_jugador(Listas.lj2,dos); 

System.out.println("Digite 3 para repartir fichas a: "+tres);
int r=Leer.datoInt();
if (r==3)
repartir_jugador(Listas.lj3,tres); 
comprobar();
v1=evaluar_empezar (uno,dos,tres);
v2=v1;
//System.out.println(start+"...."+v1);

if (start==1)
{
while (seguir_jugando(uno,dos,tres))
{
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj2,dos,1);
}
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj3,tres,1);
}
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj1,uno,1);
}

}

}

if (start==2)
{
while (seguir_jugando(uno,dos,tres))
{
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj3,tres,2);
}
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj1,uno,2);
}
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj2,dos,2);
}

}

}

if (start==3)
{
while (seguir_jugando(uno,dos,tres))
{
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj1,uno,3);
}	
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj2,dos,3);
}
if (seguir_jugando(uno,dos,tres))
{
evalular_jugador (Listas.lj3,tres,3);
}

}

}

}


public static void crear_ficha() {
for(int i=0; i<=6;i++){
 for(int j=i; j<=6; j++) {
Ficha f = new Ficha(i,j,true,true);
Listas.adicionar(Listas.lf,f);	
}
}
}

public static void repartir_jugador(ArrayList lj,String s){ 
int i=0;	
while (i< 7)
{

double n= Math.random();
n= n*100;
int x=(int)n;

if (x< 28)
{
Ficha fi=null;
fi=(Ficha)Listas.lf.get(x);
if (fi.getEstado()==true)
{

lj.add(fi);
//System.out.println("|" + fi.getV1() + ":" + fi.getV2() +"| \n");
fi.setEstado(false);
i++;
//System.out.println("esto es...."+x);
}
}

}

System.out.println("FICHAS JUGADOR(A): "+s);
Ficha j=null;
for (int a=0;a< lj.size();a++)
{
j=(Ficha)lj.get(a);
System.out.println("|" + j.getV1() + ":" + j.getV2() +"| \n");
}

}



public static void comprobar ()
{
System.out.println("Fichas en estado false");
for (int i=0; i< Listas.lf.size();i++)
{
Ficha f=null;
f=(Ficha)Listas.lf.get(i);
if (f.getEstado()==true)
System.out.println("|" + f.getV1() + ":" + f.getV2() +"| \n");
}
}

public static int evaluar_empezar (String a,String b, String c)
{
int x=empezar(Listas.lj1);
int z=empezar(Listas.lj2);
int y=empezar(Listas.lj3);


if (x >z)
{
if (x >y)
{
System.out.println("Empieza: "+a);
start=1;
for (int i=0;i< Listas.lj1.size();i++)
{
Ficha f=null;
f=(Ficha)Listas.lj1.get(i);
if (x==f.getV1()&&x==f.getV2())
{
System.out.println("Con ficha -- > |" + f.getV1() + ":" + f.getV2() +"| \n");
f.setJugar(false);
//break;
}
}
return x;
}


else
{
System.out.println("Empieza "+ c);
start=3; 
for (int i=0;i< Listas.lj3.size();i++)
{
Ficha f=null;
f=(Ficha)Listas.lj3.get(i);
if (y==f.getV1()&&y==f.getV2())
{
System.out.println("Con ficha -- > |" + f.getV1() + ":" + f.getV2() +"| \n");
f.setJugar(false);
//break;
}
}
return y;
}	
}
else
{
if (z >y)
{
System.out.println("Empieza "+b);
start=2;
for (int i=0;i< Listas.lj2.size();i++)
{
Ficha f=null;
f=(Ficha)Listas.lj2.get(i);
if (z==f.getV1()&&z==f.getV2())
{
System.out.println("Con ficha -- > |" + f.getV1() + ":" + f.getV2() +"| \n");
f.setJugar(false);
//break;
}
}
return z;
}


else
{
System.out.println("Empieza "+c);
start=3;
for (int i=0;i< Listas.lj3.size();i++)
{
Ficha f=null;
f=(Ficha)Listas.lj3.get(i);
if (y==f.getV1()&&y==f.getV2())
{
System.out.println("Con ficha -- > |" + f.getV1() + ":" + f.getV2() +"| \n");
f.setJugar(false);
//break;
}

}
return y;
}
}


}

public static int empezar(ArrayList lj)
{
int x=-1;
for( int a=0;a< lj.size();a++)
{

Ficha f=null;
f=(Ficha)lj.get(a);
if (f.getV1()==f.getV2())
{
if (f.getV1() >x)
x=f.getV1();
}
}
return x;
}

public static void evalular_jugador (ArrayList lj, String j, int z)
{
int r=-1;
System.out.println("Jugador(a) "+j+" Puedes jugar con la(s) ficha(s):");
for (int i=0;i< lj.size();i++)
{
Ficha f=null;
f=(Ficha)lj.get(i);

if (true==f.getJugar())
{
if (v1==f.getV1()||v1==f.getV2()||v2==f.getV1()||v2==f.getV2())
{	int h=i+1;
System.out.println("|" + f.getV1() + ":" + f.getV2() +"| .........."+h+" \n");
r++;
sb=0;
}
}


}
if (r==-1)
{
System.out.println("No tienes fichas para jugar");
tomar_ficha(lj,j,z);
}
else
{	

System.out.println("Digita el numero que indica tu ficha para jugarla");
int t=Leer.datoInt();
t=t-1;
Ficha fi=null;
fi=(Ficha)lj.get(t);

if (v1!=v2)
{

if (v1==fi.getV1())
v1=fi.getV2();
else
if (v1==fi.getV2())
v1=fi.getV1();
else
if (v2==fi.getV1())
v2=fi.getV2();
else
if (v2==fi.getV2())
v2=fi.getV1();

}



else
{
if (v1==fi.getV1())
{
v2=fi.getV2();
}
else
v1=fi.getV1();
}

fi.setJugar(false);

}
}

public static void tomar_ficha(ArrayList lp,String a, int z)
{
int i=0;
if (sb!=3)
{
while (i< 1)
{
double n= Math.random();
n= n*100;
int x=(int)n;
if (x< 28)
{
Ficha f=null;
f=(Ficha)Listas.lf.get(x);

if (f.getEstado()==true)
{	
int	j=0;
while (j< 1)
{
lp.add(f);
System.out.println("Tu ficha es");
System.out.println("|" + f.getV1() + ":" + f.getV2() +"| \n");	

if(f.getV1()==v1||f.getV2()==v2||f.getV1()==v2||f.getV2()==v1)	
{
i++;
j++;
evalular_jugador(lp,a,z);
}
else
{
System.out.println("NO SACASTE UNA FICHA INDICADA");
System.out.println("DIGITA ALGUN NUMERO PARA TOMAR OTRA");
int h=Leer.datoInt();
j++;
}



}

}
else
{
System.out.println("YA NO HAY FICHAS PARA TOMAR");
i++;

sb++; 
}
}
}
}
else
{
System.out.println("SE HA CERRADO EL JUEGO");
juego_cerrado(z);

}

}

public static void juego_cerrado (int s)
{

int c1=0,c2=0,c3=0;
for (int i=0;i< Listas.lj1.size();i++)
{
Ficha f=null;
f= (Ficha)Listas.lj1.get(i);
if(true==f.getJugar())
c1=c1+f.getV1()+f.getV2();
}

for (int j=0;j< Listas.lj2.size();j++)
{
Ficha fi=null;
fi= (Ficha)Listas.lj2.get(j);
if(true==fi.getJugar())
c2=c2+fi.getV1()+fi.getV2();
}

for (int k=0;k< Listas.lj3.size();k++)
{
Ficha fic=null;
fic= (Ficha)Listas.lj3.get(k);
if(true==fic.getJugar())
c3=c3+fic.getV1()+fic.getV2();
}
if(s==1)
{

if (c1 >c2)
{
if (c1 >c3)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
if (c3 >c1)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c3);
}
if (c3==c1)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
}
else
{
if (c2 >c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c3 >c2)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c2);
}
if (c2==c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c1==c2)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
}
}

if (s==2)
{

if (c1 >c2)
{
if (c1 >c3)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
if (c3 >c1)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c3);
}
if (c3==c1)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c1);
}
}
else
{
if (c2 >c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c3 >c2)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c2);
}
if (c2==c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c1==c2)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
}

}

if (s==3)
{

if (c1 >c2)
{
if (c1 >c3)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
if (c3 >c1)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c3);
}
if (c3==c1)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c1);
}
}
else
{
if (c2 >c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c3 >c2)
{
System.out.println("El ganador es el jugador de la tercera posicion con: "+c2);
}
if (c2==c3)
{
System.out.println("El ganador es el jugador de la segunda posicion con: "+c2);
}
if (c1==c2)
{
System.out.println("El ganador es el jugador de la primera posicion con: "+c1);
}
}

}


}

public static boolean seguir_jugando(String a, String b, String c)
{
int c1=0,c2=0,c3=0;
for (int i=0;i< Listas.lj1.size();i++)
{
Ficha f=null;
f= (Ficha)Listas.lj1.get(i);
if(true==f.getJugar())
c1++;
}

for (int j=0;j< Listas.lj2.size();j++)
{
Ficha fi=null;
fi= (Ficha)Listas.lj2.get(j);
if(true==fi.getJugar())
c2++;
}

for (int k=0;k< Listas.lj3.size();k++)
{
Ficha fic=null;
fic= (Ficha)Listas.lj3.get(k);
if(true==fic.getJugar())
c3++;
}

/*imprimir (lj1);
imprimir (lj2);
imprimir (lj3);*/
//	System.out.println("las fichas van asi:");
//	System.out.println("para "+a+c1+" para "+b+c2+" para "+c+c3);
if (c1==0||c2==0||c3==0)
{
if (c1==0){
System.out.println("GANADOR JUGADOR(A): "+a);
}
if (c2==0){
System.out.println("GANADOR JUGADOR(A): "+b);
}
if(c3==0){
System.out.println("GANADOR JUGADOR(A): "+c);
}
return false;
}
else;
return true;
}

public static void imprimir (ArrayList lp){
for (int i=0;i< lp.size();i++){
Ficha f=null;
f=(Ficha)lp.get(i);
System.out.println("|" + f.getV1() + ":" + f.getV2() +"| .........."+f.getJugar()+" \n");

}
}

}
