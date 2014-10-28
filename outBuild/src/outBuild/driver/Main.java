package outBuild.driver;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import outBuild.ui.frame.BasicMenuBar;
import outBuild.ui.frame.Explorer;
import outBuild.ui.frame.ExtraWorkspace;
import outBuild.ui.frame.Resulter;
import outBuild.ui.frame.Workspace;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 1600, 800, Color.WHITE);
		
		BasicMenuBar menuBar = new BasicMenuBar();
		root.setTop(menuBar);
		
		Explorer explorer = new Explorer();
		root.setLeft(explorer);
		
		Workspace workspace = new Workspace();
		root.setCenter(workspace);
		
		ExtraWorkspace extraWorkspace = new ExtraWorkspace();
		root.setRight(extraWorkspace);
		
		Resulter resulter = new Resulter();
		root.setBottom(resulter);
		
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
