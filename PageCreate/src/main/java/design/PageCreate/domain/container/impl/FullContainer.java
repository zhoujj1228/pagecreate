package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.impl.FullBoxStyle;

public class FullContainer extends TableContainer {
	public FullContainer(){
		super();
		List<String> classList = new ArrayList<>();
		FullBoxStyle fbs = new FullBoxStyle();
		classList.add(fbs.getName());
		super.setClassNameList(classList);
	}
}
