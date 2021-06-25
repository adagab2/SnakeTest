package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Snake1 extends Group{

        private Rectangle snakeHead;
//        private final ArrayList<Rectangle> snakeBody;
        private Directions directions;
        private int currentPositionX;
        private int currentPositionY;
        private final int oneStep = 20;
        private AnimationTimer aTimer;
        private Timeline tTimer;
        private int timeSeconds = 1;
        private boolean isMoved = true;
//    private GameView gameView;


        public Snake1(){
            snakeHead = new Rectangle(20,20, Color.BLUE);

//        root = new Group();
//            snakeBody = new ArrayList<>();
//            snakeBody.add(snakeHead);
            getChildren().addAll(snakeHead);
//        move();

        }
//
//    public Group getRoot() {
//        return Snake;
//    }
        public void canMove(){

            setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.RIGHT) {
                    moveRight();
//                snakeBody.setY(first.getY());
                } else if (e.getCode() == KeyCode.LEFT) {
                    moveLeft();

//                snakeBody.setY(first.getY());
                } else if (e.getCode() == KeyCode.UP) {
                    moveUp();
//                snakeBody.setX(first.getX());
                } else if (e.getCode() == KeyCode.DOWN) {
                    moveDown();
//                snakeBody.setX(first.getX());

                }
            });

//            getChildren().add(0,tempSnake);
//            getChildren().remove(getSnakeSize()-1);


//        aTimer = new AnimationTimer() {
//            @Override
//            public void handle(long l) {
//            }
//        };
//        aTimer.start();
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

    private void checkLocation(Rectangle first){
        first = (Rectangle) getChildren().get(0);;
//
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

    }

        private void snakeGrowth(){
            Rectangle snakeBody = new Rectangle(20,20,Color.BLUE);

//        snakeBody.setX(getCurrentPositionX(getSnakeSize()-1) + oneStep);
//        snakeBody.setY(getCurrentPositionY(getSnakeSize() -1) + );
            getChildren().add(0,snakeBody);
            getChildren().remove(getSnakeSize()-1);
        }

        private void moveLeft() {
//            directions = Directions.LEFT;
            Rectangle tempSnake = new Rectangle(20,20,Color.BLUE);
            Rectangle first = (Rectangle) getChildren().get(0);

//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateX(getChildren().get(i).getTranslateX() - oneStep);
//        }
//        snakeHead.setTranslateX();
//            snakeHead.setTranslateX(snakeHead.getTranslateX() - oneStep);
            tempSnake.setTranslateX(first.getTranslateX() - oneStep);
            getChildren().add(tempSnake);
            getChildren().remove(getSnakeSize()-1);
        }

        private void moveRight() {
//            directions = Directions.RIGHT;
//        newSnake.setX(getChildren().get(getSnakeSize()-1).getTranslateX() + oneStep);

//            snakeHead.setTranslateX(snakeHead.getTranslateX() + oneStep);
            ;
            Rectangle tempSnake = new Rectangle(20,20,Color.BLUE);
            Rectangle first = (Rectangle) getChildren().get(0);
            tempSnake.setTranslateX(first.getTranslateX() + oneStep);
            getChildren().add(0,tempSnake);
            getChildren().remove(getSnakeSize()-1);
        }

        private void moveDown() {
//            directions = Directions.DOWN;
//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateY(getChildren().get(i).getTranslateY() + oneStep);
//        }
//            snakeHead.setTranslateY(snakeHead.getTranslateY() + oneStep);

            Rectangle tempSnake = new Rectangle(20,20,Color.BLUE);
            Rectangle first = (Rectangle) getChildren().get(0);
            tempSnake.setTranslateY(first.getTranslateY() + oneStep);
            getChildren().add(tempSnake);
            getChildren().remove(getSnakeSize()-1);
        }

        private void moveUp() {
//            directions = Directions.UP;
            Rectangle tempSnake = new Rectangle(20,20,Color.BLUE);
            Rectangle first = (Rectangle) getChildren().get(0);
            tempSnake.setTranslateY(first.getTranslateY() - oneStep);
            getChildren().add(tempSnake);
            getChildren().remove(getSnakeSize()-1);
//        for(int i = 0; i < getSnakeSize(); i++){
//            getChildren().get(i).setTranslateY(getChildren().get(i).getTranslateY() - oneStep);
//        }
//            snakeHead.setTranslateY(snakeHead.getTranslateY() - oneStep);
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

