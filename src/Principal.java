import java.util.Scanner;

public class Principal
{
    public static void main (String [] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Inserte su direccion de entrega: ");
        String dir = myObj.nextLine();  // Read user input
        Domicilio domicilio = new Domicilio();

        domicilio.setDireccion(dir);

        System.out.println(domicilio.getEstado().recibido());
        System.out.println(domicilio.getEstado().confirmarpago());
        System.out.println(domicilio.getEstado().camino());
        System.out.println(domicilio.getEstado().entregado());
        System.out.println("El estado de su pedido es: ");
        System.out.println(domicilio.getEstadito());
    }
}
