/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;

/**
 *
 * @author Hp
 */
import envios.modelo.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("MZL12A", 20, 150);
        Camion c1 = new Camion("WFT345", 8000, 2);

        System.out.println(m1.describir());
        System.out.println(c1.describir());
        System.out.println(m1.getPlaca());
        System.out.println(c1.getEjes());
        System.out.println(m1 instanceof Vehiculo);

        Moto m2 = new Moto("KJH78B", 25, 200);
        Flota flota = new Flota("Envíos Caldas");

        flota.agregar(m1);
        flota.agregar(c1);
        flota.agregar(m2);
        System.out.println(flota.agregar(m1));

        flota.mostrar();
        System.out.println(flota.cantidadCamiones());

        System.out.println(m1.costoEnvio(12));
        System.out.println(c1.costoEnvio(12));

        Bicicleta b1 = new Bicicleta("BIC001", 10);
        flota.agregar(b1);
        flota.mostrar();

        Vehiculo econ8 = flota.masEconomico(8);
        Vehiculo econ22 = flota.masEconomico(22);
        Vehiculo econ500 = flota.masEconomico(500);
        Vehiculo econ9000 = flota.masEconomico(9000);

        System.out.println(econ8 != null ? econ8.getPlaca() : "null");
        System.out.println(econ22 != null ? econ22.getPlaca() : "null");
        System.out.println(econ500 != null ? econ500.getPlaca() : "null");
        System.out.println(econ9000 != null ? econ9000.getPlaca() : "null");

        System.out.println(m1.valorSeguro());
        System.out.println(c1.valorSeguro());
        System.out.println(flota.totalSeguros());

        ArrayList<Asegurable> asegurables = new ArrayList<>();
        asegurables.add(c1);
        asegurables.add(new Bodega("Bodega Chipre", 300));

        double sumaAsegurables = 0;
        for (Asegurable a : asegurables) {
            System.out.println(a.valorSeguro());
            sumaAsegurables += a.valorSeguro();
        }
        System.out.println(sumaAsegurables);
    }
}