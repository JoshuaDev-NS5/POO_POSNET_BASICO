package POSTNET;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    public static void main(String[] args) {
        Posnet posnet= new Posnet();
        Persona p=new Persona("72379771","Anthony","Nuñez",
                "986940464","anthonyjosue2018@outlook.es");
        TarjetaDeCredito Tarjeta=new TarjetaDeCredito("FakeBank",EntidadFinanciera.BIRZA,
                "1234567890123456",80000.0,p);

        System.out.println("Tarjeta antes del pago");
        System.out.println("Estado de la tarjeta: " + Tarjeta.getNumero() );

        System.out.println("Tarjeta despues de pagar...");
        Ticket ticketGenerado= posnet.EfectuarPago(Tarjeta,10000.0,5);
        System.out.println(ticketGenerado);
        System.out.println("Titutlar: " + ticketGenerado.NombreApellid()+" MontoTotal: " + ticketGenerado.MontoTotal() +
                " MontoPorCuota: " + ticketGenerado.MontoPorCuota() );
        System.out.println("Estado de la tarjeta: " + Tarjeta.getSaldo());
        boolean Salir= false;
        Scanner sc= new Scanner(System.in);//Iniciamos el scanner
        List<Ticket> Tikecs= new ArrayList<>(); //Almacenamos todos los tikestgenerados aquí
        System.out.println("=== Sistema de ejecucion de POSNET basico ===");
        while(!Salir){
            System.out.println("1) Realizar un pago");
            System.out.println("2) Ver todos los tikes generados");
            System.out.println("0) Salir ");
            System.out.println("Seleccione una opccion: ");
            int opcion = sc.nextInt();
            System.out.println();//Salto de linea
            sc.nextLine();
            switch (opcion){
                case 1://Realizamos un pago, para recalcar la información del cliente deberia ser llamado por una api no que se cree una instancia en el mismo sistema
                    while (true){
                            System.out.println("Ingrese el monto y la cantidad de cuotas:");
                            System.out.println("Monto:");
                            Double Monto = sc.nextDouble();
                            sc.nextLine();//Limpiamos
                            System.out.println("Numero de cuotas:");
                            int NumCuotas = sc.nextInt();
                            Ticket RecivoGenerado= posnet.EfectuarPago(Tarjeta,Monto,NumCuotas);
                            System.out.println(RecivoGenerado.toString());
                            Tikecs.add(0,RecivoGenerado);
                            break;
                        }

                   break;
                case 2:
                    System.out.println("Historial de Tickes");
                    for(Ticket T: Tikecs){
                        System.out.println("Factura:");
                        System.out.println(T.toString());
                    }
                    break;
                case 0:
                    break;

            }
        }


    }
}