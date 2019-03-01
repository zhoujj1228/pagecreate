package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class ColStyle extends ClassCssStyle{
	public ColStyle(){
		super();
		this.name = "col";
		map.put(CssKeyConstants.display, CssValueConstants.display_flex);
		map.put(CssKeyConstants.flexWrap, CssValueConstants.flexWrap_wrap);
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_yellow);
	
	}
}
