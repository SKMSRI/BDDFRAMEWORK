package ProjectDemo;

import java.util.HashMap;
import java.util.Map;

public class SKM_compiler {


	 public static void main(String[] args) {
		    String str= "aabbbcc";
		    getCharCount(str);
		  }

		  public static void getCharCount(String str){   
		    Map<Character,Integer> map = new HashMap<>();

		    for(char ch: str.toCharArray()){
		      if(map.containsKey(ch)){
		        map.put(ch, map.get(ch)+1);
		      }
		      else
		       map.put(ch,1);
		    }
		    System.out.println(map); // to print character with count of occurance
		    
		// to print only the count and not the 
		  }
		}
	
	



