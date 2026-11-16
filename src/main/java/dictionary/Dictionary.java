package dictionary;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> dictionary = new HashMap<>();

    public void addWord(String word, String meaning){
        dictionary.put(word,meaning);
    }

    public String getMeaning(String word){

            if(dictionary.containsKey(word)){
                return dictionary.get(word);
            }
            throw new IllegalArgumentException("Word not found");

    }
}
