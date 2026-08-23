package POSTNET;

public class Persona {
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Mail;

    public Persona(String DNI,String Nombre, String Apellido, String Telefono, String Mail){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Mail = Mail;

    }

    // Getters
    public String DNI() {
        return DNI;
    }

    public String Nombre() {
        return Nombre;
    }

    public String Apellido() {
        return Apellido;
    }

    public String Telefono() {
        return Telefono;
    }

    public String Mail() {
        return Mail;
    }

    // Setters
    public void SetDNI(String newDNI) {
        this.DNI = newDNI;
    }

    public void SetNombre(String newNombre) {
        this.Nombre = newNombre;
    }

    public void SetApellido(String newApellido) {
        this.Apellido = newApellido;
    }

    public void SetTelefono(String newTelefono) {
        this.Telefono = newTelefono;
    }

    public void SetMail(String newMail) {
        this.Mail = newMail;
    }

}
