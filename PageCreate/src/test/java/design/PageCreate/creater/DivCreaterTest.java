package design.PageCreate.creater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design.PageCreate.domain.Container;

public class DivCreaterTest {
	Container navigationBarGrid;
	DivCreater dc;
	
	@Before
	public void setUp() throws Exception {
		dc = new DivCreater();
		navigationBarGrid = new Container();
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

	@Test
	public void testCreate() {
		System.out.println(dc.create(navigationBarGrid));
	}

}
