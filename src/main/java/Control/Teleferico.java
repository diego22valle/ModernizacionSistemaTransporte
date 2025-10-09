/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author USUARIO
 */
public class Teleferico implements SistemaTarifario{

    @Override
    public double calcularTarifa(int distancia) {
        if(distancia < 0){
        throw new IllegalArgumentException("La distancia no puede ser negativa");
        }
        return 1000 + (distancia * 500);    
        }

    @Override
    public String mostrarRuta() {
        return "Ruta de conexión veredal (tarifa variable, base $1000 COP";
    }   
}

