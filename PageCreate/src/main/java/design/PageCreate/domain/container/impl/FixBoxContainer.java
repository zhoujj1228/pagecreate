package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;

public class FixBoxContainer extends TableContainer {
	public FixBoxContainer(){
		super();
		CssStyle fbs = new FixBoxStyle();
		addCssStyle(fbs);
	}
}
