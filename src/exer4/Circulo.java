package exer4;

public class Circulo {
    private float raio;
    private final float pi = 3.14f;

    public Circulo (float raio){
        this.raio = raio;
    }

    public float getRaio (){
        return this.raio = raio;
    }

    public void setRaio (float raio){
        this.raio = raio;
    }

    public double calcularRaio (){
        return Math.pow(this.raio, 2) * Math.PI;
    }
}
