package fxmlOutBuild;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Property {

	private StringProperty name;
	private IntegerProperty value;
	private StringProperty note;
	
	public Property() {
		this(null, 0);
	}
	
	public Property(String name, Integer value) {
		this.name = new SimpleStringProperty(name);
		this.value = new SimpleIntegerProperty(value);
	}
	
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	public StringProperty nameProperty() {
		return name;
	}
	
	public Integer getValue() {
		return value.get();
	}
	public void setValue(Integer value) {
		this.value.set(value);
	}
	public IntegerProperty valueProperty() {
		return this.value;
	}
	
	public String getNote() {
		return note.get();
	}
	public void setNote(String note) {
		this.note.set(note);
	}
	public StringProperty noteProperty() {
		return this.note;
	}
}
