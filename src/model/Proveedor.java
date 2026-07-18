package model;

public class Proveedor extends Persona implements Registrable{
    private String tipoServicio;

    public Proveedor() {
    }

    public Proveedor(String nombre, String apellido, Direccion direccion, Contacto contacto, String tipoServicio) {
        super(nombre, apellido, direccion, contacto);
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    @Override
    public String toString(){
        return "Proveedor: " + super.toString() +
                " | Servicio: " + tipoServicio;
    }
    @Override
    public String registrar(){
        return "Proveedor registrado en el sistema";
    }
    @Override
    public String mostrarDatos() {
        return "=== PROVEEDOR ===\n" +
                "Nombre: " + getNombre() + " " + getApellido() + "\n" +
                "Servicio: " + tipoServicio + "\n" +
                 getDireccion() + "\n" +
                getContacto();
    }
}
