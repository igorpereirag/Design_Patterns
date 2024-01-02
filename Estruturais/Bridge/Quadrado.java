package Bridge;


class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor); // Chama o construtor da classe base (Forma) com o argumento 'cor'
    }

    @Override
    void desenhar() {
        System.out.print("Desenhando quadrado. ");
        cor.aplicarCor();
    }
}