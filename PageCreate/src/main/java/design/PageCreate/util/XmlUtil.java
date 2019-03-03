package design.PageCreate.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlUtil {
	
	public static void main(String[] args) {
		String path = "D:\\Test\\xml\\test1.xml";
		File file = new File(path);
		Document document = createDocument();
		Element createRootElement = createRootElement(document, "Test");
		createAttribute(createRootElement, "name", "rootName");
		createElementByName("Test1", createRootElement);
		System.out.println(document.getRootElement().asXML());
		XmlUtil.createXmlFile(document, file, "UTF-8");
		
	}
	
	public static Document createDocument(){
		return DocumentHelper.createDocument();
	}
	
	
	public static Element createRootElement(Document document, String rootElementName){
		return document.addElement(rootElementName);
	}
	
	
	/**
	 * �õ����һ���ڵ㣬�����������ͬ�ڵ���ʹ�õ�һ���ڵ�
	 * @param nodes	�����Ľڵ�
	 * @param root ���ڵ�
	 * @return ���Ľڵ�
	 */
	public static Element getLastNodeByNodes(ArrayList<String> nodes, Element root){
		List<Element> list = root.elements();
		Element result = null;
		for(String s : nodes){
			for(Element e : list){
				if(e.getName().equals(s)){
					list = e.elements();
					result = e;
				}
			}
		}
		return result;
	}
	/**
	 * �����������ƺ�����ֵ�õ���Ӧ���ӽڵ�
	 * @param attrName ���Ե�����
	 * @param attrValue ���Ե�ֵ
	 * @param e ���ڵ�
	 * @return ��Ӧ���ӽڵ�
	 */
	public static Element getChildNodeByAttr(String attrName, String attrValue, Element root){
		@SuppressWarnings("unchecked")
		List<Element> list = root.elements();
		//System.out.println(list.size());
		for(Element element : list){
			String value = element.attributeValue(attrName);
			if(attrValue.equals(value)){
				return element;
			}
		}
		return null;
	}
	/**
	 * �����ļ�����һ��Document����
	 * @param file �ļ�
	 * @return Document����
	 * @throws DocumentException 
	 */
	public static Document getDocument(File file) throws DocumentException{
		SAXReader sd = new SAXReader();
		Document doc = sd.read(file);
		return doc;
	}
	
	public static Element createElementByName(String name ,Element ele){
		return ele.addElement(name);
	}
	public static void createAttribute(Element ownElement, String name, String value){
		ownElement.addAttribute(name, value);
	}
	public static boolean createXmlFile(Document document, File xmlFile,String encode){
		XMLWriter writer = null;
		try {
			if(!xmlFile.exists()){
				xmlFile.createNewFile();
			}else{
				xmlFile.delete();
				xmlFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		try {
			Writer osWriter = new OutputStreamWriter(new FileOutputStream(xmlFile));
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding(encode);
			format.setIndent("\t");
			format.setTrimText(false);
			format.setNewLineAfterDeclaration(true);
			writer = new XMLWriter(osWriter, format);
			writer.write(document);
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
}
