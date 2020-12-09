package io.test.sample;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestAPIApp extends Application {

    public static void main(String[] args) {
        //launch(args);
         SpringApplication.run(TestAPIApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
