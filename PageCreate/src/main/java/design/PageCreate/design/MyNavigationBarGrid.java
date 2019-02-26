package design.PageCreate.design;

import design.PageCreate.domain.Container;

public class MyNavigationBarGrid {
	public static void main(String[] args) {
		Container navigationBarGrid = new Container();
		Container textContainer = new Container();
		Container searchContainer = new Container();
		
		navigationBarGrid.putSubContainer(textContainer);
		navigationBarGrid.putSubContainer(searchContainer);
		
		Container textItem1 = new Container();
		Container textItem2 = new Container();
		Container textItem3 = new Container();
		Container searchBoxItem = new Container();
		Container searchTextItem = new Container();
		
		textContainer.putSubContainer(textItem1);
		textContainer.putSubContainer(textItem2);
		textContainer.putSubContainer(textItem3);
		
		searchContainer.putSubContainer(searchBoxItem);
		searchContainer.putSubContainer(searchTextItem);
	}
}
