package sample;

public class GameModel {

    private GameView gameView;
    private Directions directions;
    private Food food;
    private Snake snake;

    public GameModel() {

    }

    public void move() {

    }
}
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