package model;
import java.time.LocalDate;

public class Reserva implements Registrable{
    private Cliente cliente;
    private GuiaTuristico guiaTuristico;
    private Proveedor proveedor;
    private LocalDate fecha;
    private int cantidadPersona;

    public Reserva() {
    }

    public Reserva(Cliente cliente, GuiaTuristico guiaTuristico, Proveedor proveedor, LocalDate fecha, int cantidadPersona) {
        this.cliente = cliente;
        this.guiaTuristico = guiaTuristico;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.cantidadPersona = cantidadPersona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public GuiaTuristico getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(GuiaTuristico guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", guiaTuristico=" + guiaTuristico +
                ", proveedor=" + proveedor +
                ", fecha=" + fecha +
                ", cantidadPersona=" + cantidadPersona +
                '}';
    }
    @Override
    public String registrar(){
        return "Reserva registrada en el sistema";
    }
    @Override
    public String mostrarDatos() {
        return "=== RESERVA ===\n" +
                "Cliente: " + cliente.getNombre() + "\n" +
                "Guía: " + guiaTuristico.getNombre() + "\n" +
                "Proveedor: " + proveedor.getNombre() + "\n" +
                "Fecha: " + fecha + "\n" +
                "Personas: " + cantidadPersona;
}
}
