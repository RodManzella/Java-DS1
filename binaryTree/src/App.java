import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroProdutos cadastroDeProdutos = new CadastroProdutos();
        int escolha;

        do{
            mostrarOpcoes();
            escolha = scan.nextInt(); scan.nextLine();

            if(escolha == 1){
                System.out.println("Digite o código do produto: ");
                String cod = scan.nextLine();

                System.out.println("Digite a descrição do produto: ");
                String descricao = scan.nextLine();

                System.out.println("Digite o fornecedor do produto: ");
                String fornecedor = scan.nextLine();

                System.out.println("Digite o preço do produto");
                Double preco = scan.nextDouble(); scan.nextLine();

                System.out.println("Digite a quantidade inicial desse produto");
                int qtd = scan.nextInt(); scan.nextLine();

                Produto novoProduto = new Produto(cod, descricao, fornecedor, escolha, qtd);
                cadastroDeProdutos.cadastrarUmProduto(novoProduto);
            }
            else if(escolha == 2){
                cadastroDeProdutos.exibirInfoCrescente();
            }
            else if(escolha == 3){
                System.out.println("Digite o código do produto procurado");
                String codigoProduto = scan.nextLine();
                
                Produto procurado = cadastroDeProdutos.procurarPorProduto(codigoProduto);
                if(procurado != null){
                    System.out.println("O produto "+procurado.getDescricao()+" foi encontrado!");
                }
                else{
                    System.out.println("Não foi encontrado!");
                }
            }
            else if(escolha == 4){
                System.out.println("Digite o código do produto que deseja alterar o preço");
                String codigoProduto = scan.nextLine();
                cadastroDeProdutos.alterarValorProduto(codigoProduto);
            }
            else if(escolha == 5){
                System.out.println("Digite o código do produto que deseja alterar o estoque");
                String codigoProduto = scan.nextLine();
                cadastroDeProdutos.alterarEstoqueProduto(codigoProduto);
            }
            else if(escolha == 6){
                System.out.println("Digite o código do produto que deseja exibir informações");
                String codigoProduto = scan.nextLine();
                cadastroDeProdutos.exibirInfoProduto(codigoProduto);
            }
            else if(escolha == 7){
                System.out.println("Digite o código do produto que deseja remover");
                String codigoProduto = scan.nextLine();
                cadastroDeProdutos.remover(codigoProduto);
            }
            else{
                System.out.println("Programa encerrado!");
                return;
            }


        }while(escolha != 0);
    }

    public static void mostrarOpcoes(){
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Exibir informações de todos os produtos");
        System.out.println("3 - Procurar por produto");
        System.out.println("4 - Alterar preço de produto");
        System.out.println("5 - Alterar estoque de produto");
        System.out.println("6 - Exibir informações de um produto");
        System.out.println("7 - Remover um produto");
        System.out.println("0 - Encerrar programa");
    }
}
