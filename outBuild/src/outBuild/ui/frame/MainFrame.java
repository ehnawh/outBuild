package outBuild.ui.frame;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class MainFrame extends GridPane {

	public MainFrame(Stage primaryStage) {
		ColumnConstraints columnConstraints = new ColumnConstraints();
		columnConstraints.setPercentWidth(100);
		this.getColumnConstraints().add(columnConstraints);
		RowConstraints rowConstraints = new RowConstraints();
		rowConstraints.setPercentHeight(100);
		this.getRowConstraints().add(rowConstraints);
		
		this.getChildren().addAll(new BasicMenuBar(), new ContentsFrame(primaryStage));
	}
}
