package dictionary;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
            DictionaryView dictionaryView = new DictionaryView(primaryStage);

    }
    public static void main(String[] args){
        launch(args);
    }
}
