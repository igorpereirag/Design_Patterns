package Proxy;

// Classe concreta que implementa o serviço de carregamento de imagens
class RealImageLoader implements ImageLoader {
    private String imagePath;

    public RealImageLoader(String imagePath) {
        this.imagePath = imagePath;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        // Simula o carregamento real da imagem do disco
        System.out.println("Loading high-resolution image from disk: " + imagePath);
    }

    public Image loadImage() {
        // Simula o carregamento real da imagem
        System.out.println("Loading image: " + imagePath);
        // Retorna a imagem real (não implementado aqui)
        return null;
    }
}