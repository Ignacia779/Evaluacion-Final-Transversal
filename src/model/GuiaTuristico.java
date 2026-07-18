package model;

public class GuiaTuristico extends Persona implements Registrable{
    private String idioma;
    private String especialidad;

    public GuiaTuristico() {
    }

    public GuiaTuristico(String nombre, String apellido, Direccion direccion, Contacto contacto, String idioma, String especialidad) {
        super(nombre, apellido, direccion, contacto);
        this.idioma = idioma;
        this.especialidad = especialidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString(){
        return "Guia Turistico: " + super.toString() +
                " | Idioma: " + idioma + " | Especialidad: " + especialidad;
    }
    @Override
    public String registrar(){
        return "Guia registrado en el sistema";
    }
    @Override
    public String mostrarDatos() {
        return "=== GUÍA ===\n" +
                "Nombre: " + getNombre() + " " + getApellido() + "\n" +
                "Especialidad: " + especialidad + "\n" +
                "Idioma: " + idioma;
    }

}
