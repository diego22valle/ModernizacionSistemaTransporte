/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author USUARIO
 */
public class BusArticulado implements SistemaTarifario{

    @Override
    public double calcularTarifa(int distancia) {
        if(distancia<0){
            throw new IllegalArgumentException("La distancia no puede ser negativa");
            } 
            return 2950;
            
        }
        
    

    @Override
    public String mostrarRuta() {
        return "Ruta troncal (estándar de $2950 COP)";
    }
    
}
