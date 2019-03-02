package design.PageCreate.domain.element;

public class TextElement extends ColElement{
	private String value;

	public TextElement(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
