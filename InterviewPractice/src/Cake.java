
public class Cake {
public static void main(String[] args){
	System.out.println(answer("aaaaaa"));
}
public static int answer(String s) { 
    // Your code goes here.
   int result = -1;
    int length = s.length();
    System.out.println("length "+length);
    for(int i = length; i> 0; i--){
        int n = length/i;
        System.out.println("n "+n);
        if(n * i == length){
            Boolean valid = true;
            String part = s.substring(0,n);
            System.out.println("part "+part);
            for (int j = 1; j< i; j++){
                if (!s.substring(j*n,j*n+n).equals(part)){
                	System.out.println("start "+(j*n)+" end "+(j*n+n));
                    valid = false;
                    break;
                }
            }
            if (valid){
                result = i;
                break;
            }
        }
    }
    return result;
}
}
