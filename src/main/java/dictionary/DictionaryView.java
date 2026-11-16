package dictionary;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DictionaryView {
    private TextField wordField;
    private Button searchButton;
    private Label meaningLabel;
    private DictionaryController controller;


    public DictionaryView(Stage stage){
        wordField = new TextField();
        searchButton = new Button("Search");
        meaningLabel = new Label();
        FlowPane root = new FlowPane();
        root.getChildren().add(wordField);
        root.getChildren().add(searchButton);
        root.getChildren().add(meaningLabel);
        controller = new DictionaryController();
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String word = wordField.getText();
                String meaning = controller.searchWord(word);
                meaningLabel.setText(meaning);
            }
        });
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}

