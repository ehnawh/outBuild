package outBuild.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Product {
	private IntegerProperty id;
	private IntegerProperty classificationId;
	private IntegerProperty itemId;
	private StringProperty calculus;
	private IntegerProperty quantity;
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public IntegerProperty getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(IntegerProperty classificationId) {
		this.classificationId = classificationId;
	}
	public IntegerProperty getItemId() {
		return itemId;
	}
	public void setItemId(IntegerProperty itemId) {
		this.itemId = itemId;
	}
	public StringProperty getCalculus() {
		return calculus;
	}
	public void setCalculus(StringProperty calculus) {
		this.calculus = calculus;
	}
	public IntegerProperty getQuantity() {
		return quantity;
	}
	public void setQuantity(IntegerProperty quantity) {
		this.quantity = quantity;
	}
}
