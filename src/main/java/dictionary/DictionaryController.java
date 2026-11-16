package dictionary;

public class DictionaryController {
    private Dictionary dictionary = new Dictionary();

    public DictionaryController(){
        dictionary.addWord("apple","A red fruit.");
        dictionary.addWord("computer","An electronic device.");
        dictionary.addWord("book","A collection of written pages.");

    }
    public String searchWord(String word){
        if (word.isBlank()){
            return "Please enter a word";
        }
        else {


            try {
                return dictionary.getMeaning(word);
            } catch (IllegalArgumentException e) {
                return e.getMessage();
            }
        }
    }

}
