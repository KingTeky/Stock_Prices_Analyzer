package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class StockPriceAnalyzer extends Application {

    @Override
    public void start(Stage primaryStage) {
        // array and ArrayList of stock prices
        double[] stockPricesArray = {100.5, 200.75, 150.0, 100.5, 300.0};
        ArrayList<Double> stockPricesList = new ArrayList<>(Arrays.asList(100.5, 200.75, 150.0, 100.5, 300.0));

        // TextArea to display results
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        // Button to calculate average price
        Button avgButton = new Button("Calculate Average Price");
        avgButton.setOnAction(e -> {
            double averageArray = calculateAverage(stockPricesArray);
            double averageList = calculateAverage(stockPricesList);
            textArea.setText("Average Price (Array): " + averageArray + "\n" +
                             "Average Price (ArrayList): " + averageList);
        });

        // Button to find maximum price
        Button maxButton = new Button("Find Maximum Price");
        maxButton.setOnAction(e -> {
            double maxArray = findMax(stockPricesArray);
            double maxList = findMax(stockPricesList);
            textArea.setText("Maximum Price (Array): " + maxArray + "\n" +
                             "Maximum Price (ArrayList): " + maxList);
        });

        // Button to count occurrences of a specific price
        Button countButton = new Button("Count Occurrences of 100.5");
        countButton.setOnAction(e -> {
            int countArray = countOccurrences(stockPricesArray, 100.5);
            int countList = countOccurrences(stockPricesList, 100.5);
            textArea.setText("Occurrences of 100.5 (Array): " + countArray + "\n" +
                             "Occurrences of 100.5 (ArrayList): " + countList);
        });

        // Button to compute cumulative sum
        Button sumButton = new Button("Compute The Cumulative Sum");
        sumButton.setOnAction(e -> {
            double cumulativeSumArray = computeCumulativeSum(stockPricesArray);
            double cumulativeSumList = computeCumulativeSum(stockPricesList);
            textArea.setText("Cumulative Sum (Array): " + cumulativeSumArray + "\n" +
                             "Cumulative Sum (ArrayList): " + cumulativeSumList);
        });

        // Layout to arrange buttons and TextArea
        VBox vbox = new VBox(10, avgButton, maxButton, countButton, sumButton, textArea);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Stock Price Analyzer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to calculate the average price from an array
    private double calculateAverage(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Overloaded method to calculate the average price from an ArrayList
    private double calculateAverage(ArrayList<Double> prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum / prices.size();
    }

    // Method to find the maximum price from an array
    private double findMax(double[] prices) {
        double max = prices[0];
        for (double price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // Overloaded method to find the maximum price from an ArrayList
    private double findMax(ArrayList<Double> prices) {
        double max = prices.get(0);
        for (double price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // Method to count occurrences of a specific price in an array
    private int countOccurrences(double[] prices, double targetPrice) {
        int count = 0;
        for (double price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Overloaded method to count occurrences of a specific price in an ArrayList
    private int countOccurrences(ArrayList<Double> prices, double targetPrice) {
        int count = 0;
        for (double price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of prices in an array
    private double computeCumulativeSum(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    // Overloaded method to compute the cumulative sum of prices in an ArrayList
    private double computeCumulativeSum(ArrayList<Double> prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
