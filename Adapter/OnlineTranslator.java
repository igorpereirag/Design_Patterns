package Adapter;

// Classe que implementa a interface antiga
public class OnlineTranslator implements ITranslatorService {

    @Override
    public String translate(String text, String sourceLanguage, String targetLanguage) {
       // Simula a tradução online
       System.out.println("Translating text online...");
       // Lógica de tradução real não implementada neste exemplo
       return "Translated Text";
        
    }
    
}
