package design.PageCreate.domain.style.impl;

import design.PageCreate.constant.css.CssKeyConstants;
import design.PageCreate.domain.style.ClassCssStyle;

public class ColSplitStyle extends ColStyle{
	public ColSplitStyle(double colHoldPercent, int colHoldPart, int rowSplitNum){
		super();
		this.name = "col-" + rowSplitNum + "-" + colHoldPart;
		String widthValue = colHoldPercent + "%";
		map.put(CssKeyConstants.width, widthValue);
	}
}
