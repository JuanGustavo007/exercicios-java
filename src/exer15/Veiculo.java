package exer15;

public class Veiculo {

    private String placa;
    private String marca;
    private String cor;

    private boolean carroLigado = false;

    public Veiculo (String placa, String marca, String cor){
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
    }

    public void ligarCarro (){
        if (this.carroLigado){
            System.out.println("Seu carro ja está ligado");
        }else{
            System.out.println("Ligamos o carro e no momento ele se encontra ligado");
            this.carroLigado = true;
        }
    }

    public void desligarCarro(){
        if (this.carroLigado){
            this.carroLigado = false;
            System.out.println("Carro desligado");
        }else{
            System.out.println("Seu carro ja está desligado");
        }
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
