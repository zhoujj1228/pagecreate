package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class FixBoxStyle extends TableStyle {
	
	public FixBoxStyle(){
		this.name = "fixBox";
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_red);
		map.put(CssKeyConstants.width, CssValueConstants.width_1000px);
		map.put(CssKeyConstants.marginLeft, CssValueConstants.marginLeft_auto);
		map.put(CssKeyConstants.marginRight, CssValueConstants.marginRight_auto);
	}
}
