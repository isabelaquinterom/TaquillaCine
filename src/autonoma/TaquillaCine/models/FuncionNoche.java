/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author Asus Isabela Quintero 
 * 
 */
public class FuncionNoche extends Funcion {
    public FuncionNoche(String hora) {
        super(hora);
        calcularDescuentoFuncion();
    }
    
    @Override
    public void calcularDescuentoFuncion() {
        // Las funciones de noche no tienen descuento
        this.porcentajeDescuento = 0.0;
    }
    
    @Override
    public String toString() {
        return "Función Noche - Hora: " + hora + " - Descuento: " + (porcentajeDescuento * 100) + "%";
    }
}

