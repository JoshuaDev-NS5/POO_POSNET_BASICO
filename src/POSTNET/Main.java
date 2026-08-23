package POSTNET;
import java.util.List;
import java.util.ArrayList;
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
                "MontoPorCuota: " + ticketGenerado.MontoPorCuota() );
        System.out.println("Estado de la tarjeta: " + Tarjeta.getSaldo());
    }
}