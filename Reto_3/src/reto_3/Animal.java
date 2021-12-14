package reto_3;
public class Animal {
   protected double peso;
   protected double altura;
   protected Alimento  AlimsIngeridos[] = new Alimento[3];
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Alimento[] getAlimentos() {
        return AlimsIngeridos;
    }
    public void setAlimentos(Alimento[] Alimentos) {
        this.AlimsIngeridos = Alimentos;
    }
    public double getIMC() {
       return this.peso/(this.altura*this.altura);
    }
}
