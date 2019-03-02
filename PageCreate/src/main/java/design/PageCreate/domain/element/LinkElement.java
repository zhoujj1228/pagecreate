package design.PageCreate.domain.element;

public class LinkElement extends TextElement {
	private String href;
	private String target;
	
	public LinkElement(String value, String href, String target) {
		super(value);
		this.href = href;
		this.target = target;
		setTagName("a");
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
}
