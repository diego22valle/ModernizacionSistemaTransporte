/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.text.DecimalFormat;
/**
 *
 * @author USUARIO
 */
public class CentralControl {
    DecimalFormat formato = new DecimalFormat("#,###.00");
    
    public void procesarViaje(SistemaTarifario vehiculo, int km){
        try{
        System.out.println(formato.format(vehiculo.calcularTarifa(km)));
        System.out.println(vehiculo.mostrarRuta());
        } catch (IllegalArgumentException e){
            System.out.println(""+e.getMessage());
        }
    
}
}
