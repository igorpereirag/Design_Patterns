
import 'car.dart';

class CarBuilder {
  String _model = " ";
  String _color = " ";
  int _year = 0 ;
  String _features = " ";

  CarBuilder setModel(String model) {
    this._model = model;
    return this;
  }

  CarBuilder setColor(String color) {
    this._color = color;
    return this;
  }

  CarBuilder setYear(int year) {
    this._year = year;
    return this;
  }

  CarBuilder setFeatures(String features) {
    this._features = features;
    return this;
  }
  
    Car build() {
    return Car(_model, _color, _year, _features);
  }
}