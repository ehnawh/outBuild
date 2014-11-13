package fxmlOutBuild;

import java.io.IOException;

import fxmlOutBuild.model.Material;
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
	private ObservableList<TreeItem<String>> projectItems = FXCollections
			.observableArrayList();
	private ObservableList<TreeItem<String>> materialItems = FXCollections
			.observableArrayList();
	private ObservableList<Property> propertyData = FXCollections
			.observableArrayList();
	private ObservableList<Product> productData = FXCollections
			.observableArrayList();
	private ObservableList<Material> materialData = FXCollections
			.observableArrayList();

	public MainApp() {
		projectItems.add(new TreeItem<String>("SIDE-P/전개1-1"));
		projectItems.add(new TreeItem<String>("S/P토루(전2하-1)"));
		projectItems.add(new TreeItem<String>("CIP/전개도1-1"));
		projectItems.add(new TreeItem<String>("LW-G/전개도1-1"));
		projectItems.add(new TreeItem<String>("S_M_I_G/T전개도"));
		projectItems.add(new TreeItem<String>("띠장(전1상)S/P"));
		projectItems.add(new TreeItem<String>("띠장/전개도1/S-P"));
		projectItems.add(new TreeItem<String>("POST/P-코너STRUT"));
		projectItems.add(new TreeItem<String>("CONTER/S(좌상귀)"));
		projectItems.add(new TreeItem<String>("POST/P-M/S(NO)-8"));
		projectItems.add(new TreeItem<String>("MAIN/S(NO @@-@@ )"));
		projectItems.add(new TreeItem<String>("RAKER STRUT"));
		projectItems.add(new TreeItem<String>("EARTH ANCHOR"));
		projectItems.add(new TreeItem<String>("제거식 ANCHOR"));
		projectItems.add(new TreeItem<String>("SOIL NAIL"));
		projectItems.add(new TreeItem<String>("제거식ROCK NAIL"));
		projectItems.add(new TreeItem<String>("POST P-복공"));
		projectItems.add(new TreeItem<String>("복공판 설치"));
		projectItems.add(new TreeItem<String>("CAP BEAN(전개도2)"));
		projectItems.add(new TreeItem<String>("계측관리공사"));
		projectItems.add(new TreeItem<String>("가설공사"));
		projectItems.add(new TreeItem<String>("토공사 GL"));
		projectItems.add(new TreeItem<String>("토공사(흙파기)"));
		projectItems.add(new TreeItem<String>("부대토목"));
		projectItems.add(new TreeItem<String>("파일공사"));
		
		TreeItem<String> mtype = new TreeItem<String>("지정 및 토공사");
		mtype.getChildren().add(new TreeItem("PHC파일(자재)"));
		mtype.getChildren().add(new TreeItem("EMC파일"));
		mtype.getChildren().add(new TreeItem("파일천공"));
		mtype.getChildren().add(new TreeItem("파일기타공사"));
		mtype.getChildren().add(new TreeItem("팽이말뚝"));
		mtype.getChildren().add(new TreeItem("영구방수"));
		
		materialItems.add(new TreeItem<String>("공통 가설 공사"));
		materialItems.add(new TreeItem<String>("가설공사"));
		materialItems.add(mtype);
		materialItems.add(new TreeItem<String>("철근 콘크리트 공사"));
		materialItems.add(new TreeItem<String>("철골공사"));
		materialItems.add(new TreeItem<String>("조적공사"));
		materialItems.add(new TreeItem<String>("방수공사"));
		materialItems.add(new TreeItem<String>("타일공사"));
		materialItems.add(new TreeItem<String>("석공사"));

		propertyData.add(new Property("일반토사층 최고깊이", 0));
		propertyData.add(new Property("일반토사층 최저깊이", 0));
		propertyData.add(new Property("자갈섞인 점토층 최고깊이", 0));
		propertyData.add(new Property("자갈섞인 점토층 최저깊이", 0));
		propertyData.add(new Property("천공깊이-자갈섞인 점토 최고깊이", 0));
		propertyData.add(new Property("천공깊이-자갈섞인 점토 최저깊", 0));
		propertyData.add(new Property("보통암층 최고깊이", 0));
		propertyData.add(new Property("보통암층 최저깊이", 0));
		propertyData.add(new Property("파일천공공수", 0));

		productData.add(new Product("SIDE-PILE 천공", "일반토사층", "(일반토사층 최고깊이+일반토사층 최저깊이)/2 * 파일천공공수", "1", "100", ""));
		productData.add(new Product("SIDE-PILE 천공", "자갈섞인 점토층", "(자갈섞인 점토층 최고깊이+자갈섞인 점토층 최저깊이)/2 * 파일천공공수", "1", "100", ""));
		productData.add(new Product("SIDE-PILE 천공", "모래섞인 자갈층", "(모래섞인 자갈층 최고깊이+모래섞인 자갈층 최저깊이)/2 * 파일천공공수", "1", "100", ""));
		productData.add(new Product("SIDE-PILE 천공", "보통암층", "(보통암층 최고깊이+보통암층 최저깊이)/2 * 파일천공공수", "1", "100", ""));
		
		materialData.add(new Material(1, "SIDE-PILE 천공", "보통암층", "M", "", "", "설명", 0, 0, 0, 0));
	}

	public ObservableList<TreeItem<String>> getProjectItems() {
		return this.projectItems;
	}

	public ObservableList<TreeItem<String>> getMaterialItems() {
		return this.materialItems;
	}

	public ObservableList<Property> getPropertyData() {
		return this.propertyData;
	}

	public ObservableList<Product> getProductData() {
		return this.productData;
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
			this.root = (VBox) loader.load();

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
