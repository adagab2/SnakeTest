package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Example9 extends Application {

    public static final int SCENE_WIDTH = 500;
    public static final int SCENE_HEIGHT = 500;

    public static final int PADDLE_HEIGHT = 80;
    public static final int PADDLE_WIDTH = 25;
    public static final int PADDLE_OFFSET = 25;
    public static final int PADDLE_STEP = 10;

    public static final int WALL_THICKNESS = 1;

    public static final int BALL_RADIUS = 10;

    private int x = -1;
    private int y = -1;

    private Rectangle snake;
//    private Rectangle rightPaddle = new Rectangle(SCENE_WIDTH - PADDLE_OFFSET - PADDLE_WIDTH, SCENE_HEIGHT / 2, PADDLE_WIDTH, PADDLE_HEIGHT);

//    private Rectangle topWall = new Rectangle(0, 0, SCENE_WIDTH, WALL_THICKNESS);
//    private Rectangle bottomWall = new Rectangle(0, SCENE_HEIGHT - 1, SCENE_WIDTH, WALL_THICKNESS);
//
//    private Rectangle leftWall = new Rectangle(0, 0, WALL_THICKNESS, SCENE_HEIGHT);
//    private Rectangle rightWall = new Rectangle(SCENE_WIDTH - 1, 0, WALL_THICKNESS, SCENE_HEIGHT);
//
//    private Circle ball = new Circle(SCENE_WIDTH / 2, SCENE_HEIGHT / 2, BALL_RADIUS, Color.WHITE);;
//    private Timeline timeline;

//    private void handleCollision() {
//        if (ball.intersects(rightWall.getBoundsInLocal()) ||
//                ball.intersects(leftWall.getBoundsInLocal())) {
//            timeline.stop();
//        }
//        else if (ball.intersects(topWall.getBoundsInLocal()) ||
//                ball.intersects(bottomWall.getBoundsInLocal())) {
//            y = -y;
//        }
//        else if (ball.intersects(leftPaddle.getBoundsInLocal()) && x == -1) {
//            x = -x;
//        }
//        else if (ball.intersects(rightPaddle.getBoundsInLocal()) && x == 1) {
//            x = -x;
//        }
//    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        snake = new Rectangle(20,20,Color.BLUE);

        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        scene.setFill(Color.DARKOLIVEGREEN);

        snake.setFill(Color.LIGHTBLUE);
//        rightPaddle.setFill(Color.LIGHTBLUE);

        root.getChildren().addAll(snake);
        root.requestFocus();
        root.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT) {
                snake.setX(snake.getX() + 10);
            }
            else if (e.getCode() == KeyCode.LEFT) {
                snake.setX(snake.getX() - 10);
            }
            else if (e.getCode() == KeyCode.UP) {
                snake.setY(snake.getY() - 10);
            }
            else if (e.getCode() == KeyCode.DOWN) {
                snake.setY(snake.getY() + 10);
            }
        });

//        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> {
//            handleCollision();
//            ball.setCenterX(ball.getCenterX() + x);
//            ball.setCenterY(ball.getCenterY() + y);
//        });
//        timeline = new Timeline(keyFrame);
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.play();

        primaryStage.setTitle("PONG");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
