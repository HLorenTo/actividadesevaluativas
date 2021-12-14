package reto_3;
public class Gorila extends Animal{
    public Gorila(double peso, double altura) {    
        this.peso = peso;
        this.altura = altura;
    }
    public void setAlimsIngeridos(Alimento[] alimentos) {
        this.AlimsIngeridos = alimentos;
    }
    public double getPesoAlims(){
        double suma = 0.0;
        for (int i= 0; i< this.AlimsIngeridos.length;i++){
            suma += this.AlimsIngeridos[i].getGramos();
    }
    int sumatoria = (int)suma;
    return sumatoria;
    }    
    @Override
    public double getIMC(){
        return super.getIMC();
    }
    
    }
//reto plataforma 

public class Gorila extends Animal{
public Gorila(double peso, double altura) {    
        this.peso = peso;
        this.altura = altura;
    }
    public void setAlimsIngeridos(Alimento[] alimentos) {
        this.alimsIngeridos = alimentos;
    }
    public double getPesoAlims(){
        double suma = 0.0;
        for (int i= 0; i< this.alimsIngeridos.length;i++){
            suma += this.alimsIngeridos[i].getGramos();
    }
    int sumatoria = (int)suma;
    return sumatoria;
    }
    @Override
    public double getIMC(){
        return super.getIMC();
    }
}