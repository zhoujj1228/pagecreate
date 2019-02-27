package design.PageCreate.creater;

import java.util.HashMap;

import design.PageCreate.domain.style.ClassCssStyle;
import design.PageCreate.domain.style.CssStyle;

public class CssCreater {
	public String create(CssStyle css){
		HashMap<String, String> map = css.getMap();
		StringBuilder sb = new StringBuilder();
		if(css instanceof ClassCssStyle){
			sb.append(".");
		}else if(css instanceof ClassCssStyle){
			sb.append("#");
		}else{
			throw new RuntimeException("CssStyle未声明具体类型：" + css.getName());
		}
		
		sb.append(css.getName() + " ");
		sb.append("{");
		sb.append("\n");
		for(String key : map.keySet()){
			sb.append("\t" + key + ":" + map.get(key) + ";\n");
		}
		sb.append("}");
		return sb.toString();
	}
}
