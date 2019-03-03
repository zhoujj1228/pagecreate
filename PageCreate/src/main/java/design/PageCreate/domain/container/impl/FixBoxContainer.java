package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;

public class FixBoxContainer extends TableContainer {
	public FixBoxContainer(){
		super();
		CssStyle fbs = new FixBoxStyle();
		addCssStyle(fbs);
	}

	@Override
	public void beforeAddSubContainer(Container subContainer) {}

	@Override
	public void beforeSetSupContainer(Container supContainer) {}
}
