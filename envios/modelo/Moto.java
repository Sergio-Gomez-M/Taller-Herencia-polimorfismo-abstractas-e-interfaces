/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Hp
 */
public class Moto extends Vehiculo implements Asegurable {        //Herencia
    private int cilindraje;

    public Moto(String placa, int capacidadKg, int cilindraje) {
        super(placa, capacidadKg);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override        //Polimorfismo
    public String describir() {
        return super.describir() + ", moto de " + cilindraje + " cc";
    }

    @Override
    public double tarifaPorKm() {
        return 1200;
    }

    @Override
    public double valorSeguro() {
        return 80000 + cilindraje * 500;
    }
}
