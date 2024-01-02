package Criacionais.Factory;

public class Main {
    public static void main(String[] args) {
        FactoryDeVeiculos fabrica = new FactoryDeVeiculos();
        Veiculo veiculo1 = fabrica.criarVeiculo("carro");
        Veiculo veiculo2 = fabrica.criarVeiculo("aviao");
        Veiculo veiculo3 = fabrica.criarVeiculo("barco");

        veiculo1.mover();  // Saída: Carro está se movendo na estrada.
        veiculo2.mover();  // Saída: Avião está voando no céu.
        veiculo3.mover();  // Saída: Barco está navegando na água.
    }
}