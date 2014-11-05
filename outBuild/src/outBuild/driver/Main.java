package outBuild.driver;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import outBuild.ui.frame.MainFrame;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		MainFrame root = new MainFrame(primaryStage);
		Scene scene = new Scene(root, 1600, 800, Color.WHITE);
		
		scene.getStylesheets().add(getClass().getResource("/outBuild/style/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void initialize(Stage primaryStage) {
		primaryStage.setTitle("산출 프로그램");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
