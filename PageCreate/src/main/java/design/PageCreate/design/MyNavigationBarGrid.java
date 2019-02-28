package design.PageCreate.design;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.container.impl.ColSplitContainer;
import design.PageCreate.domain.container.impl.FixBoxContainer;
import design.PageCreate.domain.container.impl.FullContainer;
import design.PageCreate.domain.container.impl.RowSplitContainer;
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
		
		RowSplitContainer navBarRowContainer = new RowSplitContainer(12);
		navBarContainer.addSubContainer(navBarRowContainer);
		
		ColSplitContainer textItem1 = new ColSplitContainer(1);
		ColSplitContainer textItem2 = new ColSplitContainer(1);
		ColSplitContainer textItem3 = new ColSplitContainer(1);
		ColSplitContainer searchBoxItem = new ColSplitContainer(8);
		ColSplitContainer searchTextItem = new ColSplitContainer(1);
		
		navBarRowContainer.addSubContainer(textItem1);
		navBarRowContainer.addSubContainer(textItem2);
		navBarRowContainer.addSubContainer(textItem3);
		
		navBarRowContainer.addSubContainer(searchBoxItem);
		navBarRowContainer.addSubContainer(searchTextItem);
		
	}
}
