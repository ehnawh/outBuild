package fxmlOutBuild.dialog;

import java.io.IOException;

import fxmlOutBuild.MainApp;
import fxmlOutBuild.MainAppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MaterialDialogMain extends Application {

	private Stage primaryStage;
	private AnchorPane root;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		this.initRootLayout();
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("dialog/MaterialDialog.fxml"));
			this.root = (AnchorPane) loader.load();

			Scene scene = new Scene(root);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
