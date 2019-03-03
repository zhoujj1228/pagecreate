package design.PageCreate.creater;

import java.io.File;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import design.PageCreate.domain.container.Container;
import design.PageCreate.util.XmlUtil;

public class HtmlCreater {
	public static String create(File htmlFile, String encode, Container contentContainer) throws DocumentException {
		
		CssCreater cssCreater = new CssCreater();
		DivCreater divCreater = new DivCreater();

		Element contentElement = divCreater.create(contentContainer);
		HashMap<String, String> cssnameContentMap = cssCreater.getCssnameContentMap(contentContainer);

		String allCssStr = getCssStrByMap(cssnameContentMap);
		
		Document document = XmlUtil.createDocument();
		Element htmlElement = document.addElement("html");
		Element headElement = htmlElement.addElement("head");
		Element bodyElement = htmlElement.addElement("body");
		
		initHead(headElement);
		addCssToHead(headElement, allCssStr);
		addElementToBody(bodyElement, contentElement);
		if(htmlFile != null) {
			XmlUtil.createXmlFile(document, htmlFile, encode);
		}
		
		return document.asXML();
		
	}

	private static void addElementToBody(Element bodyElement, Element contentElement) {
		bodyElement.add(contentElement);
	}

	private static void addCssToHead(Element headElement, String allCssStr) {
		Element styleElement = headElement.addElement("style");
		styleElement.setText("\n\r" + allCssStr + "\n\r");
		
	}

	private static String getCssStrByMap(HashMap<String, String> cssnameContentMap) {
		StringBuilder sb = new StringBuilder();
		for(String s : cssnameContentMap.values()){
			sb.append(s + "\n");
		}
		String allCssStr = sb.toString();
		return allCssStr;
	}

	private static void initHead(Element headElement) {
		Element metaEle = headElement.addElement("meta");
		metaEle.addAttribute("charset", "utf-8");
	}
}
