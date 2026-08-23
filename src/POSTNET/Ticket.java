package POSTNET;

public class Ticket {
    private String NombreApellido;
    private Double MontoTotal;
    private Double MontoPorCuota;

    public Ticket (String NombreApellido, Double MontoTotal, Double MontoPorCuota){
        this.NombreApellido=NombreApellido;
        this.MontoTotal=MontoTotal;
        this.MontoPorCuota=MontoPorCuota;
    }

    //Geterr
    public String NombreApellid(){
        return this.NombreApellido;
    }

    public Double MontoTotal(){
        return this.MontoTotal;
    }

    public Double MontoPorCuota(){
        return this.MontoPorCuota;
    }
    //Seters
    public void SetNombreApellido(String newNombreApellido){
        this.NombreApellido = newNombreApellido;
    }

    public void SetMontoTotal(Double newMontoTotal){
        this.MontoTotal=newMontoTotal;
    }
    public void SetMontoPorCuota(Double newMontoPorCuota){
        this.MontoPorCuota=newMontoPorCuota;
    }
}
