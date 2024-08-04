package org.example.demodesktop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.demodesktop.view.LoginPage;
import org.example.demodesktop.view.RegisterPage;

import java.io.IOException;
import java.util.logging.Logger;

public class WelcomeController {

    private static final Logger log = Logger.getLogger(WelcomeController.class.getName());

    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;

    @FXML
    private void nextPage() throws IOException {
        log.info("Login Button clicked");
        new LoginPage().start((Stage) loginButton.getScene().getWindow());
    }

    @FXML
    private void handleRegister() throws IOException {
        // print to log
        log.info("handle register clicked");
        // go to register page
        new RegisterPage().start((Stage) registerButton.getScene().getWindow());
    }
}