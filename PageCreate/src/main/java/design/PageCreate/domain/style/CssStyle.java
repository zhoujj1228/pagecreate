package design.PageCreate.domain.style;

import java.util.HashMap;

public abstract class CssStyle {
	protected String namePrefix;
	protected Media media;
	protected String name;
	protected HashMap<String, String> map = new HashMap<>();
	
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
}
