package paquete01;

import paquete02.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {

        EquivalenteHora hora01 = new EquivalenteHora();
        EquivalenteHora hora02 = new EquivalenteHora();
        
        hora01.establecerHoras(456);
        hora01.establecerMinutos();
        hora01.establecerSegundos();
        hora01.establecerDias();
        
        hora02.establecerHoras(1056);
        hora02.establecerMinutos();
        hora02.establecerSegundos();
        hora02.establecerDias();
        
        System.out.printf("\n%d hora/s son:\n"
                + ">>\t%d minutos\n"
                + ">>\t%d segundos\n"
                + ">>\t%d día/s\n",
                hora01.obtenerHoras(), 
                hora01.obtenerMinutos(),
                hora01.obtenerSegundos(),
                hora01.obtenerDias());
        
        System.out.printf("\n%d hora/s son:\n"
                + ">>\t%d minutos\n"
                + ">>\t%d segundos\n"
                + ">>\t%d día/s\n",
                hora02.obtenerHoras(), 
                hora02.obtenerMinutos(),
                hora02.obtenerSegundos(),
                hora02.obtenerDias());
    }
    
}
