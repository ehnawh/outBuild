package outBuild.ui.frame;

import javafx.geometry.Insets;
import javafx.scene.control.TableView;

public class Resulter extends TableView<String> {

	public Resulter() {
		this.paddingProperty().set(new Insets(3));
	}
}
