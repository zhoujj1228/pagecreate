package design.PageCreate.domain.container.interfaces;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.impl.ColSplitContainer;
import design.PageCreate.domain.style.impl.ColSplitStyle;

public interface BeforeOperInterface {
	public void beforeAddSubContainer(Container subContainer);
	public void beforeSetSupContainer(Container supContainer);
}
