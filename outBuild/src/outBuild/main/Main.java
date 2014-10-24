package outBuild.main;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import outBuild.menus.TopMenuBar;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("산출 프로그램");
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 900, 600, Color.WHITE);
		
		TopMenuBar topMenuBar = new TopMenuBar();
		root.setTop(topMenuBar);
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(5));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		ColumnConstraints column1 = new ColumnConstraints(150, 150, Double.MAX_VALUE);
		ColumnConstraints column2 = new ColumnConstraints(50);
		ColumnConstraints column3 = new ColumnConstraints(150, 150, Double.MAX_VALUE);
		column1.setHgrow(Priority.ALWAYS);
		column3.setHgrow(Priority.ALWAYS);
		gridPane.getColumnConstraints().addAll(column1, column2, column3);
		
		final ObservableList<String> testData = FXCollections.observableArrayList("test1", "test2");
		final ListView<String> listView = new ListView<String>(testData);
		gridPane.add(listView, 0, 1);
		TreeItem<String> treeItems = new TreeItem<>("test11");
		TreeView<String> treeView = new TreeView<String>(treeItems);
		gridPane.add(treeView, 2, 1);
		
		root.setCenter(gridPane);
		GridPane.setVgrow(root, Priority.ALWAYS);
		
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
