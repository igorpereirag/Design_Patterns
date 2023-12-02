package Proxy;

public class ProxyRealWorldExample {
    public static void main(String[] args) {
        // Usando o Proxy para acessar o serviço de carregamento de imagens
        ImageLoader imageLoader = new ProxyImageLoader("example.jpg");

        // A chamada para loadImage() será delegada ao RealImageLoader através do Proxy
        Image image = imageLoader.loadImage();

        // Realiza operações com a imagem (não implementado aqui)
    }
}