package outBuild.ui.frame;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Workspace extends TabPane {

	public Workspace() {
		this.paddingProperty().set(new Insets(3));
		Tab tab1 = new Tab("Tab1");
		Tab tab2 = new Tab("Tab2");
		this.getTabs().add(tab1);
		this.getTabs().add(tab2);
	}
}
