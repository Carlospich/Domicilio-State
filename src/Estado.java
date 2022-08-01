public abstract class Estado
{
    Domicilio domicilio;

    Estado(Domicilio domicilio)
    {
        this.domicilio = domicilio;
    }


    public abstract String recibido();
    public abstract String confirmarpago();
    public abstract String camino();
    public abstract String entregado();

}
