package outBuild.ui.frame;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

public class BasicToolBar extends ToolBar {

	public BasicToolBar() {
		this.paddingProperty().set(new Insets(3));
		this.getItems().add(new Button("Home"));
		this.getItems().add(new Button("Tools"));
		this.getItems().add(new Button("Options"));
		this.getItems().add(new Button("Help"));
	}
	
}
