package sample;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BoardPane extends StackPane {
    private static final Color HIGHLIGHT_COLOR = Color.YELLOW;

    private Color color;
    private Region field;
    private FoodTest food;

    public BoardPane(Color defaultColor) {
        color = defaultColor;
        createField(color);
        getChildren().addAll(field, food.getFoodImageView());
        setPrefSize(200, 200);
    }

    public void highlight() {
        setFieldColor(HIGHLIGHT_COLOR);
    }

    public void blacken() {
        setFieldColor(color);
    }

//    public void showPawn() {
//        food.);
//    }
//
//    public void hidePawn() {
//        pawn.setVisible(false);
//    }
//
//    public boolean isPawnVisible() {
//        return pawn.isVisible();
//    }

    public void setFieldColor(Color color) {
        BackgroundFill fill = new BackgroundFill(color, CornerRadii.EMPTY, new Insets(2));
        Background background = new Background(fill);
        field.setBackground(background);
    }

    private void createField(Color color) {
        field = new Region();
        setFieldColor(color);
    }
}
