public class FactoryJogo {
    public Jogo criarJogo(int plataforma, int preco, String nome, String genero) {
        Jogo retorno = null;
        if (plataforma == 1) {
            retorno = new JogoPlaystation(preco, nome, genero);
        } else if (plataforma == 2) {
            retorno = new JogoXbox(preco, nome, genero);
        } else {
            retorno = new JogoPc(preco, nome, genero);
        }
        return retorno;
    }

}
