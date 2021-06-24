package sample;

import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;

public class Snake{

    private final Group root;
    private final Rectangle snake;
//    private final ArrayList<Rectangle> snakeBody;
    private Directions directions;
    private int currentPositionX;
    private int currentPositionY;
    private final int oneStep = 20;


    public Snake(Group root){
        this.root = root;
        snake = new Rectangle(20,20, Color.BLUE);
        snake.setFill(Color.BLUE);
//        snakeBody = new ArrayList<>();
//        snakeBody.add(snake);
        root.getChildren().add(snake);
        root.requestFocus();
        move();

    }

    public Group getRoot() {
        return root;
    }

    public void move(){

        root.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT) {
                moveRight();
            }
            else if (e.getCode() == KeyCode.LEFT) {
                moveLeft();
            }
            else if (e.getCode() == KeyCode.UP) {
                moveUp();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                moveDown();
            }
        });

//        try {
//            switch (directions) {
//                case UP:
//                    moveUp();
//                    break;
//                case DOWN:
//                    moveDown();
//                    break;
//                case RIGHT:
//                    moveRight();
//                    break;
//                case LEFT:
//                    moveLeft();
//                    break;
//            }
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
    }

//        root.setOnKeyPressed(e -> {
//            if (e.getCode() == KeyCode.RIGHT) {
//                snake.setX(snake.getX() + 10);
//            }
//            else if (e.getCode() == KeyCode.LEFT) {
//                snake.setX(snake.getX() - 10);
//            }
//            else if (e.getCode() == KeyCode.UP) {
//                snake.setY(snake.getY() - 10);
//            }
//            else if (e.getCode() == KeyCode.DOWN) {
//                snake.setY(snake.getY() + 10);
//            }
//        });


    private void moveLeft() {
        snake.setX(snake.getX() - oneStep);
    }

    private void moveRight() {
        snake.setX(snake.getX() + oneStep);
    }

    private void moveDown() {
        snake.setY(snake.getY() + oneStep);
    }

    private void moveUp() {
        snake.setY(snake.getY() - oneStep);
    }

    public void die(){
        root.getChildren().removeAll();
    }

//    public void generateFood(){
//        for(int i = 0; i < ; i++){
//            foodPosX = (int) (Math.random() * Parameters.row_count);
//            foodPosY = (int) (Math.random() * Parameters.col_count);
//
//        }
//    }
//
//    public ArrayList<Rectangle> getSnakeBody() {
//        return snakeBody;
//    }

//    public int getCurrentPositionX() {
//        currentPositionX =
//        return currentPositionX;
//    }
//
//    public int getCurrentPositionY() {
//        for (Rectangle rectangle : snakeBody) {
//            currentPositionY = (int) rectangle.getY();
//        }
//        return currentPositionY;
//    }
}

