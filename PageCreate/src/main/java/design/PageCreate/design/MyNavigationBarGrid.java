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
import design.PageCreate.domain.element.InputElement;
import design.PageCreate.domain.element.LinkElement;
import design.PageCreate.domain.style.CssStyle;

public class MyNavigationBarGrid {
	
	
	public static void main(String[] args) {
		new MyNavigationBarGrid().call();
	}

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
		
		ColSplitContainer textItemCol = new ColSplitContainer(9);
		ColSplitContainer searchItemCol = new ColSplitContainer(3);

		navBarRowContainer.addSubContainer(textItemCol);
		navBarRowContainer.addSubContainer(searchItemCol);
		
		
		TableContainer<RowContainer> navItemContainer = new TableContainer<>();
		textItemCol.addSubContainer(navItemContainer);
		RowContainer<ColContainer> navItemsRow = new RowContainer<>();
		navItemContainer.addSubContainer(navItemsRow);
		ColContainer link1Container = new ColContainer();
		ColContainer link2Container = new ColContainer();
		ColContainer link3Container = new ColContainer();
		LinkElement link1 = new LinkElement("link1","#", "");
		LinkElement link2 = new LinkElement("link2","#", "");
		LinkElement link3 = new LinkElement("link3","#", "");
		link1Container.setElement(link1);
		link2Container.setElement(link2);
		link3Container.setElement(link3);
		navItemsRow.addSubContainer(link1Container);
		navItemsRow.addSubContainer(link2Container);
		navItemsRow.addSubContainer(link3Container);
		
		TableContainer<RowContainer> navSearchContainer = new TableContainer<>();
		textItemCol.addSubContainer(navSearchContainer);
		RowContainer<ColContainer> navSearchRow = new RowContainer<>();
		navSearchContainer.addSubContainer(navSearchRow);
		ColContainer searchBoxCol = new ColContainer();
		ColContainer searchTextCol = new ColContainer();
		navSearchRow.addSubContainer(searchBoxCol);
		navSearchRow.addSubContainer(searchTextCol);
		
		InputElement searchBox = new InputElement();
		InputElement searchButton = new InputElement();
		
		searchBoxCol.setElement(searchBox);
		searchTextCol.setElement(searchButton);
		
		
		
		return fullContainer;
	}
}
