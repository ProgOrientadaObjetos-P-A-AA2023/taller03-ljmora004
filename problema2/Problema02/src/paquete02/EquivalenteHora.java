package paquete02;

public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    
    public void establecerHoras(int a){
        horas = a;
    }
    
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    
    public void establecerSegundos(){
        segundos = horas * 3600;
    }
    
    public void establecerDias(){
        dias = horas / 24;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public int obtenerSegundos(){
        return segundos;
    }
    
    public int obtenerDias(){
        return dias;
    }
    
}
