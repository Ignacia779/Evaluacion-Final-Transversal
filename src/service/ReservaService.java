package service;

import model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaService {
    private List<Reserva> reservas;

    public ReservaService(){
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public List<Reserva> listaReservas(){
        return reservas;
    }
    public List<Reserva> buscarPorCliente(String nombreCliente){
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas){
            if (r.getCliente().getNombre().equalsIgnoreCase(nombreCliente)){
                resultado.add(r);
            }
        }
        return resultado;
    }
}
