public class DespachoEstado extends Estado
{
    DespachoEstado(Domicilio domicilio){
        super(domicilio);
        domicilio.setTiempoDeEstado(1500);
    }
    @Override
    public String recibido()
    {
        return ("0");
    }

    @Override
    public String confirmarpago()
    {
        return("0");
    }

    @Override
    public String camino()
    {
        domicilio.cambiarEstado(new EntregadoEstado (domicilio));
        domicilio.setEstadito("Despachado");
        return ("1");
    }

    @Override
    public String entregado()
    {
        return ("0");
    }

}
