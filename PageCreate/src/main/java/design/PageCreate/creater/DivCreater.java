package design.PageCreate.creater;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.junit.Test;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.element.ColElement;
import design.PageCreate.util.ListUtil;
import design.PageCreate.util.XmlUtil;

public class DivCreater {
	
	public Element create(Container c){
		Document document = XmlUtil.createDocument();
		Element rootElement = XmlUtil.createRootElement(document, "DIV");
		if(c.getIdName() != null){
			XmlUtil.createAttribute(rootElement, "id", c.getIdName());
		}
		
		if(c.getClassNameList() != null && c.getClassNameList().size() > 0){
			String classStr = ListUtil.getStringByListAndSplitFlag(c.getClassNameList(), " ");
			XmlUtil.createAttribute(rootElement, "class", classStr);
		}
		
		if(c instanceof ColContainer){
			ColElement element = ((ColContainer) c).getElement();
			ElementCreater.create(rootElement, element);
		}
		
		List<Container> subContainerList = c.getSubContainerList();
		for (Container subContainer : subContainerList) {
			recursiveCreate(subContainer, rootElement);
		}
		
		String result = rootElement.asXML();
		return rootElement;
	}

	private void recursiveCreate(Container c, Element rootElement) {
		
		Element element = XmlUtil.createElementByName("DIV", rootElement);
		
		if(c.getIdName() != null){
			XmlUtil.createAttribute(element, "id", c.getIdName());
		}
		
		if(c.getClassNameList() != null && c.getClassNameList().size() > 0){
			String classStr = ListUtil.getStringByListAndSplitFlag(c.getClassNameList(), " ");
			XmlUtil.createAttribute(element, "class", classStr);
		}
		
		if(c instanceof ColContainer){
			ColElement colEle = ((ColContainer) c).getElement();
			if(colEle != null) {
				ElementCreater.create(element, colEle);
			}
		}
		
		List<Container> subContainerList = c.getSubContainerList();
		for (Container subContainer : subContainerList) {
			recursiveCreate(subContainer, element);
		}
	}
}
