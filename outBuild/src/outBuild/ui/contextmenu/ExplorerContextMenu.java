
package outBuild.ui.contextmenu;
import outBuild.ui.dialog.ProjectDialog;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ExplorerContextMenu extends ContextMenu {
	public ExplorerContextMenu(Stage primaryStage) {
        Menu menu1 = new Menu("New");
        MenuItem menuItem2 = new MenuItem("Open");
        MenuItem menuItem3 = new MenuItem("Copy");
        
        MenuItem menuItem11 = new MenuItem("Project");
        MenuItem menuItem12 = new MenuItem("Class");

        menuItem11.setOnAction((ActionEvent ae) -> {
            try {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(ProjectDialog.class.getResource("ProjectDialog.fxml"));
				GridPane g = (GridPane)loader.load();
	            Scene dialogScene = new Scene(g);
	            dialog.setScene(dialogScene);
	            dialog.show();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
        
        menu1.getItems().addAll(menuItem11, menuItem12);

        this.getItems().addAll(menu1, menuItem2, menuItem3);
	}
}
