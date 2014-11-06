package outBuild.ui.frame;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import outBuild.ui.contextmenu.ExplorerContextMenu;

public class ContentsFrame extends BorderPane {

	public ContentsFrame(Stage primaryStage) {
		Explorer explorer = new Explorer();
		ExplorerContextMenu ecm = new ExplorerContextMenu(primaryStage);
        
        explorer.setOnMouseClicked((MouseEvent me) -> {
			if (me.getButton() == MouseButton.SECONDARY) { 
				System.out.println("right mouse button clicked");
				ecm.show(primaryStage, me.getScreenX(),me.getScreenY());
				me.consume();
			}
        });

		this.setTop(new BasicToolBar());
		this.setLeft(explorer);
		this.setCenter(new Workspace());
		this.setRight(new ExtraWorkspace());
		this.setBottom(new StatusBar());
	}
}
