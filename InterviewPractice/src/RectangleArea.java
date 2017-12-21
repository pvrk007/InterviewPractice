yeahimport java.util.Stack;

public class RectangleArea {
public static void main(String [] args){
	int[][] grid={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
	System.out.println(minAreaRectangle(grid));
}
public static int minAreaRectangle(int[][] grid){
	//Creating a temporary array with heights of rectangle
	int [] temp=new int[grid[0].length];
	int maxArea=0;
	int area=0;
	for(int i=0;i<grid.length;i++){
		for(int j=0;j<grid[0].length;j++){
			if(grid[i][j]==0){
				//if grid is 0 then we make the height 0
				temp[j]=0;
			}else{
				//if grid is 1 then we increase the height by adding the previous input
				temp[j]+=grid[i][j];
			}
		}
		//we calculate the area at each row considering a rectangle
	  area = maxHist(temp);
        maxArea=Math.max(area,maxArea);
	}

	return maxArea;
	
}

public static int maxHist(int[] arr){
	//stack to hold the index of array
	Stack<Integer> stack=new Stack<Integer>();
	int maxArea=0;
	int area=0;
	int i=0;
	while(i<arr.length){
		//if the number of 1's above are higher than previous column then add to stack
		if(stack.isEmpty() || arr[stack.peek()]<=arr[i]){
			
			stack.push(i);
			i++;
		}
		//if the previous column is higher then pop the stack and calculate the area
		else{
			int top=arr[stack.peek()];
			stack.pop();
			if(stack.isEmpty()){
				
			area=top*i;
			} else{
				//i is right border and top is left border 
				area=top*(i-stack.peek()-1);
				maxArea=Math.max(area, maxArea);
			}
		
		if(area > maxArea){
            maxArea = area;
        }
		}
	}
	//Now pop the remaining elements in stack and calculate area taking each bar as the minimum height
	while(!stack.isEmpty()){
		int top=arr[stack.peek()];
		stack.pop();
		if(stack.isEmpty()){
			area=top*i;
			} else{
				area=top*(i-stack.peek()-1);
				maxArea=Math.max(area, maxArea);
			}
	}
	
	return maxArea;
}
}
