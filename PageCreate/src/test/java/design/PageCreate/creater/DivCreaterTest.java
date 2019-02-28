package design.PageCreate.creater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design.PageCreate.domain.container.ColContainer;
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
		fullContainer.addSubContainer(navBarContainer);
		
		Container navBarRowContainer = new RowContainer();
		navBarContainer.addSubContainer(navBarRowContainer);
		
		Container textItem1 = new ColContainer();
		Container textItem2 = new ColContainer();
		Container textItem3 = new ColContainer();
		Container searchBoxItem = new ColContainer();
		Container searchTextItem = new ColContainer();
		
		navBarRowContainer.addSubContainer(textItem1);
		navBarRowContainer.addSubContainer(textItem2);
		navBarRowContainer.addSubContainer(textItem3);
		
		navBarRowContainer.addSubContainer(searchBoxItem);
		navBarRowContainer.addSubContainer(searchTextItem);
	
		dc = new DivCreater();
	}

	@Test
	public void testCreate() {
		System.out.println(dc.create(fullContainer));
	}

}
