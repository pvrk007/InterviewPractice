
public class raduus {
public static void main(String[] args){
	
	int a =Integer.parseInt(args[0]);
	int radius=5;
	int number=3;
	int length=1; int count=0;
	
	if(number==3){
		if(radius>(Math.sqrt(3)*length)/3){
			count++;
		}
	}else{
		if(radius>(length/Math.sqrt(2))){
			count++;
		}
	}
	
	System.out.println(count);
}
}
