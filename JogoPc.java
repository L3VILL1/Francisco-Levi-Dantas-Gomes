public class JogoPc extends Jogo {
    public JogoPc(int preco, String nome, String genero) {
        super(preco, nome, genero);
    }

    public void iniciar() {
        System.out.println("Iniciando Pc");
    }
}
