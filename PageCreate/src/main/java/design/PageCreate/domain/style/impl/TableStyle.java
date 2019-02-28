package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class TableStyle extends ClassCssStyle{
	TableStyle(){
		this.name = "table";
		map.put(CssKeyConstants.flexWrap, CssValueConstants.flexWrap_wrap);
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_red);
	
	}
}
