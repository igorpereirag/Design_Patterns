package Bridge;

class Circulo extends Forma {
    public Circulo(Cor cor) {
        super(cor); // Chama o construtor da classe base (Forma) com o argumento 'cor'
    }

    @Override
    void desenhar() {
        System.out.print("Desenhando círculo. ");
        cor.aplicarCor();
    }
}
