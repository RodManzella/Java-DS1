import java.util.Scanner;

public class CadastroProdutos {

    private BinaryTree<Produto> produtos;

    //construtor
    public CadastroProdutos(){
        this.produtos = new BinaryTree<>();
    }

    public void cadastrarUmProduto(Produto cadastrar){
        produtos.insert(cadastrar);
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
        Produto produtoProcurado = new Produto(codigoProduto);

        System.out.println("Digite o novo valor do produto: ");
        valorNovo = scan.nextDouble(); scan.nextLine();
        produtos.procurar(produtoProcurado).setPreco(valorNovo);

    }

    public void alterarEstoqueProduto(String codigoProduto){
        Scanner scan = new Scanner(System.in);
        double estoqueNovo;
        Produto produtoProcurado = new Produto(codigoProduto);

        System.out.println("Digite o novo estoque do produto: ");
        estoqueNovo = scan.nextDouble(); scan.nextLine();
        produtos.procurar(produtoProcurado).setPreco(estoqueNovo);

    }






}
