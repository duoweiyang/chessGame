import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Constructs the GUI for ChessGame.
 *
 * @author dyang305
 * @version 1.0
 */
public class ChessGui extends Application {

  /**
   * Creates window (base) of this GUI.
   *
   * @param stage top level JavaFX container
   */
    @Override public void start(Stage stage) {
        ChessDb chessDb = new ChessDb();
        ObservableList<ChessGame> emails =
            FXCollections.observableArrayList(chessDb.getGames());
        TableView<ChessGame> table = createTable(emails);

        Button viewButton = new Button("View Game");
        viewButton.setOnAction(e -> {
                ChessGame msg = table.getSelectionModel().getSelectedItem();
                viewDialog(msg);
            });
        viewButton.disableProperty()
            .bind(Bindings.isNull(table.getSelectionModel().
            selectedItemProperty()));

        Button dismissButton = new Button("Dismiss");
        dismissButton.setOnAction(e -> Platform.exit());

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(viewButton, dismissButton);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(table, buttonBox);
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.setTitle("Chess DB GUI");
        stage.show();
    }

    /**
     * Makes the columns of the table.
     */
    private
        TableView<ChessGame>
        createTable(ObservableList<ChessGame> emails) {
        TableView<ChessGame> table = new TableView<ChessGame>();
        table.setItems(emails);

        TableColumn<ChessGame, String> eventCol =
            new TableColumn<ChessGame, String>("Event");
        eventCol.setCellValueFactory(new PropertyValueFactory("event"));

        TableColumn<ChessGame, String> siteCol =
            new TableColumn<ChessGame, String>("Site");
        siteCol.setCellValueFactory(new PropertyValueFactory("site"));

        TableColumn<ChessGame, String> dateCol =
            new TableColumn<ChessGame, String>("Date");
        dateCol.setCellValueFactory(new PropertyValueFactory("date"));

        TableColumn<ChessGame, String> whiteCol =
            new TableColumn<ChessGame, String>("White");
        whiteCol.setCellValueFactory(new PropertyValueFactory("white"));

        TableColumn<ChessGame, String> blackCol =
            new TableColumn<ChessGame, String>("Black");
        blackCol.setCellValueFactory(new PropertyValueFactory("black"));

        TableColumn<ChessGame, String> resultCol =
            new TableColumn<ChessGame, String>("Result");
        resultCol.setCellValueFactory(new PropertyValueFactory("result"));


        table.getColumns().setAll(eventCol, siteCol, dateCol, whiteCol,
            blackCol, resultCol);
        return table;
    }

    private void viewDialog(ChessGame msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        int num = 1;
        String result = "";
        alert.setTitle(msg.getEvent());
        alert.setHeaderText(String.format(
            "Site: %s%nDate: %s%nWhite: %s%nBlack: %s%nResult: %s",
            msg.getSite(), msg.getDate(), msg.getWhite(), msg.getBlack(),
            msg.getResult()));

        try {
            while (true) {
                result += msg.getMove(num);
                result += " ";
                num++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.print("IndexOutOfBoundsException was caught.");
        }

        alert.setContentText(result);
        alert.showAndWait();
    }
}
