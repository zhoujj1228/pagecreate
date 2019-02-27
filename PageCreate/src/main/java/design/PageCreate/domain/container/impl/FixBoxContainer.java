package design.PageCreate.domain.container.impl;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;

public class FixBoxContainer extends TableContainer {
	public FixBoxContainer(){
		super();
		List<String> classList = new ArrayList<>();
		CssStyle fbs = new FixBoxStyle();
		classList.add(fbs.getName());
		super.setClassNameList(classList);
	}
}
