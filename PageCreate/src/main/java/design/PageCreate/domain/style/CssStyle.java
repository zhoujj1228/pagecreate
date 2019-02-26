package design.PageCreate.domain.style;

import java.util.HashMap;

public class CssStyle {

	protected String name;
	protected HashMap<String, String> map = new HashMap<>();
	
	protected String floatStyle;
	protected String width;
	protected String height;
	protected String backgroundColor;
	protected String flexWrap;
	protected String textOverflow;
	protected String boxAlign;
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	public String getFloatStyle() {
		return floatStyle;
	}
	public void setFloatStyle(String floatStyle) {
		this.floatStyle = floatStyle;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getFlexWrap() {
		return flexWrap;
	}
	public void setFlexWrap(String flexWrap) {
		this.flexWrap = flexWrap;
	}
	public String getTextOverflow() {
		return textOverflow;
	}
	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
