package design.PageCreate.design;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.TableContainer;
import design.PageCreate.domain.container.impl.FixBoxContainer;
import design.PageCreate.domain.container.impl.FullContainer;

public class MyNavigationBarGrid {
	public static void main(String[] args) {
		Container fullContainer = new FullContainer();
		Container navBarContainer = new FixBoxContainer();
		fullContainer.putSubContainer(navBarContainer);
		
		Container navBarRowContainer = new RowContainer();
		navBarContainer.putSubContainer(navBarRowContainer);
		
		Container textItem1 = new Container();
		Container textItem2 = new Container();
		Container textItem3 = new Container();
		Container searchBoxItem = new Container();
		Container searchTextItem = new Container();
		
		navBarRowContainer.putSubContainer(textItem1);
		navBarRowContainer.putSubContainer(textItem2);
		navBarRowContainer.putSubContainer(textItem3);
		
		navBarRowContainer.putSubContainer(searchBoxItem);
		navBarRowContainer.putSubContainer(searchTextItem);
	}
}
