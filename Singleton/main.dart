import 'singleton.dart';

void main() {
  Singleton? singleton1 = Singleton.getInstance();
  Singleton? singleton2 = Singleton.getInstance();
  print(singleton1 == singleton2);
  print(singleton1);
  
}
