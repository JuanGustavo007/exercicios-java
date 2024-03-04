package exerc8;

public class Livro {

    private String tituloLivro;
    private String autor;
    private String anoPublicacao;

    private boolean livroEmprestado = false;

    public boolean isLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(boolean livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public Livro(String tituloLivro, String autor, String anoPublicacao){
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void emprestarLivro(){
        if (!this.livroEmprestado){
            System.out.println("Livro emprestado");
            this.livroEmprestado = true;
        }else{
            System.out.println("É necessário que o livro não esteja emprestado");
        }
    }

    public void devolverLivro (){
        if (this.livroEmprestado){
            System.out.println("Livro devolvido");
            this.livroEmprestado = false;
        }else{
            System.out.println("Para devolver um livro é necessário que ele esteja emprestado");
        }
    }


    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
