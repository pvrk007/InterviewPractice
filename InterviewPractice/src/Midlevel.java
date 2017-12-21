
public class Midlevel {
private String name;
public Midlevel(String name){
	this.name=name;
}

public static void main(String[] args){
	Midlevel test=new Midlevel("rama");
	Midlevel test2=new Midlevel("rama"); 

		System.out.println(test.name==test2.name);
	
	
		System.out.println(test.name.equals(test2.name));

}
}
