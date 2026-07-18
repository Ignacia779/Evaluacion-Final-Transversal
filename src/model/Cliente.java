package model;

public class Cliente extends Persona implements Registrable{
    public String tipoTour;

    public Cliente() {
    }

    public Cliente(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public Cliente(String nombre, String apellido, Direccion direccion, Contacto contacto, String tipoTour) {
        super(nombre, apellido, direccion, contacto);
        this.tipoTour = tipoTour;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    @Override
    public String toString(){
        return "Cliente: " + super.toString() + " | Tipo de Tour: " + tipoTour;
    }
     @Override
    public String registrar(){
        return "Cliente registrado en el sistema";
     }
    @Override
    public String mostrarDatos() {
        return "Cliente:\n" + super.toString();
    }



}
