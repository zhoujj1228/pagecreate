package design.PageCreate.domain.container;

import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;
import design.PageCreate.domain.style.impl.RowStyle;

public abstract class RowContainer extends Container{
	public RowContainer(){
		CssStyle rs = new RowStyle();
		addCssStyle(rs);
	}
}
