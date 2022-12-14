import java.util.Scanner;

public class CadastroProdutos {

    private BinaryTree<Produto> produtos;

    //construtor
    public CadastroProdutos(){
        this.produtos = new BinaryTree<>();
    }

    public void cadastrarUmProduto(Produto cadastrar){
        if(produtos.procurar(cadastrar) != null){
            System.out.println("Produto já existente");
        }
        else{
            produtos.insert(cadastrar);
        }
        
    }

    public void exibirInfoCrescente(){
        produtos.exibirOrdenado();
    }

    public Produto procurarPorProduto(String codigoProduto){
        Produto produtoProcurado = new Produto(codigoProduto);
        
        return produtos.procurar(produtoProcurado);
    }

    public void alterarValorProduto(String codigoProduto){
        Scanner scan = new Scanner(System.in);
        double valorNovo;

        System.out.println("Digite o novo valor do produto: ");
        valorNovo = scan.nextDouble(); scan.nextLine();
        procurarPorProduto(codigoProduto).setPreco(valorNovo);;

    }

    public void alterarEstoqueProduto(String codigoProduto){
        Scanner scan = new Scanner(System.in);
        int estoqueNovo;

        System.out.println("Digite o novo estoque do produto: ");
        estoqueNovo = scan.nextInt(); scan.nextLine();
        procurarPorProduto(codigoProduto).setEstoque(estoqueNovo);
    }

    public void exibirInfoProduto(String codigoProduto){
        Produto info;
        info = procurarPorProduto(codigoProduto);
        System.out.println(info);
    }

    public void remover(String codigoProduto){
        Produto produtoProcurado = new Produto(codigoProduto);
        produtos.remove(produtoProcurado);
    }
}
