import java.util.HashMap;

public class Colecao {
	private HashMap<String, Jogo> jogos;

	public Colecao() {
		jogos = new HashMap<String, Jogo>();
	}

	public void adicionarJogo(int plataforma, int preco, String nome, String genero) {
		FactoryJogo fabrica = new FactoryJogo();
		Jogo jogo = fabrica.criarJogo(plataforma, preco, nome, genero);
		jogos.put(nome, jogo);
	}
	
	public Jogo retornarJogo(String nome){
		return jogos.get(nome);
	}

	public boolean IsEmpty(){
		return jogos.isEmpty();
	}

	public void lerJogo(String nome) {
		if (jogos.containsKey(nome)==false){
			System.out.println("Você não possui esse jogo.");
		} else{
			Jogo jogo = jogos.get(nome);
			System.out.println("Nome do Jogo: " + jogo.getNome());
			System.out.println("Preço: " + jogo.getPreco());
			System.out.println("Gênero: " + jogo.getGenero());
			System.out.println("--------------------------");
		}
	}

	public void lercolecao() {
		if (jogos.isEmpty()==true){
			System.out.println("Você não tem nenhum jogo.");
		} else{
			for (HashMap.Entry<String, Jogo> entrada : jogos.entrySet()) {
                String nome = entrada.getKey();
                System.out.println("Nome do Jogo: " + nome);
                System.out.println("-------------");
            }
		}

	}

	public void removerJogo(String nome) {
		jogos.remove(nome);
		System.out.println(nome + " removido!");
	}

	public void atualizarcolecao(String nomealterado, int plataforma, int preco, String nome, String genero) {
		removerJogo(nomealterado);
		adicionarJogo(plataforma, preco, nome, genero);
		System.out.println("Jogo Atualizado!");
	}
}
