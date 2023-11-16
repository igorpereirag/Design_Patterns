import 'factorymsi.dart';
import 'interfacegpu.dart';
import 'interfacemonitor.dart';

void main() {
  FactoryMsi factory = FactoryMsi();
  GPU gpu1 = factory.creategpu();
  Monitor monitor = factory.createmonitor();
  gpu1.creategpu();
  monitor.createmonitor();
  print(gpu1);
  print(monitor.createmonitor());
  
}
