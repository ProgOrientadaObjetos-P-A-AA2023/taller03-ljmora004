package paquete02;

public class Dispositivo {
    private String sistemaOperativo;
    private double pantalla;
    private double costoInicial;
    private int iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String imei;
    private String dirMac;

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public void establecerSistemaOperativo(String a) {
        sistemaOperativo = a;
    }

    public double obtenerPantalla() {
        return pantalla;
    }

    public void establecerPantalla(double a) {
        pantalla = a;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public void establecerCostoInicial(double a) {
        costoInicial = a;
    }

    public int obtenerIva() {
        return iva;
    }

    public void establecerIva(int a) {
        iva = a;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public void establecerIvaCostoInicial() {
        ivaCostoInicial = (costoInicial * iva)/100;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public void establecerCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }

    public String obtenerImei() {
        return imei;
    }

    public void establecerImei(String a) {
        imei = a;
    }

    public String obtenerDirMac() {
        return dirMac;
    }

    public void establecerDirMac(String a) {
        dirMac = a;
    }
    
    
}
