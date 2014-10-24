package outBuild.menus;

import outBuild.menus.menu.FileMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class TopMenuBar extends MenuBar {

	public TopMenuBar() {
		this.getMenus().add(new FileMenu());
		this.getMenus().add(new Menu("Edit"));
		this.getMenus().add(new Menu("View"));
		this.getMenus().add(new Menu("Setting"));
	}
	
}
