package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class FullBoxStyle extends ClassCssStyle{
	public FullBoxStyle(){
		super();
		name = "fullBox";
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_red);
	}
}
