package design.PageCreate.creater;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.element.ColElement;
import design.PageCreate.domain.element.InputElement;
import design.PageCreate.domain.element.LinkElement;
import design.PageCreate.domain.element.TextElement;
import design.PageCreate.util.ListUtil;
import design.PageCreate.util.XmlUtil;

public class ElementCreater {
	public static void create(Element rootElement, ColElement colEle) {
		
		if(colEle.getIdName() != null){
			XmlUtil.createAttribute(rootElement, "id", colEle.getIdName());
		}
		
		if(colEle.getClassNameList() != null && colEle.getClassNameList().size() > 0){
			String classStr = ListUtil.getStringByListAndSplitFlag(colEle.getClassNameList(), " ");
			XmlUtil.createAttribute(rootElement, "class", classStr);
		}
		

		Element element = XmlUtil.createElementByName(colEle.getTagName(), rootElement);
		if(colEle instanceof InputElement){
			InputElement realTypeColEle = (InputElement) colEle;
			ifNotNullSetAttr(element, "type", realTypeColEle.getType());
			ifNotNullSetAttr(element, "value", realTypeColEle.getValue());
		}
		if(colEle instanceof TextElement){
			TextElement realTypeColEle = (TextElement) colEle;
			ifNotNullSetText(element, realTypeColEle.getValue());
		}
		if(colEle instanceof LinkElement){
			LinkElement realTypeColEle = (LinkElement) colEle;
			ifNotNullSetAttr(element, "href", realTypeColEle.getHref());
			ifNotNullSetAttr(element, "target", realTypeColEle.getTarget());
		}
		
	}

	private static void ifNotNullSetText(Element element, String value) {
		if(value != null) {
			element.setText(value);
		}
	}

	private static void ifNotNullSetAttr(Element inputElment, String attrKey, String attrValue) {
		if(attrValue != null) {
			XmlUtil.createAttribute(inputElment, attrKey, attrValue);
		}
	}
}
