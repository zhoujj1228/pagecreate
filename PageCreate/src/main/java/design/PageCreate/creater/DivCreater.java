package design.PageCreate.creater;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.Test;

import design.PageCreate.domain.Container;
import design.PageCreate.util.ListUtil;
import design.PageCreate.util.XmlUtil;

public class DivCreater {
	
	public String create(Container c){
		Document document = XmlUtil.createDocument();
		Element rootElement = XmlUtil.createRootElement(document, "DIV");
		if(c.getIdName() != null){
			XmlUtil.createAttribute(rootElement, "id", c.getIdName());
		}
		
		if(c.getClassNameList() != null && c.getClassNameList().size() > 0){
			String classStr = ListUtil.getStringByListAndSplitFlag(c.getClassNameList(), " ");
			XmlUtil.createAttribute(rootElement, "class", classStr);
		}
		List<Container> subContainerList = c.getSubContainerList();
		for (Container subContainer : subContainerList) {
			recursiveCreate(subContainer, rootElement);
		}
		
		String result = rootElement.asXML();
		return result;
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
		List<Container> subContainerList = c.getSubContainerList();
		for (Container subContainer : subContainerList) {
			recursiveCreate(subContainer, element);
		}
	}
}
