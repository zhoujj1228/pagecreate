package design.PageCreate.design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import design.PageCreate.creater.CssCreater;
import design.PageCreate.creater.DivCreater;
import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.container.impl.ColSplitContainer;
import design.PageCreate.domain.container.impl.FixBoxContainer;
import design.PageCreate.domain.container.impl.FullContainer;
import design.PageCreate.domain.container.impl.RowSplitContainer;
import design.PageCreate.domain.style.CssStyle;

public class MyNavigationBarGrid {
	
	
	public static void main(String[] args) {
		new MyNavigationBarGrid().call();
	}

	@Test
	public void call() {
		CssCreater cssCreater = new CssCreater();
		DivCreater divCreater = new DivCreater();
		Container<Container> rootContainer = designContainer();
		String create = divCreater.create(rootContainer);
		
		HashMap<String, String> cssnameContentMap = cssCreater.getCssnameContentMap(rootContainer);
		for(String s : cssnameContentMap.values()){
			System.out.println(s);
		}
		

		System.out.println(create);
	}

	

	private Container designContainer() {
		TableContainer fullContainer = new FullContainer();
		TableContainer navBarContainer = new FixBoxContainer();
		fullContainer.addSubContainer(navBarContainer);
		
		RowSplitContainer<ColSplitContainer> navBarRowContainer = new RowSplitContainer<>(12);
		navBarContainer.addSubContainer(navBarRowContainer);
		
		ColSplitContainer textItem1 = new ColSplitContainer(1);
		ColSplitContainer textItem2 = new ColSplitContainer(1);
		ColSplitContainer textItem3 = new ColSplitContainer(1);
		ColSplitContainer searchBoxItem = new ColSplitContainer(8);
		ColSplitContainer searchTextItem = new ColSplitContainer(1);
		textItem1.setValue("textItem1");
		textItem2.setValue("textItem2");
		textItem3.setValue("textItem3");
		searchBoxItem.setValue("searchBoxItem");
		searchTextItem.setValue("searchTextItem");
		
		navBarRowContainer.addSubContainer(textItem1);
		navBarRowContainer.addSubContainer(textItem2);
		navBarRowContainer.addSubContainer(textItem3);
		
		navBarRowContainer.addSubContainer(searchBoxItem);
		navBarRowContainer.addSubContainer(searchTextItem);
		
		return fullContainer;
	}
}
