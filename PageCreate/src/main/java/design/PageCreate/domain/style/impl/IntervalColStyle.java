package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class IntervalColStyle extends ClassCssStyle{

	protected IntervalColStyle() {
		this.name = "intervalCol";
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_blue);
		
	}
	
}
