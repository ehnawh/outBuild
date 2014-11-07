package fxmlOutBuild;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class MainAppController {

	@FXML
	private TreeView<String> projectTreeView;
	@FXML
	private TreeView<String> materialTreeView;
	@FXML
	private TableView<Property> propertyTableView; 
	@FXML
	private TableColumn<Property, String> nameColumn;
	@FXML
	private TableColumn<Property, Integer> valueColumn;
	@FXML
	private TableView<Product> productTableView;
	@FXML
	private TableColumn<Product, String> productNameColumn;
	@FXML
	private TableColumn<Product, String> productFuncColumn;
	@FXML
	private TableColumn<Product, String> productQuantityColumn;
	@FXML
	private TableColumn<Product, String> productPriceColumn;
	@FXML
	private TableColumn<Product, String> productNoteColumn;
	
	private MainApp mainApp;
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		projectTreeView.setRoot(new TreeItem<String>("토공"));
		projectTreeView.getRoot().setExpanded(true);
		projectTreeView.getRoot().getChildren().addAll(mainApp.getTreeItems());
		
		propertyTableView.setItems(mainApp.getPropertyData());
		productTableView.setItems(mainApp.getProductData());
	}
	
	@FXML
	private void initialize() {
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//		valueColumn.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
		
		productNameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		productFuncColumn.setCellValueFactory(cellData -> cellData.getValue().funcProperty());
		productQuantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());
		productPriceColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
		productNoteColumn.setCellValueFactory(cellData -> cellData.getValue().noteProperty());
	}
}
