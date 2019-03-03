package design.PageCreate.design;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.junit.Test;

import design.PageCreate.creater.CssCreater;
import design.PageCreate.creater.DivCreater;
import design.PageCreate.creater.HtmlCreater;
import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.container.impl.DefaultColContainer;
import design.PageCreate.domain.container.impl.DefaultRowContainer;
import design.PageCreate.domain.container.impl.DefaultTableContainer;
import design.PageCreate.domain.container.impl.col.ColSplitContainer;
import design.PageCreate.domain.container.impl.row.RowSplitContainer;
import design.PageCreate.domain.container.impl.table.FixBoxContainer;
import design.PageCreate.domain.container.impl.table.FullContainer;
import design.PageCreate.domain.element.InputElement;
import design.PageCreate.domain.element.LinkElement;
import design.PageCreate.domain.style.CssStyle;

public class MyNavigationBarGrid {
	
	
	public static void main(String[] args) throws DocumentException {
		new MyNavigationBarGrid().call();
	}

	/*
	 * public void call() { CssCreater cssCreater = new CssCreater(); DivCreater
	 * divCreater = new DivCreater(); Container<Container> rootContainer =
	 * designContainer(); Element create = divCreater.create(rootContainer);
	 * 
	 * HashMap<String, String> cssnameContentMap =
	 * cssCreater.getCssnameContentMap(rootContainer); for(String s :
	 * cssnameContentMap.values()){ System.out.println(s); }
	 * 
	 * 
	 * System.out.println(create); }
	 */
	
	public void call() throws DocumentException {
		Container rootContainer = designContainer();
		
		String create = HtmlCreater.create(new File("D:/Test/test.html"), "utf-8", rootContainer);
		System.out.println(create);
	}

	

	private Container designContainer() {
		TableContainer fullContainer = new FullContainer();
		TableContainer navBarContainer = new FixBoxContainer();
		RowSplitContainer navBarRowContainer = new RowSplitContainer(12);
		ColSplitContainer textItemCol = new ColSplitContainer(9);
		ColSplitContainer searchItemCol = new ColSplitContainer(3);

		navBarContainer.addSubContainer(navBarRowContainer);
		fullContainer.addSubContainer(navBarContainer);
		navBarRowContainer.addSubContainer(textItemCol);
		navBarRowContainer.addSubContainer(searchItemCol);
		
		
		TableContainer navItemContainer = new FullContainer();
		RowContainer navItemsRow = new DefaultRowContainer();
		ColContainer link1Container = new DefaultColContainer();
		ColContainer link2Container = new DefaultColContainer();
		ColContainer link3Container = new DefaultColContainer();
		LinkElement link1 = new LinkElement("link1","#", "");
		LinkElement link2 = new LinkElement("link2","#", "");
		LinkElement link3 = new LinkElement("link3","#", "");

		textItemCol.addSubContainer(navItemContainer);
		navItemContainer.addSubContainer(navItemsRow);
		navItemsRow.addSubContainer(link1Container);
		navItemsRow.addSubContainer(link2Container);
		navItemsRow.addSubContainer(link3Container);
		link1Container.setElement(link1);
		link2Container.setElement(link2);
		link3Container.setElement(link3);
		
		
		TableContainer navSearchContainer = new DefaultTableContainer();
		RowContainer navSearchRow = new DefaultRowContainer();
		ColContainer searchBoxCol = new DefaultColContainer();
		ColContainer searchTextCol = new DefaultColContainer();
		InputElement searchBox = new InputElement("text" , "searchbox2");
		LinkElement searchButton = new LinkElement("search","#", "#");

		searchItemCol.addSubContainer(navSearchContainer);
		navSearchContainer.addSubContainer(navSearchRow);
		navSearchRow.addSubContainer(searchBoxCol);
		navSearchRow.addSubContainer(searchTextCol);
		searchBoxCol.setElement(searchBox);
		searchTextCol.setElement(searchButton);
		
		
		
		return fullContainer;
	}
}
