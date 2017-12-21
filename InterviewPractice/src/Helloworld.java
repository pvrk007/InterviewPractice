
public class Helloworld {
	public static void main(String[] args){
    
		
        String f="Rama";
        String f1="Rama";
        //f.setX();
        System.out.println("s");
        if (f == f1) 
        {   //shallow comparison, this line is printed
            System.out.println("f==f1 with new"); 
        }
    
        if (f.equals(f1)) 
        {   //deep comparison, this line is also printed
            System.out.println("f equals f1 with new"); 
        }
        
   	}
	
	
	
	
}


