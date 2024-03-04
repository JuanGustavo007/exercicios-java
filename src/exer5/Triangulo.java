package exer5;

public class Triangulo {

    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo (float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area (){
        double conta = (Math.pow(this.lado1, 2) * Math.sqrt(this.lado2)) / 4;
        return conta;
    }

    public double perimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
}
