package autonoma.TaquillaCine.models;

public abstract class Funcion {
    protected String hora;
    protected double porcentajeDescuento;
    
    public Funcion(String hora) {
        this.hora = hora;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    // Método abstracto que deben implementar las clases hijas
    public abstract void calcularDescuentoFuncion();
}