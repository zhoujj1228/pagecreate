package design.PageCreate.domain.container;

import design.PageCreate.domain.element.ColElement;

public abstract class ColContainer extends Container{
	private ColElement element;
	private int colInterval = 0;

	public ColElement getElement() {
		return element;
	}

	public void setElement(ColElement element) {
		this.element = element;
	}

	public int getColInterval() {
		return colInterval;
	}

	public void setColInterval(int colInterval) {
		this.colInterval = colInterval;
	}
}
