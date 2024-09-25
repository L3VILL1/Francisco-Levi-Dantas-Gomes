public class JogoPlaystation extends Jogo {

    public JogoPlaystation(int preco, String nome, String genero) {
        super(preco, nome, genero);
    }

    public void iniciar() {
        System.out.println("Iniciando Playstation");
    }
}
