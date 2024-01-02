// Classe Produto
class Car {
  String _model;
  String _color;
  int _year;
  String _features;

  Car(this._model, this._color, this._year, this._features);

  
  String getcolor() {
     return this._color;
  }

  @override
  String toString() {
    return "Car Model: $_model, Color: $_color, Year: $_year, Features: $_features";
  }
}
