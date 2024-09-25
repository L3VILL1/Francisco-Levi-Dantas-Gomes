public abstract class Jogo {
    private int preco;
    private String nome;
    private String genero;

    public Jogo(int preco, String nome, String genero) {
        this.preco = preco;
        this.nome = nome;
        this.genero = genero;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void iniciar(){

    }
}
