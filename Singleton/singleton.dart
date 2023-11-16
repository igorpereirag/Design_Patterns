class Singleton {
  // Mantenha uma referência à única instância da classe.
  static Singleton? _instance;
  // Construtor privado.
  Singleton._();

  // Método estático para obter a instância do Singleton.
  static Singleton? getInstance(){
    if (_instance == null) {
      _instance = Singleton._(); 
    }
     return _instance;
  }
}
