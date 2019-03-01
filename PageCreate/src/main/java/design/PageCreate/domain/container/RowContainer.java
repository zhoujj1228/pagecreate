package design.PageCreate.domain.container;

import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;
import design.PageCreate.domain.style.impl.RowStyle;

public class RowContainer<T extends ColContainer> extends Container<T>{
	public RowContainer(){
		CssStyle rs = new RowStyle();
		addCssStyle(rs);
	}
}
