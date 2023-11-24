package Adapter;

public class Main {
public static void main(String[] args) {
 // Usando o serviço de tradução online através do adapter
 ITranslatorService onlineTranslator = new OnlineTranslator();
 ITranslationService adaptedTranslator = new TranslatorAdapter(onlineTranslator);

 // Usando a nova interface
 AppClient appClient = new AppClient();
 appClient.useTranslationService(adaptedTranslator);


    
}

    
}
