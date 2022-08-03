public class EntregadoEstado extends Estado
{
    EntregadoEstado(Domicilio domicilio){
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
        domicilio.cambiarEstado(new RecibidoEstado (domicilio));
        domicilio.setEstadito("Entregado");
        return ("");
    }
}
