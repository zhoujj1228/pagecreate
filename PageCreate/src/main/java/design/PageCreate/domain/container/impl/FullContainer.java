package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.impl.FullBoxStyle;

public class FullContainer extends TableContainer {
	public FullContainer(){
		super();
		FullBoxStyle fbs = new FullBoxStyle();
		addCssStyle(fbs);
	}
}
