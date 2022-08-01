public class RecibidoEstado extends Estado
{
    RecibidoEstado(Domicilio domicilio){
        super(domicilio);
        domicilio.setTiempoDeEstado(3);
    }
    @Override
    public String recibido()
    {
        domicilio.cambiarEstado(new ConfirmarPago (domicilio));
        domicilio.setEstadito("Recibido");
        return ("1");
    }

    @Override
    public String confirmarpago()
    {
       return("0");
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
