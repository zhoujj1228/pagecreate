package design.PageCreate.domain.element;

public class InputElement extends ColElement {
	private String type;
	private String value;

	public InputElement(String type, String value) {
		super();
		setTagName("input");
		this.type = type;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
