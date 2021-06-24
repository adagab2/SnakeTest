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

public class GameView extends Application {

    private GameModel gameModel;
    private Snake snake1;
    private Group root1;
    private Rectangle snake;

    private Group createBoard() {
//        Pane board = new Pane();
//        Food food = new Food();
        root1 = new Group();
        Rectangle snake = new Rectangle(20, 20, Color.BLUE);
        root1.getChildren().add(snake);
        root1.requestFocus();
        int foodX = (int) (Math.random() * sample.Parameters.col_count);
        int foodY = (int) (Math.random() * sample.Parameters.row_count);
//        board.setGridLinesVisible(true);
////        board.setAlignment(Pos.CENTER);
//
//        int rows = sample.Parameters.row_count;
//        int columns = sample.Parameters.col_count;
//
//        for (int i = 0; i < rows; i++) {
//            RowConstraints constrains = new RowConstraints(20);
//            board.getRowConstraints().add(constrains);
//        }
//        for (int j = 0; j < columns; j++) {
//            ColumnConstraints constrains = new ColumnConstraints(20);
//            board.getColumnConstraints().add(constrains);
//        }

//        board.getChildren().add(food.getFood());

        root1.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT) {
                snake.setX(snake.getX() - 10);
            }
            else if (e.getCode() == KeyCode.LEFT) {
                snake.setX(snake.getX() + 10);
            }
            else if (e.getCode() == KeyCode.UP) {
                snake.setY(snake.getY() - 10);
            }
            else if (e.getCode() == KeyCode.DOWN) {
                snake.setY(snake.getY() + 10);
            }
        });

//        board.getChildren().addAll(root);
        return root1;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        root1 = new Group();

//        root1.getChildren().add(snake1);

        Scene scene = new Scene(root1, 500, 500);

        scene.setFill(Color.LIGHTGREEN);

        snake1 = new Snake(root1);

        primaryStage.setTitle("Snake");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private VBox createView() {
        VBox mainView = new VBox();
        BackgroundFill fill = new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY);
        mainView.setSpacing(10);
        mainView.setPadding(new Insets(10, 0, 10, 0));
        mainView.setBackground(new Background(fill));
        mainView.getChildren().addAll(createBoard());
        return mainView;
    }

    private HBox createMenu() {
        HBox menu = new HBox();
        menu.setAlignment(Pos.BOTTOM_CENTER);
        Button button = new Button("New Game");
//        button.setOnAction(e -> {
//            model.resetModel();
//            resetView();
//        });
        menu.getChildren().add(button);
        return menu;
    }




//    private StackPane createBoardSquare(int row, int col) {
//        fields[row][col] = new BoardSquare(Color.DARKGREEN);
//        fields[row][col].setOnMouseClicked(e -> {
//            model.attemptMove(row, col);
//        });
//        return fields[row][col];
//    }

//    private HBox createSummary() {
//        HBox summary = new HBox();
//        summary.setAlignment(Pos.CENTER);
//        label = new Label();
//        Font font = Font.font(label.getFont().getFamily(), 32);
//        label.setFont(font);
//        summary.getChildren().add(label);
//        return summary;
//    }


    public static void main(String[] args) {
        launch(args);
    }
}
