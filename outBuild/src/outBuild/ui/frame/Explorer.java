package outBuild.ui.frame;

import javafx.geometry.Insets;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

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
