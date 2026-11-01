/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Hp
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(String placa, int capacidadKg) {
        super(placa, capacidadKg);
    }

    @Override
    public String describir() {
        return super.describir() + ", bicicleta eléctrica";
    }

    @Override
    public double tarifaPorKm() {
        return 600;
    }
}
