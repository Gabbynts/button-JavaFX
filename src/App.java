import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2 = new Button();
        
        btn.setText("Hi! Click Here ^.^");
        
        StackPane root = new StackPane();
        
        Label l = new Label("Button");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                btn.setDisable(true);
                btn2.setText("There you are !!");
                root.getChildren().add(btn2);
                
            }
        };
        btn.setOnAction(event);

        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                btn2.setDisable(true);
                l.setText("Thankyou");
                root.getChildren().add(l);
            }
        };
        btn2.setOnAction(event2);

        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
