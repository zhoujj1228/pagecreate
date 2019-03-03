package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.impl.FullBoxStyle;

public class FullContainer extends TableContainer {
	public static void main(String[] args) {
		
	}
	
	public FullContainer(){
		super();
		FullBoxStyle fbs = new FullBoxStyle();
		addCssStyle(fbs);
	}

	@Override
	public void beforeAddSubContainer(Container subContainer) {}

	@Override
	public void beforeSetSupContainer(Container supContainer) {}
}
