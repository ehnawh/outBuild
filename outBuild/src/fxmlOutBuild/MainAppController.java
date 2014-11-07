package fxmlOutBuild;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class MainAppController {

	@FXML
	private TreeView<String> projectTreeView;
	@FXML
	private TableView<Property> propertyTableView; 
	@FXML
	private TableColumn<Property, String> nameColumn;
	@FXML
	private TableColumn<Property, Integer> valueColumn;
	private MainApp mainApp;
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		projectTreeView.setRoot(new TreeItem<String>("토공"));
		projectTreeView.getRoot().setExpanded(true);
		projectTreeView.getRoot().getChildren().addAll(mainApp.getTreeItems());
		
		propertyTableView.setItems(mainApp.getPropertyData());
	}
	
	@FXML
	private void initialize() {
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//		valueColumn.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
	}
}
