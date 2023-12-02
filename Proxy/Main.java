public class Main {

    // RealSubject / Implementação
    // Proxy
    
    public static void main(String[] args) {
//        
        ProdutoRepository ProdutoRepository = new ProxyLogRepository();
        ProdutoService produtoService = new ProdutoService(ProdutoRepository);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }

}