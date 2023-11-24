package Adapter;

public class AppClient {
    public void useTranslationService(ITranslationService itranslationService) {
        System.out.println("Using translation service...");
        String translatedText = itranslationService.translateText("Hello", "es");
        System.out.println("Translated Text: " + translatedText);
    }
}
