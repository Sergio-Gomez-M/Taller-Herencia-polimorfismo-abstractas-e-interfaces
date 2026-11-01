/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Hp
 */
public abstract class Vehiculo {    //Abstraccion
    private String placa;         //Encapsulamiento
    private int capacidadKg;

    public Vehiculo(String placa, int capacidadKg) {
        this.placa = placa;
        this.capacidadKg = capacidadKg;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidadKg() {
        return capacidadKg;
    }

    public String describir() {
        return placa + " (" + capacidadKg + " kg)";
    }

    public abstract double tarifaPorKm();

    public double costoEnvio(double km) {
        return km * tarifaPorKm();
    }

    public double costoEnvio(double km, boolean urgente) {
        double costoBase = costoEnvio(km);
        if (urgente) {
            return costoBase * 1.5;
        }
        return costoBase;
    }
}