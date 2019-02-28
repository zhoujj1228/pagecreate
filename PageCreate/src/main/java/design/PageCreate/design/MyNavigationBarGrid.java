package design.PageCreate.design;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.container.impl.FixBoxContainer;
import design.PageCreate.domain.container.impl.FullContainer;
import design.PageCreate.domain.style.CssStyle;

public class MyNavigationBarGrid {
	
	List<CssStyle> cssStyleList = new LinkedList<>();
	
	public static void main(String[] args) {
		new MyNavigationBarGrid().call();
	}

	@Test
	public void call() {
		TableContainer fullContainer = new FullContainer();
		TableContainer navBarContainer = new FixBoxContainer();
		fullContainer.addSubContainer(navBarContainer);
		
		RowContainer navBarRowContainer = new RowContainer();
		navBarContainer.addSubContainer(navBarRowContainer);
		
		ColContainer textItem1 = new ColContainer();
		ColContainer textItem2 = new ColContainer();
		ColContainer textItem3 = new ColContainer();
		ColContainer searchBoxItem = new ColContainer();
		ColContainer searchTextItem = new ColContainer();
		
		navBarRowContainer.addSubContainer(textItem1);
		navBarRowContainer.addSubContainer(textItem2);
		navBarRowContainer.addSubContainer(textItem3);
		
		navBarRowContainer.addSubContainer(searchBoxItem);
		navBarRowContainer.addSubContainer(searchTextItem);
		
	}
}
