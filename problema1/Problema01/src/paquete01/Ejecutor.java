package paquete01;

import paquete02.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno terreno01 = new Terreno();
        Terreno terreno02 = new Terreno();
        
        terreno01.establecerValorMetroCuadrado(89.66);
        terreno01.establecerAncho(356.2);
        terreno01.establecerLargo(756.47);
        terreno01.establecerArea();
        terreno01.establecerCostoTerreno();
        
        terreno02.establecerValorMetroCuadrado(55.10);
        terreno02.establecerAncho(156.21);
        terreno02.establecerLargo(411.33);
        terreno02.establecerArea();
        terreno02.establecerCostoTerreno();
        
        System.out.printf("\nEl terreno N°1 tiene un costo de: $%.2f\n"
                + "---Datos---\n"
                + "Valor por metro cuadrado:\t$%.2f\n"
                + "Ancho:\t%.2f m\nLargo:\t%.2f m\nÁrea:\t%.2f m^2\n",
                terreno01.obtenerCosto_terreno(), 
                terreno01.obtenerValorMetroCuadrado(),
                terreno01.obtenerAncho(),
                terreno01.obtenerLargo(),
                terreno01.obtenerArea());
        
        System.out.printf("\nEl terreno N°2 tiene un costo de: $%.2f\n"
                + "---Datos---\n"
                + "Valor por metro cuadrado:\t$%.2f\n"
                + "Ancho:\t%.2f m\nLargo:\t%.2f m\nÁrea:\t%.2f m^2\n",
                terreno02.obtenerCosto_terreno(), 
                terreno02.obtenerValorMetroCuadrado(),
                terreno02.obtenerAncho(),
                terreno02.obtenerLargo(),
                terreno02.obtenerArea());
    }
    
}
