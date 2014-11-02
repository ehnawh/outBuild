package outBuild.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class Project {
	private IntegerProperty id;
	private ObjectProperty<LocalDate> regdate;
	private StringProperty planFrom;
	private IntegerProperty buildingArea;
	private IntegerProperty totalArea;
	private IntegerProperty height;
	private StringProperty location;
	private StringProperty period;
	private StringProperty requesFrom;
	private StringProperty constructionType;
	private StringProperty cladding;
	private StringProperty buildingStructure;
	private StringProperty desc;
	private StringProperty materialType;
	private StringProperty resourceType;
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public ObjectProperty<LocalDate> getRegdate() {
		return regdate;
	}
	public void setRegdate(ObjectProperty<LocalDate> regdate) {
		this.regdate = regdate;
	}
	public StringProperty getPlanFrom() {
		return planFrom;
	}
	public void setPlanFrom(StringProperty planFrom) {
		this.planFrom = planFrom;
	}
	public IntegerProperty getBuildingArea() {
		return buildingArea;
	}
	public void setBuildingArea(IntegerProperty buildingArea) {
		this.buildingArea = buildingArea;
	}
	public IntegerProperty getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(IntegerProperty totalArea) {
		this.totalArea = totalArea;
	}
	public IntegerProperty getHeight() {
		return height;
	}
	public void setHeight(IntegerProperty height) {
		this.height = height;
	}
	public StringProperty getLocation() {
		return location;
	}
	public void setLocation(StringProperty location) {
		this.location = location;
	}
	public StringProperty getPeriod() {
		return period;
	}
	public void setPeriod(StringProperty period) {
		this.period = period;
	}
	public StringProperty getRequesFrom() {
		return requesFrom;
	}
	public void setRequesFrom(StringProperty requesFrom) {
		this.requesFrom = requesFrom;
	}
	public StringProperty getConstructionType() {
		return constructionType;
	}
	public void setConstructionType(StringProperty constructionType) {
		this.constructionType = constructionType;
	}
	public StringProperty getCladding() {
		return cladding;
	}
	public void setCladding(StringProperty cladding) {
		this.cladding = cladding;
	}
	public StringProperty getBuildingStructure() {
		return buildingStructure;
	}
	public void setBuildingStructure(StringProperty buildingStructure) {
		this.buildingStructure = buildingStructure;
	}
	public StringProperty getDesc() {
		return desc;
	}
	public void setDesc(StringProperty desc) {
		this.desc = desc;
	}
	public StringProperty getMaterialType() {
		return materialType;
	}
	public void setMaterialType(StringProperty materialType) {
		this.materialType = materialType;
	}
	public StringProperty getResourceType() {
		return resourceType;
	}
	public void setResourceType(StringProperty resourceType) {
		this.resourceType = resourceType;
	}

}
