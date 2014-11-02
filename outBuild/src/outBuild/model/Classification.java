package outBuild.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Classification {
	private IntegerProperty id;
	private IntegerProperty projectId;
	private StringProperty name;
	private StringProperty type;
	private IntegerProperty group;
	private IntegerProperty level;
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public IntegerProperty getProjectId() {
		return projectId;
	}
	public void setProjectId(IntegerProperty projectId) {
		this.projectId = projectId;
	}
	public StringProperty getName() {
		return name;
	}
	public void setName(StringProperty name) {
		this.name = name;
	}
	public StringProperty getType() {
		return type;
	}
	public void setType(StringProperty type) {
		this.type = type;
	}
	public IntegerProperty getGroup() {
		return group;
	}
	public void setGroup(IntegerProperty group) {
		this.group = group;
	}
	public IntegerProperty getLevel() {
		return level;
	}
	public void setLevel(IntegerProperty level) {
		this.level = level;
	}
}
