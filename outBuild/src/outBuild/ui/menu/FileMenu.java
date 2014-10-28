package outBuild.ui.menu;

import javafx.collections.ObservableList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import outBuild.ui.menuItem.ExitMenuItem;
import outBuild.ui.menuItem.NewMenuItem;
import outBuild.ui.menuItem.SaveMenuItem;

public class FileMenu extends Menu {
	
	final private String name = "File";
	
	public FileMenu() {
		this.setText(this.name);
		
		ObservableList<MenuItem> menuItems = this.getItems();
		menuItems.add(new NewMenuItem());
		menuItems.add(new SaveMenuItem());
		menuItems.add(new SeparatorMenuItem());
		menuItems.add(new ExitMenuItem());
	}
}
