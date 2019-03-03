package design.PageCreate.creater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.impl.DefaultColContainer;
import design.PageCreate.domain.container.impl.DefaultRowContainer;
import design.PageCreate.domain.container.impl.table.FixBoxContainer;
import design.PageCreate.domain.container.impl.table.FullContainer;

public class DivCreaterTest {
	Container fullContainer;
	DivCreater dc;
	
	@Before
	public void setUp() throws Exception {

		fullContainer = new FullContainer();
		Container navBarContainer = new FixBoxContainer();
		fullContainer.addSubContainer(navBarContainer);
		
		Container navBarRowContainer = new DefaultRowContainer();
		navBarContainer.addSubContainer(navBarRowContainer);
		
		Container textItem1 = new DefaultColContainer();
		Container textItem2 = new DefaultColContainer();
		Container textItem3 = new DefaultColContainer();
		Container searchBoxItem = new DefaultColContainer();
		Container searchTextItem = new DefaultColContainer();
		
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
