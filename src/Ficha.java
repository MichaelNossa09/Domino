public class Ficha {

int v1;
int v2;
boolean estado;
boolean jugar;

public Ficha(int v1, int v2, boolean s, boolean j)

{
this.v1=v1;
this.v2=v2;
this.estado=s;
this.jugar=j;

}

public int getV1()
{
return this.v1;
}


public int getV2()
{
return this.v2;
}
public boolean getEstado()
{
return estado;
}

public void setEstado(boolean c)
{
this.estado=c;
}

public boolean getJugar ()
{
return jugar;
}

public void setJugar (boolean g)
{
this.jugar=g;
}
}
