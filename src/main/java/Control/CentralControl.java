/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author USUARIO
 */
public class CentralControl {
    public void procesarViaje(SistemaTarifario vehiculo, int km){
        System.out.println(vehiculo.calcularTarifa(km));
        System.out.println(vehiculo.mostrarRuta());
    }
    
}
