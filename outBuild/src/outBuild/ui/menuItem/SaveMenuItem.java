package outBuild.ui.menuItem;

import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

public class SaveMenuItem extends MenuItem {

	final private String name = "Save";
	
	public SaveMenuItem() {
		this.setText(this.name);
		this.setMnemonicParsing(true);
		this.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.SHORTCUT_DOWN));
	}
}
