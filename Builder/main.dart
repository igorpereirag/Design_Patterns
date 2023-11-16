import 'car.dart';
import 'carbuilder.dart';

void main() {
  // Usando o padrão Builder para construir um carro
  Car car1 = CarBuilder()
      .setModel("vermelho")
      .setColor("yellow")
      
      .setFeatures("GPS, Leather Seats")
      .build();
  Car car2 = CarBuilder().build();

  print(car1);
  print(car2);
  print(car1 != car2);
}
