package POSTNET;

public class TarjetaDeCredito {
    private String EntidadBancaria;
    private EntidadFinanciera entidadFinanciera;
    private String Numero;
    private Double Saldo;
    private Persona Titular;

    // Constructor
    public TarjetaDeCredito(String EntidadBancaria, EntidadFinanciera entidadFinanciera, String Numero, Double Saldo, Persona Titular) {
        this.EntidadBancaria=EntidadBancaria;
        this.entidadFinanciera = entidadFinanciera;
        this.Numero = Numero;
        this.Saldo = Saldo;
        this.Titular = Titular;
    }

    // Getters
    public String getEntidadBancaria(){
        return EntidadBancaria;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public String getNumero() {
        return Numero;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public Persona getTitular() {
        return Titular;
    }

    // Setters
    public void setEntidadBancaria(String newEntidadBancaria){
        this.EntidadBancaria=newEntidadBancaria;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public void setTitular(Persona Titular) {
        this.Titular = Titular;
    }

    public boolean tieneSaldoDisponible(double monto){
        return this.Saldo >= monto;
    }

}
