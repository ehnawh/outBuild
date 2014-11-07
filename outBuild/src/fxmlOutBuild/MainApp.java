package fxmlOutBuild;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private VBox root;
	private ObservableList<TreeItem<String>> treeItems = FXCollections.observableArrayList();
	private ObservableList<Property> propertyData = FXCollections.observableArrayList();
	
	public MainApp() {
		treeItems.add(new TreeItem<String>("SIDE-P/전개1-1"));
		treeItems.add(new TreeItem<String>("S/P토루(전2하-1)"));
		treeItems.add(new TreeItem<String>("CIP/전개도1-1"));
		treeItems.add(new TreeItem<String>("LW-G/전개도1-1"));
		treeItems.add(new TreeItem<String>("S_M_I_G/T전개도"));
		treeItems.add(new TreeItem<String>("띠장(전1상)S/P"));
		treeItems.add(new TreeItem<String>("띠장/전개도1/S-P"));
		treeItems.add(new TreeItem<String>("POST/P-코너STRUT"));
		treeItems.add(new TreeItem<String>("CONTER/S(좌상귀)"));
		treeItems.add(new TreeItem<String>("POST/P-M/S(NO)-8"));
		treeItems.add(new TreeItem<String>("MAIN/S(NO @@-@@ )"));
		treeItems.add(new TreeItem<String>("RAKER STRUT"));
		treeItems.add(new TreeItem<String>("EARTH ANCHOR"));
		treeItems.add(new TreeItem<String>("제거식 ANCHOR"));
		treeItems.add(new TreeItem<String>("SOIL NAIL"));
		treeItems.add(new TreeItem<String>("제거식ROCK NAIL"));
		treeItems.add(new TreeItem<String>("POST P-복공"));
		treeItems.add(new TreeItem<String>("복공판 설치"));
		treeItems.add(new TreeItem<String>("CAP BEAN(전개도2)"));
		treeItems.add(new TreeItem<String>("계측관리공사"));
		treeItems.add(new TreeItem<String>("가설공사"));
		treeItems.add(new TreeItem<String>("토공사 GL"));
		treeItems.add(new TreeItem<String>("토공사(흙파기)"));
		treeItems.add(new TreeItem<String>("부대토목"));
		treeItems.add(new TreeItem<String>("파일공사"));

		propertyData.add(new Property("토류판면적", 0));
		propertyData.add(new Property("파일천공개수", 0));
		propertyData.add(new Property("천공깊이-일반토사 최대높이", 0));
		propertyData.add(new Property("천공깊이-일반토사 최소높이", 0));
		propertyData.add(new Property("천공깊이-자갈섞인 점토 최대높이", 0));
		propertyData.add(new Property("천공깊이-자갈섞인 점토 최소높이", 0));
		propertyData.add(new Property("천공깊이-모래섞인 자갈 최대높이", 0));
		propertyData.add(new Property("천공깊이-모래섞인 자갈 최소높이", 0));
		propertyData.add(new Property("천공깊이-보통암 최대높이", 0));
		propertyData.add(new Property("천공깊이-보통암 최소높이", 0));
		propertyData.add(new Property("파일원주길이", 0));
		propertyData.add(new Property("파일 단면적", 0));
	}
	
	public ObservableList<TreeItem<String>> getTreeItems() {
		return this.treeItems;
	}
	
	public ObservableList<Property> getPropertyData() {
		return this.propertyData;
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("산출관리프로그램");
		
		initRootLayout();
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("main.fxml"));
			this.root = (VBox)loader.load();
			
			MainAppController controller = loader.getController();
			controller.setMainApp(this);
			
			Scene scene = new Scene(root);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Stage getPrimaryStage() {
		return this.primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
