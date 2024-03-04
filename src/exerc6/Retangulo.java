package exerc6;

public class Retangulo {

    private int base;
    private int altura;

    public Retangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float area() throws Exception{
        return (this.base / this.altura);
    }

    public float perimetro (){
        return 2 * ( this.base + this.altura) ;
    }
}
