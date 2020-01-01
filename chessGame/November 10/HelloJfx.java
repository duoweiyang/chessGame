import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloJfx extends Application {
  int count = 0;

   @Override public void start(Stage stage) {
       Label counterLabel = new Label("Count: 0");

       Button incButton = new Button("Increment Count");
       // incButton.setOnAction(event ->
       //     { counterLabel.setText("Count: " + (++count)); });
       incButton.setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent e) {
               counterLabel.setText("Count: " + (++count));
           }
       });

       VBox root = new VBox();
       root.getChildren().addAll(counterLabel, incButton);
       Scene scene = new Scene(root);
       
       stage.setScene(scene);
       stage.setTitle("Hello");
       stage.show();
   }
/*    @Override public void start(Stage stage) {
        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        stage.setScene(new Scene(message));
        stage.setTitle("Hello");
        stage.show();
    }
*/
}

// Stage (top) --> scene --> message
// Platform is for shutting down if you must. Like Platform.exit()
