/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;

public class Flota {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public boolean agregar(Vehiculo vehiculo) {
        if (vehiculo == null || vehiculos.contains(vehiculo)) {
            return false;
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.describir());
        }
    }

    public int cantidadCamiones() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                contador++;
            }
        }
        return contador;
    }

    public Vehiculo masEconomico(int pesoKg) {
        Vehiculo economico = null;
        for (Vehiculo v : vehiculos) {
            if (v.getCapacidadKg() >= pesoKg) {
                if (economico == null || v.tarifaPorKm() < economico.tarifaPorKm()) {
                    economico = v;
                }
            }
        }
        return economico;
    }

    public double totalSeguros() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Asegurable) {
                total += ((Asegurable) v).valorSeguro();
            }
        }
        return total;
    }
}
