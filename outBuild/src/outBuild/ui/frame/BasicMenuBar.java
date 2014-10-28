package outBuild.ui.frame;

import outBuild.ui.menu.FileMenu;
import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class BasicMenuBar extends MenuBar {

	public BasicMenuBar() {
		this.paddingProperty().set(new Insets(3));
		this.getMenus().add(new FileMenu());
		this.getMenus().add(new Menu("Edit"));
		this.getMenus().add(new Menu("View"));
		this.getMenus().add(new Menu("Setting"));
	}
	
}
