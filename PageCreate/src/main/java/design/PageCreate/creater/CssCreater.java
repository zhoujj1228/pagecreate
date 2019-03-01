package design.PageCreate.creater;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.style.ClassCssStyle;
import design.PageCreate.domain.style.CssStyle;

public class CssCreater {
	
	public HashMap<String, String> getCssnameContentMap(Container<Container> rootContainer) {
		HashMap<String , String> cssnameContentMap = new HashMap<>();
		List<CssStyle> cssStyleList = rootContainer.getCssStyleList();
		for(CssStyle cssStyle : cssStyleList){
			String cssStyleName = cssStyle.getName();
			if(cssnameContentMap.containsKey(cssStyleName)){
				continue;
			}
			String cssStyleStr = create(cssStyle);
			cssnameContentMap.put(cssStyleName, cssStyleStr);
		}
		List<Container> subContainerList = rootContainer.getSubContainerList();
		for(Container c : subContainerList){
			cssnameContentMap.putAll(getCssnameContentMap(c));
		}
		
		return cssnameContentMap;
	}
	
	public String create(CssStyle css){
		HashMap<String, String> map = css.getMap();
		StringBuilder sb = new StringBuilder();
		/*if(css instanceof ClassCssStyle){
			sb.append(".");
		}else if(css instanceof ClassCssStyle){
			sb.append("#");
		}else{
			throw new RuntimeException("CssStyle未声明具体类型：" + css.getName());
		}*/
		
		sb.append(css.getNamePrefix() + css.getName() + " ");
		sb.append("{");
		sb.append("\n");
		for(String key : map.keySet()){
			sb.append("\t" + key + ":" + map.get(key) + ";\n");
		}
		sb.append("}");
		return sb.toString();
	}
}
