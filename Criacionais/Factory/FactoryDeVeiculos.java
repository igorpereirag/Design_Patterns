package Criacionais.Factory;

class FactoryDeVeiculos {
    Veiculo criarVeiculo(String tipo) {
        switch (tipo) {
            case "carro":
                return new Carro();
            case "aviao":
                return new Aviao();
            case "barco":
                return new Barco();
            default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido.");
        }
    }
}