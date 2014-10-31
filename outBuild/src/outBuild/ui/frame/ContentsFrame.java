package outBuild.ui.frame;

import javafx.scene.layout.BorderPane;

public class ContentsFrame extends BorderPane {

	public ContentsFrame() {
		this.setTop(new BasicToolBar());
		this.setLeft(new Explorer());
		this.setCenter(new Workspace());
		this.setRight(new ExtraWorkspace());
		this.setBottom(new StatusBar());
	}
}
