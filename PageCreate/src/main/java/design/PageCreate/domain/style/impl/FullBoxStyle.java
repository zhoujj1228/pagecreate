package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.constant.css.CssValueConstants;

public class FullBoxStyle extends TableStyle{
	public FullBoxStyle(){
		this.name = "fullBox";
		map.put(CssKeyConstants.backgroundColor, CssValueConstants.backgroundColor_purple);
	}
}
