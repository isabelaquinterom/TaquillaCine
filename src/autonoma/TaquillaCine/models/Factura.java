/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

import java.util.Date;

public class Factura {
    private int numeroFactura;
    private Date fechaEmision;
    private Venta venta;
    
    public Factura(Venta venta, int numeroFactura) {
        this.venta = venta;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = new Date(); // Fecha actual
    }
    
    public void imprimirFactura() {
        System.out.println("==============================================");
        System.out.println("FACTURA DE VENTA #" + numeroFactura);
        System.out.println("==============================================");
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Fecha de venta: " + venta.getFecha());
        System.out.println("----------------------------------------------");
        System.out.println("DETALLE DE COMPRA:");
        
        for (Boleta boleta : venta.getBoletas()) {
            System.out.println("\nPELÍCULA: " + boleta.getPelicula().getTitulo());
            System.out.println("SALA: " + boleta.getNumeroSala() + " | ASIENTO: " + boleta.getAsiento());
            System.out.println("FUNCIÓN: " + boleta.getFuncion().getHora());
            System.out.println("CLIENTE: " + boleta.getUsuario().getNombre());
            System.out.println("VALOR: $" + String.format("%.2f", boleta.getCostoFinal()));
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", venta.getTotalVenta()));
        System.out.println("==============================================");
        System.out.println("¡Gracias por su compra!");
    }
    
    public int getNumeroFactura() {
        return numeroFactura;
    }
    
    public Date getFechaEmision() {
        return fechaEmision;
    }
    
    public Venta getVenta() {
        return venta;
    }
}