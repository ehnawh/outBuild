package outBuild.ui.dialog;

import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

public class ProjectDialog extends VBox{
	
	public ProjectDialog() {
        Label gridPerCaption = new Label("GridPane content placement by influencing row and column percentages.");
        gridPerCaption.setWrapText(true);
        GridPane gridPer = createGridPanePercentage();
 
        Label gridRCInfoCaption = new Label("GridPane content placement by influencing the rows and columns themselves:");
        gridRCInfoCaption.setWrapText(true);
        GridPane gridRCInfo = createGridPaneRCInfo();
 
        Label gridConstCaption = new Label("GridPane content placement by specifying rows and columns:");
        gridConstCaption.setWrapText(true);
        GridPane gridConst = createGridPaneConst();
 
        this.getChildren().addAll(gridPerCaption, gridPer, new Separator());
        this.getChildren().addAll(gridRCInfoCaption, gridRCInfo, new Separator());
        this.getChildren().addAll(gridConstCaption, gridConst);
	}
    
    //The resulting GridPane places the child by influencing the rows and columns
    //via GridRowInfo and GridColumnInfo. This grid uses the percentages
    private GridPane createGridPanePercentage() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(8, 8, 8, 8));
        RowConstraints rowinfo3 = new RowConstraints();
        rowinfo3.setPercentHeight(50);
 
        ColumnConstraints colInfo2 = new ColumnConstraints();
        colInfo2.setPercentWidth(25);
 
        ColumnConstraints colInfo3 = new ColumnConstraints();
        colInfo3.setPercentWidth(50);
 
        grid.getRowConstraints().add(rowinfo3);//2*50 percent
        grid.getRowConstraints().add(rowinfo3);
 
        grid.getColumnConstraints().add(colInfo2); //25 percent
        grid.getColumnConstraints().add(colInfo3); //50 percent
        grid.getColumnConstraints().add(colInfo2); //25 percent
 
        Label condLabel = new Label("공사명 :");
        GridPane.setHalignment(condLabel, HPos.RIGHT);
        GridPane.setConstraints(condLabel, 0, 0);
        TextField projectName = new TextField();
        GridPane.setMargin(projectName, new Insets(0, 0, 0, 10));
        GridPane.setConstraints(projectName, 1, 0);
 
        Label acctLabel = new Label("Member Number:");
        GridPane.setHalignment(acctLabel, HPos.RIGHT);
        GridPane.setConstraints(acctLabel, 0, 1);
        TextField textBox = new TextField("Your number");
        GridPane.setMargin(textBox, new Insets(10, 10, 10, 10));
        GridPane.setConstraints(textBox, 1, 1);
 
        Button button = new Button("Help");
        GridPane.setConstraints(button, 2, 1);
        GridPane.setMargin(button, new Insets(10, 10, 10, 10));
        GridPane.setHalignment(button, HPos.CENTER);
 
        grid.getChildren().addAll(condLabel, projectName, button, acctLabel, textBox);
        return grid;
    }
 
    //The resulting GridPane places the child by influencing the rows and columns themselves
    //via GridRowInfo and GridColumnInfo. This grid uses the preferred
    //width/height and max/min width/height.
    private GridPane createGridPaneRCInfo() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(8, 8, 8, 8));
 
        RowConstraints rowinfo = new RowConstraints(40, 40, 40);
        ColumnConstraints colinfo = new ColumnConstraints(90, 90, 90);
 
        for (int i = 0; i <= 2; i++) {
            grid.getRowConstraints().add(rowinfo);
        }
 
        for (int j = 0; j <= 2; j++) {
            grid.getColumnConstraints().add(colinfo);
        }
 
        Label category = new Label("Category:");
        GridPane.setHalignment(category, HPos.RIGHT);
        Label categoryValue = new Label("Coffee");
        Label company = new Label("Type:");
        GridPane.setHalignment(company, HPos.RIGHT);
        Label companyValue = new Label("Kona");
        Label rating = new Label("Rating:");
        GridPane.setHalignment(rating, HPos.RIGHT);
        Label ratingValue = new Label("Excellent");
 
        //Place content
        GridPane.setConstraints(category, 0, 0);
        GridPane.setConstraints(categoryValue, 1, 0);
        GridPane.setConstraints(company, 0, 1);
        GridPane.setConstraints(companyValue, 1, 1);
        GridPane.setConstraints(rating, 0, 2);
        GridPane.setConstraints(ratingValue, 1, 2);
        grid.getChildren().addAll(category, categoryValue, company, companyValue, rating, ratingValue);
        return grid;
    }
 
    //grid1 places the child by specifying the rows and columns in GridPane.setConstraints()
    private GridPane createGridPaneConst() {
        GridPane grid = new GridPane();
        grid.setHgap(4);
        grid.setVgap(6);
        grid.setPadding(new Insets(8, 8, 8, 8));
        grid.setGridLinesVisible(true);
 
        ObservableList<Node> content = grid.getChildren();
 
        Label label = new Label("Name:");
        GridPane.setConstraints(label, 0, 0);
        GridPane.setHalignment(label, HPos.RIGHT);
        content.add(label);
 
        label = new Label("John Q. Public");
        GridPane.setConstraints(label, 1, 0, 2, 1);
        GridPane.setHalignment(label, HPos.LEFT);
        content.add(label);
 
        label = new Label("Address:");
        GridPane.setConstraints(label, 0, 1);
        GridPane.setHalignment(label, HPos.RIGHT);
        content.add(label);
 
        label = new Label("12345 Main Street, Some City, CA");
        GridPane.setConstraints(label, 1, 1, 5, 1);
        GridPane.setHalignment(label, HPos.LEFT);
        content.add(label);
        return grid;
    }
}
