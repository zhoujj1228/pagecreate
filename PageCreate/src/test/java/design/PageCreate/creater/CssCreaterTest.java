package design.PageCreate.creater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;
import design.PageCreate.domain.style.impl.FullBoxStyle;

public class CssCreaterTest {
	CssCreater creater;

	@Before
	public void setUp() throws Exception {
		creater = new CssCreater();
	}

	@Test
	public void testCreate() {
		CssStyle style = new FullBoxStyle();
		System.out.println(creater.create(style));
	}

}
