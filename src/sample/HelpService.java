package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class HelpService {

	public static void Help() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Help");
		alert.setHeaderText("Game Instructions..!");

		DialogPane dialogPane = alert.getDialogPane();
		dialogPane.setPadding(new Insets(20));
		dialogPane.setBackground(
				new Background(new BackgroundFill(Color.rgb(69, 255, 202), CornerRadii.EMPTY, Insets.EMPTY)));

		Text instructionsText = new Text("Welcome to the Snake Game!"
				+ "  1. Initial Setup: \n"
				+ "     - The snake begins with 3 parts and has 3 lives. \n"
				+ "  2. Eating Mechanism: \n"
				+ "     - Eat food to increase the snake's length. \n"
				+ "  3. Dynamites: \n"
				+ "     - If the snake eats dynamites, it loses 3 parts and 1 life. \n"
				+ "     - Game Over if the snake eats dynamites 3 times. \n"
				+ "  4. Minimum Snake Length: \n"
				+ "     - The snake must have a minimum of 3 parts; otherwise, it's Game Over. \n"
				+ "  5. Speed and Length Increase:\n"
				+ "     - As the snake grows, its length and speed increase. \n"
				+ "  6. Levels: \n"
				+ "     - Speed and dynamite frequency increase with each level. \n"
				+ "  Remember, the goal is to keep the snake's length above 3, avoid dynamites, and progress through levels by increasing the snake's length. Good luck!);");

		Font font = Font.font("Arial", 14);
		instructionsText.setFont(font);
		dialogPane.setContent(instructionsText);
		alert.showAndWait();
	}

}
