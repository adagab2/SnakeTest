package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Snake extends Group{

    private Rectangle snakeHead;
    private final ArrayList<Rectangle> snakeBody;
    private Directions directions;
    private int currentPositionX;
    private int currentPositionY;
    private final int oneStep = 20;
    private AnimationTimer aTimer;
    private Timeline tTimer;
    private int timeSeconds = 1;
//    private GameView gameView;


    public ArrayList<Rectangle> getSnakeBody() {
        return snakeBody;
    }

    public Snake(){
        snakeHead = new Rectangle(20,20, Color.BLUE);

//        root = new Group();
        snakeBody = new ArrayList<>();
        snakeBody.add(snakeHead);
        getChildren().addAll(getSnakeBody());
//        move();

    }
//
//    public Group getRoot() {
//        return Snake;
//    }

    public void move() {
        Rectangle tempSnake = new Rectangle(20,20,Color.BLUE);
        Rectangle first = snakeBody.get(0);

        setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT) {
//                moveRight();
                tempSnake.setTranslateX(first.getTranslateX() + oneStep);
//                snakeBody.setY(first.getY());
            } else if (e.getCode() == KeyCode.LEFT) {
//                moveLeft();
                tempSnake.setX(first.getX() - oneStep);
//                snakeBody.setY(first.getY());
            } else if (e.getCode() == KeyCode.UP) {
//                moveUp();
                tempSnake.setY(first.getY() - oneStep);
//                snakeBody.setX(first.getX());
            } else if (e.getCode() == KeyCode.DOWN) {
//                moveDown();
                tempSnake.setY(first.getY() + oneStep);
//                snakeBody.setX(first.getX());

            }
        });

        snakeBody.add(0,tempSnake);
        snakeBody.remove(snakeBody.size()-1);


//        aTimer = new AnimationTimer() {
//            @Override
//            public void handle(long l) {
//            }
//        };
//        aTimer.start();
    }



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

    private void snakeGrowth(){
        Rectangle snakeBody = new Rectangle(20,20,Color.BLUE);

//        snakeBody.setX(getCurrentPositionX(getSnakeSize()-1) + oneStep);
//        snakeBody.setY(getCurrentPositionY(getSnakeSize() -1) + );
        getChildren().add(0,snakeBody);
        getChildren().remove(getSnakeSize()-1);
    }

    private void moveLeft() {

//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateX(getChildren().get(i).getTranslateX() - oneStep);
//        }
//        snakeHead.setTranslateX();
        snakeHead.setTranslateX(snakeHead.getTranslateX() - oneStep);
    }

    private void moveRight() {
//        newSnake.setX(getChildren().get(getSnakeSize()-1).getTranslateX() + oneStep);

        snakeHead.setTranslateX(snakeHead.getTranslateX() + oneStep);
    }

    private void moveDown() {
//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateY(getChildren().get(i).getTranslateY() + oneStep);
//        }
        snakeHead.setTranslateY(snakeHead.getTranslateY() + oneStep);
    }

    private void moveUp() {
//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateY(getChildren().get(i).getTranslateY() - oneStep);
//        }
        snakeHead.setTranslateY(snakeHead.getTranslateY() - oneStep);
    }

    public void die(){
        getChildren().removeAll();
    }


//
//    public ArrayList<Rectangle> getSnakeBody() {
//        return snakeBody;
//    }

    public int getSnakeSize(){
        return getChildren().size();
    }

    public int getCurrentPositionX(int snakeElement) {
        int x = (int) getChildren().get(snakeElement).getTranslateX();
        return x;
    }

    public int getCurrentPositionY(int snakeElement) {
        int y = (int) getChildren().get(snakeElement).getTranslateY();
        return y;
    }
}

