
public class IPV4 {
	public static void main(String[] args){
		String s=".254.255.0";
		System.out.println(isIPV4Address(s));
		
		
	}

	private static boolean isIPV4Address(String s) {
	
		    String[] charValues = s.split("\\.");
		    if(charValues.length>4 || charValues.length<4) return false;
		    
		    for(int i=0;i<charValues.length;i++){
		    
		    	String b=charValues[i];
		    	if(b.length()==0) return false;
		    	for (int j = 0; j < b.length(); j++) {
			        if (!Character.isDigit(b.charAt(j))) {
			            return false;
			        }
			    }
		    	int a =Integer.parseInt(b);
		        if(a<0 || a>255){
		            return false;
		        }
		        System.out.println(b);
		    }
		    return true;
		}
	}

	

