import java.util.HashMap;

public class Fed {
public static void main(String [] args){
	String[] a={"Game","of","Thrones"};
	String[] b={"Game","of","Thrones"};
	System.out.println(isContentSame(a,b));
}

private static Object isContentSame(String[] a, String[] b) {
    if(a == null && b == null ) return true;
    if((a == null && b!= null) || (a != null && b== null) ) return false;
    
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    for(String s:a){
        if(map.get(s) != null){
            map.put(s, map.get(s)+1);
        }
        map.putIfAbsent(s, 1);
    }
    
    for(String s:b){
        if(map.get(s) == null) return false;
        else map.put(s, map.get(s)-1);
    }
    
    for(int count:map.values()){
        if(count != 0){
            return false;
        }
    }
    
    return true;
    
}

}
