package Bridge;

public class Main {
    public static void main(String[] args) {
        Cor vermelho = new Vermelho();
        Cor verde = new Verde();

        Forma circuloVermelho = new Circulo(vermelho);
        Forma quadradoVerde = new Quadrado(verde);

        circuloVermelho.desenhar();
        quadradoVerde.desenhar();
    }
}