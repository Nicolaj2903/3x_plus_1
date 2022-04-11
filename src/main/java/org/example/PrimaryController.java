package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    public Button Calculate;
    public TextArea textArea;
    public TextField textField;
    public Button clear;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    public void startCalculating(MouseEvent event)
    {
        // Empty the string
//        textArea.setText("");

        Math_problem math = new Math_problem(Integer.parseInt(textField.getText().replace(".", "")));

            math.setOutput(new Output() {
                @Override
                public void append(String message) {
                    textArea.setText(textArea.getText() + "Input: " + textField.getText() + " - " + message + "\n");
                }
            });
        math.calculate();
    }

    // Clear the text
    public void clear(MouseEvent event) {
        textArea.setText("");
    }
}
