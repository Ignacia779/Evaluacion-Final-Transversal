package ui;

import java.io.*;
import java.util.ArrayList;
import model.Cliente;
import model.Contacto;
import model.Direccion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static model.Cliente.*;

public class LectorClientes {
    public static ArrayList<Cliente> cargarClientes(String rutaArchivo) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/clientes.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 9) {
                    Cliente c = new Cliente(
                            datos[0], datos[1],
                            new Direccion(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5]),
                            new Contacto(datos[6], datos[7]),
                            datos[8]
                    );
                    listaClientes.add(c);
                } else {
                    System.out.println("Línea inválida: " + linea + " (tiene " + datos.length + " columnas)");
                }

            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return listaClientes;
    }
}
