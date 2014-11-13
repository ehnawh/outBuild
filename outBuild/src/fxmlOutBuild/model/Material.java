package fxmlOutBuild.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Material {
	private IntegerProperty id;
	private StringProperty goodsName;
	private StringProperty standard;
	private StringProperty measure;
	private StringProperty exchangeMeasure;
	private StringProperty scaleFactor;
	private StringProperty desc;
	private IntegerProperty constructionType;
	private IntegerProperty calculusId;
	private IntegerProperty extraCharge;
	private IntegerProperty parentId;
	
	public Material(int id,  String goodsName, String standard, String measure
			, String exchangeMeasure, String scaleFactor, String desc
			,int constructionType, int calculusId, int extraCharge
			, int parentId) {
		this.id = new SimpleIntegerProperty(id);
		this.goodsName = new SimpleStringProperty(goodsName);
		this.standard = new SimpleStringProperty(standard);
		this.measure = new SimpleStringProperty(measure);
		this.exchangeMeasure = new SimpleStringProperty(exchangeMeasure);
		this.scaleFactor = new SimpleStringProperty(scaleFactor);
		this.desc = new SimpleStringProperty(desc);
		this.constructionType = new SimpleIntegerProperty(constructionType);
		this.calculusId = new SimpleIntegerProperty(calculusId);
		this.extraCharge = new SimpleIntegerProperty(extraCharge);
		this.parentId = new SimpleIntegerProperty(parentId);
	}
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public IntegerProperty getConstructionType() {
		return constructionType;
	}
	public void setConstructionType(IntegerProperty constructionType) {
		this.constructionType = constructionType;
	}
	public StringProperty getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(StringProperty goodsName) {
		this.goodsName = goodsName;
	}
	public StringProperty getStandard() {
		return standard;
	}
	public void setStandard(StringProperty standard) {
		this.standard = standard;
	}
	public StringProperty getMeasure() {
		return measure;
	}
	public void setMeasure(StringProperty measure) {
		this.measure = measure;
	}
	public IntegerProperty getCalculusId() {
		return calculusId;
	}
	public void setCalculusId(IntegerProperty calculusId) {
		this.calculusId = calculusId;
	}
	public IntegerProperty getExtraCharge() {
		return extraCharge;
	}
	public void setExtraCharge(IntegerProperty extraCharge) {
		this.extraCharge = extraCharge;
	}
	public StringProperty getExchangeMeasure() {
		return exchangeMeasure;
	}
	public void setExchangeMeasure(StringProperty exchangeMeasure) {
		this.exchangeMeasure = exchangeMeasure;
	}
	public StringProperty getScaleFactor() {
		return scaleFactor;
	}
	public void setScaleFactor(StringProperty scaleFactor) {
		this.scaleFactor = scaleFactor;
	}
	public StringProperty getDesc() {
		return desc;
	}
	public void setDesc(StringProperty desc) {
		this.desc = desc;
	}
	public IntegerProperty getParentId() {
		return parentId;
	}
	public void setParentId(IntegerProperty parentId) {
		this.parentId = parentId;
	}
}
