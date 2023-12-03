package Proxy;

public class Main {
    // RealSubject / Implementação
    // Proxy
    public static void main(String[] args) {
        //
        ProxyLogRepository proxyLogRepository = new ProxyLogRepository();
        ProdutoService produtoService = new ProdutoService(proxyLogRepository);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }

}