import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class Controller {

    @FXML
    private Label lblOutput;

    @FXML
    private MenuItem exit;

    @FXML
    private MenuItem delete;

    public void sayHello() {
        lblOutput.setText("Hello FXML!");
    }

    @FXML
    void deleteItem(ActionEvent event) {

    }

    @FXML
    void exitProgram(ActionEvent event) {

    }

}