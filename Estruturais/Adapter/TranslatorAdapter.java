package Adapter;

// Adapter que adapta a interface antiga para a nova
public class TranslatorAdapter implements ITranslationService {
    
    private ITranslatorService translatorService;

    public TranslatorAdapter(ITranslatorService translatorService) {
        this.translatorService = translatorService;
    }

    @Override
    public String translateText(String text, String targetLanguage) {
       // Adaptação: Chama o método antigo com o idioma de origem fixo
        // pois a interface antiga não inclui um parâmetro para o idioma de origem
        return translatorService.translate(text, "auto", targetLanguage);
    }
    
}
