package design.PageCreate.domain.element;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.HtmlTag;
import design.PageCreate.domain.style.CssStyle;

public class ColElement extends HtmlTag{
	private String tagName;

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}
