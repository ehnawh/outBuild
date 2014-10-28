package outBuild.ui.frame;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class ExtraWorkspace extends TabPane {

	public ExtraWorkspace() {
		this.paddingProperty().set(new Insets(3));
		this.getTabs().add(new Tab("Tab1"));
		this.getTabs().add(new Tab("Tab2"));
		this.getTabs().add(new Tab("Tab3"));
	}
}
