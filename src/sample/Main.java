package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    private GameModel gameModel;
    private GameView gameView;
    private Group root1;
    private Food food;
    private Snake snake;
    private Snake1 snake1;



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        gameView = new GameView();
        food = new Food();
        root1 = new Group();
        snake = new Snake();
        snake1 = new Snake1();
        gameModel = new GameModel();


        Scene scene = new Scene(root1, sample.Parameters.scene_wight, sample.Parameters.scene_height);

        scene.setFill(Color.LIGHTGREEN);

        gameModel.init();

        root1.getChildren().addAll(snake1, gameView);
        snake1.requestFocus();
        snake1.canMove();
////
//        gameView.getGridPane().getChildren().add(snake);

//        snake.requestFocus();
//        snake.move();



//        root1.getChildren().addAll(snake);

//        gameView.getChildren().add(root1);


        primaryStage.setTitle("Snake");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
