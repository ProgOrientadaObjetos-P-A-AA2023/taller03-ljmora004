package paquete02;

public class Terreno {

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double a) {
        ancho = a;
    }

    public void establecerLargo(double a) {
        largo = a;
    }

    public void establecerValorMetroCuadrado(double a) {
        valorMetroCuadrado = a;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerCostoTerreno() {
        costo_terreno = valorMetroCuadrado * area;
    }

    public double obtenerCosto_terreno() {
        return costo_terreno;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

}
