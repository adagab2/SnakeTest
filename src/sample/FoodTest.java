package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class FoodTest {
    private Image[] foodImages = {new Image("file:src/sample/apple.jpg"), new Image("file:src/sample/orange.png")};
    private ImageView foodImageView;
    private int foodPosX;
    private int foodPosY;


    public FoodTest(){
        foodImages = new Image[foodImages.length];
        foodImageView = new ImageView();
        foodImageView.setImage(foodImages[1]);
    }

    private ImageView generateFood(){
        for(int i = 0; i < foodImages.length; i++){
            foodPosX = (int) (Math.random() * Parameters.row_count);
            foodPosY = (int) (Math.random() * Parameters.col_count);
            foodImageView.setImage(foodImages[i]);
        }

        return foodImageView;

    }

    public ImageView getFoodImageView() {
        return foodImageView;
    }

}
