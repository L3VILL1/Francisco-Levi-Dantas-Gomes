import java.util.*;

public class GUI {
    public static void main(String[] args) throws Exception {
        Colecao colecao = new Colecao();
        Scanner input = new Scanner(System.in);
        String nome;
        String nomealterado;
        Jogo jogoAlterado;
        String genero;
        int plataforma;
        int preco;
        boolean loop = true;
        while (loop == true) {
            System.out.println(" [1] Adicionar jogo na coleção\n [2] Atualizar colecao\n [3] Ver coleção inteira\n [4] Ver detalhes de jogo\n [5] Remover jogo\n [6] Sair do programa");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Qual a plataforma? \n [1] Playstation\n [2] Xbox\n [3] Pc");
                    plataforma = input.nextInt();
                    System.out.println("Nome:");
                    nome = input.next();
                    System.out.println("Preco:");
                    preco = input.nextInt();
                    System.out.println("Gênero:");
                    genero = input.next();
                    colecao.adicionarJogo(plataforma, preco, nome, genero);
                    break;
                case 2:
                    if (colecao.IsEmpty()==true){
                        System.out.println("Você não tem nenhum jogo.");
                        break;
                    }
                    System.out.println("Qual jogo você deseja alterar?");
                    nomealterado = input.next();
                    if (colecao.retornarJogo(nomealterado)==null){
                        System.out.println("Você não possui esse jogo.");
                        break;
                    }
                    colecao.lerJogo(nomealterado);
                    jogoAlterado = colecao.retornarJogo(nomealterado);
                    System.out.println("Qual a plataforma do novo jogo? \n [1] Playstation\n [2] Xbox\n [3] Pc");
                    plataforma = input.nextInt();
                    System.out.println("O que você deseja alterar?\n [1] Nome\n [2] Preço\n [3] Gênero");
                    int y = input.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("Nome:");
                            nome = input.next();
                            colecao.atualizarcolecao(nomealterado, plataforma, jogoAlterado.getPreco(), nome, jogoAlterado.getGenero());
                            break;
                        case 2:
                            System.out.println("Preco:");
                            preco = input.nextInt();
                            colecao.atualizarcolecao(nomealterado, plataforma, preco, jogoAlterado.getNome(), jogoAlterado.getGenero());
                            break;
                        case 3:
                            System.out.println("Gênero:");
                            genero = input.next();
                            colecao.atualizarcolecao(nomealterado, plataforma, jogoAlterado.getPreco(), jogoAlterado.getNome(), genero);
                            break;

                        default:
                            break;
                    }
                case 3:
                    colecao.lercolecao();
                    break;
                case 4:
                    System.out.println("Nome do jogo:");
                    nome = input.next();
                    colecao.lerJogo(nome);
                    break;
                case 5:
                    System.out.println("Qual jogo você deseja remover?");
                    nome = input.next();
                    colecao.removerJogo(nome);
                    break;
                case 6:
                    loop = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        input.close();
    }
}