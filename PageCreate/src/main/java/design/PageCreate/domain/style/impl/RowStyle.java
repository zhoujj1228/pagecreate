package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class RowStyle extends ClassCssStyle{
	public RowStyle(){
		super();
		this.name = "row";
		map.put(CssKeyConstants.display, CssValueConstants.display_flex);
		map.put(CssKeyConstants.width, CssValueConstants.width_full);
		map.put(CssKeyConstants.flexWrap, CssValueConstants.flexWrap_wrap);
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_orange);
	
	}
}