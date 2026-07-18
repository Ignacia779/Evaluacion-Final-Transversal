package model;

public class Persona implements Registrable {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private Contacto contacto;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Direccion direccion, Contacto contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n" +
                 direccion.toString() + "\n" + contacto.toString();
    }
    @Override
    public String registrar(){
        return "Persona registrada en el sistemma";
    }
    @Override
    public String mostrarDatos(){
        return "Persona: " + nombre + " " + apellido;
    }
}
