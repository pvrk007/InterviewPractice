
public class Ravi {
public static void main(String[] args){
 int [] numbers={2,1,3,3};
  System.out.println(findMiddleIndex(numbers));
}
public static int findMiddleIndex(int[] numbers){
	 
    int endIndex = numbers.length - 1;
    int startIndex = 0;
    int sumLeft = 0;
    int sumRight = 0;
    while (true) {
        if (sumLeft > sumRight) {
            sumRight += numbers[endIndex--];
        } else {
            sumLeft += numbers[startIndex++];
        }
        if (startIndex > endIndex) {
                break;
            
        }
    }
    return endIndex;
}
}
