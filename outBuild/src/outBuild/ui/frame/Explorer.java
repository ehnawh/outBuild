package outBuild.ui.frame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Explorer extends TreeView<String> {

	public Explorer() {
		this.paddingProperty().set(new Insets(3));
		TreeItem<String> root = new TreeItem<>("전체 항목");
		root.setExpanded(true);
		root.getChildren().add(new TreeItem<>("SIDE-P/전개1-1"));
		root.getChildren().add(new TreeItem<>("S/P토류(전2하-1)"));
		root.getChildren().add(new TreeItem<>("CIP/전개도1-1"));
		root.getChildren().add(new TreeItem<>("LW-G/전개도1-1"));
		this.setRoot(root);
	}
}
