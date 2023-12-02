package Proxy;

class ProxyImageLoader implements ImageLoader {
    private RealImageLoader realImageLoader;

    public ProxyImageLoader(String imagePath) {
        this.realImageLoader = new RealImageLoader(imagePath);
    }

    public Image loadImage() {
        // Verifica se o usuário tem permissão para carregar imagens de alta resolução
        // Simula a lógica de controle de acesso
        if (UserAuthentication.isUserAuthenticated()) {
            return realImageLoader.loadImage();
        } else {
            System.out.println("Permission denied. Please log in to access high-resolution images.");
            // Retorna uma imagem de baixa resolução ou nula
            return null;
        }
    }
}