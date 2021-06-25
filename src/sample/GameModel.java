package sample;

import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class GameModel extends Pane {

    private Main main;
    private Directions directions;
    private Food food;
    private Snake snake;
    private Timeline timeline;
    private GameView gameView;
    private int oneStep = 10;
    private int currentPosRow;
    private int currentPosCol;
    private int newPosRow = 1;
    private int newPosCol = 1;


    public GameModel() {

        food = new Food();
        snake = new Snake();

    }

    public void init() {
        getChildren().addAll(food.getFood(), snake);
//        getChildren().get(1)
        move();
    }

    public void move() {
        requestFocus();
        setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT) {
                moveRight();
            } else if (e.getCode() == KeyCode.LEFT) {
                moveLeft();
            } else if (e.getCode() == KeyCode.UP) {
                moveUp();
            } else if (e.getCode() == KeyCode.DOWN) {
                moveDown();
            }
        });

    }

    private void moveLeft() {
        GameView.setConstraints(snake, getCurrentPosCol() - 1, getCurrentPosRow());
//        for(int i = 0; i < snake.getSnakeSize(); i++){
//            snake.getChildren().get(i).setTranslateX(snake.getChildren().get(i).getTranslateX() - oneStep);

//        snakeHead.setTranslateX(snakeHead.getTranslateX() - oneStep);
//    }
    }

    private void moveRight() {
        GameView.setConstraints(snake, getCurrentPosCol() + 1, getCurrentPosRow());
//        for(int i = 0; i < snake.getSnakeSize(); i++){
//            snake.getChildren().get(i).setTranslateX(snake.getChildren().get(i).getTranslateX() + oneStep);
//        }
//        snakeHead.setTranslateX(snakeHead.getTranslateX() + oneStep);
//    }

    }
    private void moveDown() {
        GameView.setConstraints(snake, getCurrentPosCol(), getCurrentPosRow()+1);
//        for(int i = 0; i < snake.getSnakeSize(); i++){
//            snake.getChildren().get(i).setTranslateY(snake.getChildren().get(i).getTranslateY() + oneStep);
//        }
//        snakeHead.setTranslateY(snakeHead.getTranslateY() + oneStep);
    }

    private void moveUp() {
        GameView.setConstraints(snake, getCurrentPosCol(), getCurrentPosRow()-1);
//        for(int i = 0; i < snake.getSnakeSize(); i++){
//            snake.getChildren().get(i).setTranslateY(snake.getChildren().get(i).getTranslateY() - oneStep);
//        }
//        snakeHead.setTranslateY(snakeHead.getTranslateY() - oneStep);
    }
    public int getCurrentPosRow() {
        return GridPane.getRowIndex(snake);
    }

    public int getCurrentPosCol() {
        return GridPane.getColumnIndex(snake);
    }
    private void handleCollision() {
//
//        if (ball.intersects(rightWall.getBoundsInLocal()) ||
//                ball.intersects(leftWall.getBoundsInLocal())) {
//            timeline.stop();
//        } else if (ball.intersects(topWall.getBoundsInLocal()) ||
//                ball.intersects(bottomWall.getBoundsInLocal())) {
//            y = -y;
//        } else if (ball.intersects(leftPaddle.getBoundsInLocal()) && x == -1) {
//            x = -x;
//        } else if (ball.intersects(rightPaddle.getBoundsInLocal()) && x == 1) {
//            x = -x;
//        }
    }
}