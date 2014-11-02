package outBuild.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Property {
	private IntegerProperty id;
	private StringProperty name;
	private StringProperty desc;
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public StringProperty getName() {
		return name;
	}
	public void setName(StringProperty name) {
		this.name = name;
	}
	public StringProperty getDesc() {
		return desc;
	}
	public void setDesc(StringProperty desc) {
		this.desc = desc;
	}
}
