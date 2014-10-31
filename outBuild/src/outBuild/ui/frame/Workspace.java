package outBuild.ui.frame;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;

public class Workspace extends TabPane {
	private List<Tab> tabs;

	public Workspace() {
		this.paddingProperty().set(new Insets(3));
		tabs = new ArrayList<>();
		
		Tab tab = new Tab("Tab1");
		GridPane gridPane = new GridPane();
		final Button tabModeButton = new Button("Toggle Tab Mode");
		gridPane.getChildren().add(tabModeButton);
		tab.setContent(gridPane);
		tab.setTooltip(new Tooltip("full name"));
		tabs.add(tab);
		
		tabs.add(new Tab("name"));
//		Tab tab2 = new Tab("Tab2");
		this.getTabs().addAll(tabs);
//		this.getTabs().add(tab2);
		this.setRotateGraphic(false);
		this.setTabClosingPolicy(TabPane.TabClosingPolicy.SELECTED_TAB);
		this.setSide(Side.TOP);
		
	}
}
