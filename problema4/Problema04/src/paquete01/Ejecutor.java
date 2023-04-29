package paquete01;
 
import paquete02.Dispositivo;

public class Ejecutor {
    
    public static void main(String[] args) {
       
        Dispositivo dis01 = new Dispositivo();
        Dispositivo dis02 = new Dispositivo();
        
        dis01.establecerSistemaOperativo("IOS");
        dis01.establecerPantalla(6.7);
        dis01.establecerImei("45564fg68sd24");
        dis01.establecerDirMac("adda45453a35v354");
        dis01.establecerCostoInicial(1233.56);
        dis01.establecerIva(14);
        dis01.establecerIvaCostoInicial();
        dis01.establecerCostoFinal();
        
        dis02.establecerSistemaOperativo("Android");
        dis02.establecerPantalla(5.5);
        dis02.establecerImei("3564gh48s615f");
        dis02.establecerDirMac("26ad6fas4jkm461518");
        dis02.establecerCostoInicial(699.99);
        dis02.establecerIva(23);
        dis02.establecerIvaCostoInicial();
        dis02.establecerCostoFinal();
        
        
        System.out.printf("""
                          
                          -------------Dispositivo_01-------------
                            OS:                 '%s'
                            Pantalla:           %.2f´
                            IMEI:               %s
                            Dirección MAC:      %s
                            Costo Inicial:      $%.2f
                            IVA:                %d porciento
                            Costo Inicial IVA:  $%.2f
                            Costo Final:        $%.2f
                          ----------------------------------------
                          """,
                dis01.obtenerSistemaOperativo(),
                dis01.obtenerPantalla(),
                dis01.obtenerImei(),
                dis01.obtenerDirMac(),
                dis01.obtenerCostoInicial(),
                dis01.obtenerIva(),
                dis01.obtenerIvaCostoInicial(),
                dis01.obtenerCostoFinal());
        
        System.out.printf("""
                          
                          -------------Dispositivo_02-------------
                            OS:                 '%s'
                            Pantalla:           %.2f´
                            IMEI:               %s
                            Dirección MAC:      %s
                            Costo Inicial:      $%.2f
                            IVA:                %d porciento
                            Costo Inicial IVA:  $%.2f
                            Costo Final:        $%.2f
                          ----------------------------------------
                          """,
                dis02.obtenerSistemaOperativo(),
                dis02.obtenerPantalla(),
                dis02.obtenerImei(),
                dis02.obtenerDirMac(),
                dis02.obtenerCostoInicial(),
                dis02.obtenerIva(),
                dis02.obtenerIvaCostoInicial(),
                dis02.obtenerCostoFinal());
        
    }
    
}
