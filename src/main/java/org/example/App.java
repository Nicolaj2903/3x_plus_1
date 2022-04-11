package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //                                     Width   Height
//        scene = new Scene(loadFXML("primary"), 340, 190);
        scene = new Scene(loadFXML("primary"), 700, 700);
        stage.setTitle("3x + 1");

        // Defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Number of iterations");
        yAxis.setLabel("Value");

        // Creating the chart
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);

        // Name of the chart
        lineChart.setTitle("3x + 1");

        // Defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Nr. 1");

        // Insert data
        series.getData().add(new XYChart.Data(1, 5));
        series.getData().add(new XYChart.Data(2, 10));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 20));
        series.getData().add(new XYChart.Data(5, 25));

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}