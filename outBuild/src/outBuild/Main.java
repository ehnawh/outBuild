package outBuild;
	
import java.util.Observer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("산출 프로그램");
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 270, Color.WHITE);
		
		MenuBar menuBar = new MenuBar();
		root.setTop(menuBar);
		
		Menu fileMenu = new Menu("File");
		fileMenu.setMnemonicParsing(true);
		
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		saveMenuItem.setMnemonicParsing(true);
		saveMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.SHORTCUT_DOWN));
		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.setOnAction(actionEvent -> Platform.exit());
		
		fileMenu.getItems().addAll(newMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);
		
		Menu cameraMenu = new Menu("Cameras");
		CheckMenuItem cam1MenuItem = new CheckMenuItem("Show Camera 1");
		cam1MenuItem.setSelected(true);
		CheckMenuItem cam2MenuItem = new CheckMenuItem("Show Camera 2");
		cam2MenuItem.setSelected(true);
		
		cameraMenu.getItems().addAll(cam1MenuItem, cam2MenuItem);
		
		Menu alarmMenu = new Menu("Alarm");
		
		ToggleGroup toggleGroup = new ToggleGroup();
		RadioMenuItem soundMenuItem = new RadioMenuItem("Sound Alarm");
		soundMenuItem.setToggleGroup(toggleGroup);
		
		RadioMenuItem stopAlramMenuItem = new RadioMenuItem("Alarm Off");
		stopAlramMenuItem.setToggleGroup(toggleGroup);
		stopAlramMenuItem.setSelected(true);
		
		alarmMenu.getItems().addAll(soundMenuItem, stopAlramMenuItem);
		
		Menu contigencyPlans = new Menu("Contingent Plans");
		contigencyPlans.getItems().addAll(
				new CheckMenuItem("Self Destruct in T minus 50"),
				new CheckMenuItem("Turn off the coffee machine"),
				new CheckMenuItem("Run for your lives"));
		
		alarmMenu.getItems().add(contigencyPlans);
		
		menuBar.getMenus().addAll(fileMenu, cameraMenu, alarmMenu);
		
		ContextMenu contextFileMenu = new ContextMenu(exitMenuItem);
		primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
			if(me.getButton() == MouseButton.SECONDARY || me.isControlDown()) {
				contextFileMenu.show(root, me.getSceneX(), me.getSceneY());
			} else {
				contextFileMenu.hide();
			}
		});
		
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
		
		Label candiatesLbl = new Label("Candiates");
		GridPane.setHalignment(candiatesLbl, HPos.CENTER);
		gridPane.add(candiatesLbl, 0, 0);
		
		Label heroesLbl = new Label("Heroes");
		gridPane.add(heroesLbl, 2, 0);
		GridPane.setHalignment(heroesLbl, HPos.CENTER);
		
		final ObservableList<String> candiates = FXCollections.observableArrayList(
				"Superman", "Spiderman", "Wolverine", "Police", "Fire Rescue", "Soldiers",
				"Dad & Mom", "Doctor", "Politician", "Pastor", "Teacher");
		final ListView<String> candiatesListView = new ListView<String>(candiates);
		gridPane.add(candiatesListView, 0, 1);
		
		final ObservableList<String> heroes = FXCollections.observableArrayList();
		final ListView<String> heroListView = new ListView<String>(heroes);
		gridPane.add(heroListView, 2, 1);
		
		Button sendRightButton = new Button(" > ");
		sendRightButton.setOnAction((ActionEvent event) -> {
			String potential = candiatesListView.getSelectionModel().getSelectedItem();
			candiates.remove(potential);
			heroes.add(potential);
		});
		
		Button sendLeftButton = new Button(" < ");
		sendLeftButton.setOnAction((ActionEvent event) -> {
			String notHero = heroListView.getSelectionModel().getSelectedItem();
			heroes.remove(notHero);
			candiates.add(notHero);
		});
		
		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(sendRightButton, sendLeftButton);
		
		gridPane.add(vbox, 1, 1);
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
