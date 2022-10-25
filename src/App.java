import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2 = new Button();
        
        btn.setText("Hi! Click Here ^.^");
        btn2.setText("here");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("Here you are!");

                // Group root = new Group();
                
                // root.getChildren().remove(btn);
                // root.getChildren().add(btn2);
            }
        });

        Group root = new Group();
        // root.getChildren().add(btn);
        // root.getChildren().add(btn2);

        root.getChildren().addAll(btn, btn2);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
