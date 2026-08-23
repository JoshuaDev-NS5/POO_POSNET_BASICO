package POSTNET;
import java.util.List;
import java.util.ArrayList;
public class Posnet {
    public static double RecargoPorCuota = 0.03; //Porcentaje de recargo 3%, atributo de clase
    public static int Min_Cuotas =1;
    public static int Max_Cuotas =6;

    public Ticket EfectuarPago(TarjetaDeCredito Tarjeta, Double Monto, int Cuotas) {
       Ticket ticket = null;
        Persona Titular=Tarjeta.getTitular();
        String Nombre= Titular.Nombre() + " " + Titular.Apellido() ;
       //Validacion
        if(datosValidados(Tarjeta,Monto,Cuotas)){
            if(Cuotas == 1){
                if(Tarjeta.tieneSaldoDisponible(Monto)){//Se trabaja con monto porque no existe algun recargo por cuotas
                    ticket = new Ticket(Nombre,Monto,Monto);
                }

            }
            if(Cuotas >1){
                List <Double> Contenedor= RecargoSegunCuotas(Monto,Cuotas);
                if (Tarjeta.tieneSaldoDisponible(Contenedor.get(0))){
                    ticket = new Ticket(Nombre,Contenedor.get(0),Contenedor.get(1));
                }
            }

        }

        return ticket;

    }

    public boolean datosValidados(TarjetaDeCredito Tarjeta, Double Monto, int Cuotas){
            if (Tarjeta== null || Monto<=0 || Cuotas>6 ||Cuotas<1 ){
                return false;
            }

            return true;
    }

    public List<Double> RecargoSegunCuotas(double Monto, int NumCuotas) {
        double MontoTotal;
        double MontoPorCuota;

        double Porcentaje = (NumCuotas - 1) * 3;
        MontoTotal= Monto + (Monto * (Porcentaje / 100) );
        MontoPorCuota= MontoTotal / NumCuotas;

        List<Double> resultado = new ArrayList<>();
        resultado.add(0,MontoTotal);
        resultado.add(1,MontoPorCuota);

        return  resultado;

    }
}
