package exerc9;

public abstract class Animal {
    private String nome;
    private String especie;

    public Animal (String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return this.especie;
    }

    public String emitirSom(String especie){
        try{
            if (especie == "cat"){
                return "Miauuuuuuuuuuuuu";
            }else if (especie == "dog"){
                return "AuAu";
            }else{
                return "Sem classificação";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return especie;
    }

    @Override
    public String toString() {
        return "O nome da espécie é " + this.nome + " E sua especie é " + this.especie;
    }
}
