package outBuild.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Item {
	private IntegerProperty id;
	private IntegerProperty itemCategoryId;
	private StringProperty goodsName;
	private StringProperty standard;
	private StringProperty measure;
	private StringProperty calculusId;
	private IntegerProperty extraCharge;
	private StringProperty exchangeMeasure;
	private StringProperty scaleFactor;
	private StringProperty desc;
	private IntegerProperty parentId;
	
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public IntegerProperty getItemCategoryId() {
		return itemCategoryId;
	}
	public void setItemCategoryId(IntegerProperty itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
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
	public StringProperty getCalculusId() {
		return calculusId;
	}
	public void setCalculusId(StringProperty calculusId) {
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
