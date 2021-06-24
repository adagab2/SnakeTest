package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle{

    private Rectangle food;
    private int foodPosX;
    private int foodPosY;


    public Food(){
        food = new Rectangle(20,20, Color.YELLOW);
        food.setFill(Color.YELLOW);
    }

//    public void generateFood(){
//        for(int i = 0; i < ; i++){
//            foodPosX = (int) (Math.random() * Parameters.row_count);
//            foodPosY = (int) (Math.random() * Parameters.col_count);
//
//        }
//    }

    public Rectangle getFood() {
        return food;
    }
}
