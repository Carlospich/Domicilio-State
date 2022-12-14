public class Domicilio
{
    private Estado estado;
    private String Estadito;
    private String direccion;
    private int tiempoDeEstado;

    public Domicilio()
    {
        estado = new RecibidoEstado(this);
    }

    public void cambiarEstado (Estado estado)
    {
        this.seguimiento();
        this.estado=estado;
    }

    public Estado getEstado()
    {
        return estado;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setTiempoDeEstado(int tiempoDeEstado)
    {
        this.tiempoDeEstado = tiempoDeEstado;
    }

    private void seguimiento()
    {
        if (estado instanceof ConfirmarPago)
        {
            System.out.println("Esperando confirmacion de pago");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(estado instanceof DespachoEstado)
        {
            System.out.println("Su pedido ya va en camino");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getEstadito()
    {
        return Estadito;
    }

    public void setEstadito(String estadito)
    {
        Estadito = estadito;
    }
}
