package design.PageCreate.creater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.impl.FixBoxContainer;
import design.PageCreate.domain.container.impl.FullContainer;

public class DivCreaterTest {
	Container fullContainer;
	DivCreater dc;
	
	@Before
	public void setUp() throws Exception {

		fullContainer = new FullContainer();
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
	
		dc = new DivCreater();
	}

	@Test
	public void testCreate() {
		System.out.println(dc.create(fullContainer));
	}

}
