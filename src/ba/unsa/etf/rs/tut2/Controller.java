package ba.unsa.etf.rs.tut2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;

    public void klik_na_dugme(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
}
