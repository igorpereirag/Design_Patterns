import 'abstractfactory.dart';
import 'interfacegpu.dart';
import 'interfacemonitor.dart';
import 'msigpu.dart';
import 'msimonitor.dart';

class FactoryMsi implements Produtos {
  @override
 GPU creategpu() {
    return MsiGpu();
  }

  Monitor createmonitor() {
    return MsiMonitor();
  }
}




