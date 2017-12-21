
public class HomeAway {
public static void main(String[] args){
	String[] s={""};
	int[] a=amazingStrings(s);
	for(int i=0;i<s.length;i++)
	System.out.println(a[i]);
}

private static int[] amazingStrings(String[] words) {
 int[] result=new int[words.length];
	for(int k=0;k<words.length;k++){
	int i=0;
	int j=1;
	int count=0;
	while(j<words[k].length()){
		if(words[k].charAt(i)==words[k].charAt(j)){
			count++;
			i+=2;
			j+=2;
		}else{
			i++;
			j++;
		}
	}
	result[k]= count;
}
	return result;
}
}
