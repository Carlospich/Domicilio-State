public class ConfirmarPago extends Estado
{
    ConfirmarPago(Domicilio domicilio){
        super(domicilio);
        domicilio.setTiempoDeEstado(3);
    }
    @Override
    public String recibido()
    {
        return ("0");
    }

    @Override
    public String confirmarpago()
    {
        domicilio.cambiarEstado(new DespachoEstado (domicilio));
        domicilio.setEstadito("Confirmado");
        return("1");
    }

    @Override
    public String camino()
    {
        return ("0");
    }

    @Override
    public String entregado()
    {
        return ("0");
    }
}
