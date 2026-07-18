package app;

import model.*;
import service.ReservaService;
import ui.LectorClientes;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = LectorClientes.cargarClientes("data/clientes.txt");

        for (Cliente c : clientes) {
            System.out.println(c);
        }

        //Crear Direccion y contacto
        Direccion direccionCliente = new Direccion("Los Roble", 34, "Puerto Varas", "los Lagos");
        Contacto contactoCliente = new Contacto("912345678", "cliente@gmail.com");

        Direccion direccionGuia = new Direccion("Av. del Mar", 170, "Puerto Montt", "los Lagos");
        Contacto contactoguia = new Contacto("987654321", "guia@gmail.com");

        Direccion direccionProveedor = new Direccion("Camino Central", 405, "Frutillar, ", "Los Lagos");
        Contacto contactoproveedor = new Contacto("943218765", "proveedor@gmail.com");

        // Crear objetos
        Cliente cliente = new Cliente("Mario", "Lopez", direccionCliente, contactoCliente, "Cultural");
        GuiaTuristico guiaTuristico = new GuiaTuristico("Pedro", "Gonzalez", direccionGuia, contactoCliente, "Ingles", "Cultural");
        Proveedor proveedor = new Proveedor("Ana", "Perez", direccionProveedor,contactoproveedor, "Transporte");

        //Crear reserva
        Reserva reserva = new Reserva(cliente, guiaTuristico, proveedor, LocalDate.of(2026, 7,20), 3);
        Reserva reserva2 = new Reserva(cliente, guiaTuristico, proveedor, LocalDate.of(2026, 8 , 5),5);


        //Mostrar datos
        System.out.println("=== CLIENTE ===");
        System.out.println(cliente.mostrarDatos());
        System.out.println();

        System.out.println(guiaTuristico.mostrarDatos());
        System.out.println();

        System.out.println(proveedor.mostrarDatos());
        System.out.println();

        System.out.println(reserva.mostrarDatos());
        System.out.println();

        //Usar ReservaService
        ReservaService reservaService = new ReservaService();
        reservaService.agregarReserva(reserva);
        reservaService.agregarReserva(reserva2);


        //Mostrar reservas
        System.out.println("Listado de reservas: ");
        for (Reserva r : reservaService.listaReservas()){
            System.out.println(r.mostrarDatos());
        }


    }
}