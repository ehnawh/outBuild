package outBuild.ui.frame;

import javafx.geometry.VPos;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class MainFrame extends GridPane {

	public MainFrame(Stage primaryStage) {
		ColumnConstraints columnConstraints = new ColumnConstraints();
		columnConstraints.setPercentWidth(100);
		this.getColumnConstraints().add(columnConstraints);
//		RowConstraints rowConstraints = new RowConstraints();
//		rowConstraints.setPercentHeight(100);
//		this.getRowConstraints().add(rowConstraints);
		BasicMenuBar basicMenuBar = new BasicMenuBar(); 
		MainFrame.setValignment(basicMenuBar, VPos.TOP);
		ContentsFrame contentsFrame = new ContentsFrame(primaryStage);
		MainFrame.setValignment(contentsFrame, VPos.CENTER);
		this.add(basicMenuBar, 0, 0);
		this.add(contentsFrame, 0, 1);
	}
}
