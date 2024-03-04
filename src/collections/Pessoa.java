package collections;

public class Pessoa implements interfaceteste, Comparable{

    private String nome;
    private int idade;
    public String escola = interfaceteste.ESCOLA;

    public Pessoa(String nome, int idade){
        this.idade  = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public static String metodo(){
        return interfaceteste.ESCOLA;
    }
    @Override
    public int retorno() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Pessoa auxi = (Pessoa)o;
       if (auxi.idade > this.idade){
           return -1;
       }else if (auxi.idade < this.idade) {
            return 1;
       }else{
           return 0;
       }
    }
}
