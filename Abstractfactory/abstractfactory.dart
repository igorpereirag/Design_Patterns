import 'interfacegpu.dart';
import 'interfacemonitor.dart';

abstract class Produtos {
  GPU creategpu();

  Monitor createmonitor();
}
