package paquete01;

import paquete02.Institucion;

public class Ejecutor {

    public static void main(String[] args) {
        
        Institucion instituto01 = new Institucion();
        Institucion instituto02 = new Institucion();
        
        instituto01.establecerNombre("Daniel Álvarez Burneo");
        instituto01.establecerTipo("Fiscomisional");
        instituto01.establecerNroSedes(2);
        instituto01.establecerNroAlumnos(3200);
        instituto01.establecerNroDocentes(1050);
        instituto01.establecerGastoEstudiante(53);
        instituto01.establecerPresupuesto();
        
        instituto02.establecerNombre("Eugenio Espejo");
        instituto02.establecerTipo("Particular");
        instituto02.establecerNroSedes(1);
        instituto02.establecerNroAlumnos(1032);
        instituto02.establecerNroDocentes(423);
        instituto02.establecerGastoEstudiante(223);
        instituto02.establecerPresupuesto();
        
        System.out.printf("""
                          
                          +---------------------------------------------------+
                           Instituto:            %s                          
                           Tipo:                 %s                          
                           N° Sedes:             %d                          
                           N° Alumnos:           %d                          
                           N° Docentes:          %d                          
                           Gasto x Estudiante:   $%.2f                       
                           Presupuesto:          $%.2f                       
                          +---------------------------------------------------+
                          """,
                instituto01.obtenerNombre(),
                instituto01.obtenerTipo(),
                instituto01.obtenerNroSedes(),
                instituto01.obtenerNroAlumnos(),
                instituto01.obtenerNroDocentes(),
                instituto01.obtenerGastoEstudiante(),
                instituto01.obtenerPresupuesto());
        
        System.out.printf("""
                          
                          +---------------------------------------------------+
                           Instituto:            %s                          
                           Tipo:                 %s                          
                           N° Sedes:             %d                          
                           N° Alumnos:           %d                          
                           N° Docentes:          %d                          
                           Gasto x Estudiante:   $%.2f                       
                           Presupuesto:          $%.2f                       
                          +---------------------------------------------------+
                          """,
                instituto02.obtenerNombre(),
                instituto02.obtenerTipo(),
                instituto02.obtenerNroSedes(),
                instituto02.obtenerNroAlumnos(),
                instituto02.obtenerNroDocentes(),
                instituto02.obtenerGastoEstudiante(),
                instituto02.obtenerPresupuesto());
    }
    
}
