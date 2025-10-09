/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modernizacionsistematransporte;
import Control.*;
/**
 *
 * @author USUARIO
 */
public class ModernizacionSistemaTransporte {

    public static void main(String[] args) {
       BusArticulado bus = new BusArticulado();
       Teleferico teleferico = new Teleferico();
       CentralControl central = new CentralControl();
        System.out.println("Ejemplo con el bus---");
        central.procesarViaje(bus, 41);
        System.out.println("Ejemplo con el teleferico---");
        central.procesarViaje(teleferico, 2);
    }
}
