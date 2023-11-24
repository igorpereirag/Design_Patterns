package Adapter;

// Adapter que adapta a interface antiga para a nova
public class TranslatorAdapter implements ITranslationService {
    
    private ITranslatorService itranslatorService;

    public TranslatorAdapter(ITranslatorService itranslatorService) {
        this.itranslatorService = itranslatorService;
    }


    @Override
    public String translateText(String text, String targetLanguage) {
       // Adaptação: Chama o método antigo com o idioma de origem fixo
        // pois a interface antiga não inclui um parâmetro para o idioma de origem
        return itranslatorService.translate(text, "auto", targetLanguage);
    }
    
}
