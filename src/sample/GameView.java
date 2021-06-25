package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameView extends GridPane{

    private GameModel gameModel;
    private Snake snake;
    private Group root;
    private Food food;
    private Rectangle topWall = new Rectangle(500,3);
    private Rectangle bottomWall = new Rectangle(500, 3);

    private Rectangle leftWall = new Rectangle(3, 500);
    private Rectangle rightWall = new Rectangle(3, 500);

//    private Rectangle topWall = new Rectangle(0, 0, 500,3);
//    private Rectangle bottomWall = new Rectangle(0, Parameters.row_count, Parameters.scene_wight, Parameters.wall_thickness);
//
//    private Rectangle leftWall = new Rectangle(0, 0, Parameters.wall_thickness, Parameters.scene_height);
//    private Rectangle rightWall = new Rectangle(Parameters.col_count, Parameters.row_count, Parameters.wall_thickness, Parameters.scene_height);


    public Snake getSnake() {
        return snake;
    }

    public GameView(){
//        getChildren().add(createBoard());
//        food = new Food();
//        snake = new Snake();
//        gridPane = new GridPane();
        topWall.setFill(Color.BLUE);
        bottomWall.setFill(Color.BLUE);
        leftWall.setFill(Color.BLUE);
        rightWall.setFill(Color.BLUE);
//        gridPane.add(food.getFood(), food.getFoodPosX(), food.getFoodPosY());
//        gridPane.add(topWall, 0, 0);
//        gridPane.add(bottomWall, 0, 24);
//        gridPane.add(rightWall, 24, 12);
//        gridPane.add(leftWall, 0, 12);
//        gridPane.add(snake, 0,1);
        createBoard();


    }
    private void createBoard() {

        setGridLinesVisible(true);
//        board.setAlignment(Pos.CENTER);

        int rows = sample.Parameters.row_count;
        int columns = sample.Parameters.col_count;

        for (int i = 0; i < rows; i++) {
            RowConstraints constrains = new RowConstraints(20);
            getRowConstraints().add(constrains);
        }
        for (int j = 0; j < columns; j++) {
            ColumnConstraints constrains = new ColumnConstraints(20);
            getColumnConstraints().add(constrains);
        }

    }

//    private VBox createView() {
//        VBox mainView = new VBox();
//        BackgroundFill fill = new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY);
//        mainView.setSpacing(10);
//        mainView.setPadding(new Insets(10, 0, 10, 0));
//        mainView.setBackground(new Background(fill));
//        mainView.getChildren().addAll(createBoard());
//        return mainView;
//    }
//
//    private HBox createMenu() {
//        HBox menu = new HBox();
//        menu.setAlignment(Pos.BOTTOM_CENTER);
//        Button button = new Button("New Game");
//        button.setOnAction(e -> {
//            model.resetModel();
//            resetView();
//        });
//        menu.getChildren().add(button);
//        return menu;
//    }

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

}
