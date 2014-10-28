package outBuild.ui.menuItem;

import javafx.application.Platform;
import javafx.scene.control.MenuItem;

public class ExitMenuItem extends MenuItem {

	final private String name = "Exit";
	
	public ExitMenuItem() {
		this.setText(this.name);
		this.setOnAction(actionEvent -> Platform.exit());
	}
}
