package fxmlOutBuild;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

	private StringProperty name;
	private StringProperty standard;
	private StringProperty func;
	private StringProperty quantity;
	private StringProperty price;
	private StringProperty note;
	
	public Product(String name, String standard, String func, String quantity, String price, String note) {
		this.name = new SimpleStringProperty(name);
		this.standard = new SimpleStringProperty(standard);
		this.func = new SimpleStringProperty(func);
		this.quantity = new SimpleStringProperty(quantity);
		this.price = new SimpleStringProperty(price);
		this.note = new SimpleStringProperty(note);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getStandard() {
		return standard.get();
	}
	
	public void setStandard(String standard) {
		this.standard.set(standard);
	}

	public String getFunc() {
		return func.get();
	}

	public void setFunc(String func) {
		this.func.set(func);
	}

	public String getQuantity() {
		return quantity.get();
	}

	public void setQuantity(String quantity) {
		this.quantity.set(quantity);
	}

	public String getPrice() {
		return price.get();
	}

	public void setPrice(String price) {
		this.price.set(price);
	}

	public String getNote() {
		return note.get();
	}

	public void setNote(String note) {
		this.note.set(note);
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public StringProperty standardProperty() {
		return standard;
	}
	
	public StringProperty funcProperty() {
		return func;
	}
	
	public StringProperty quantityProperty() {
		return quantity;
	}
	

	public StringProperty priceProperty() {
		return price;
	}
	
	public StringProperty noteProperty() {
		return note;
	}
}
