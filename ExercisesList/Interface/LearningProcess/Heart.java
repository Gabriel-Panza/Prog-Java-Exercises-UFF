import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class HeartShape extends Application {
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();

        CubicCurve heart = new CubicCurve();
        heart.setStartX(100);
        heart.setStartY(100);
        heart.setControlX1(100);
        heart.setControlY1(0);
        heart.setControlX2(200);
        heart.setControlY2(200);
        heart.setEndX(200);
        heart.setEndY(100);

        Circle leftCircle = new Circle(100, 100, 100);
        Circle rightCircle = new Circle(200, 100, 100);

        root.getChildren().addAll(heart, leftCircle, rightCircle);

        heart.setFill(Color.RED);
        heart.setStroke(Color.BLACK);

        Scene scene = new Scene(root, 400, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
