import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyCount {
public static void main(String[] args){
	File file=new File("C:\\Users\\Rama\\Desktop\\Paragraphtxt.txt");
	Scanner sc;
	//Constructed the StringBuilder to take the input from Scanner
	StringBuilder sb=new StringBuilder();
	try {
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			//appended the string 
			sb.append(sc.nextLine());
		}
		sc.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String text=sb.toString();
	// replacing all the punctuation marks and splitting the string by spaces
	String[] words=text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
	
	// Creating the hashmap to have all the words and frequency in map key value pair  
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<words.length;i++){
		//If the word already exist just update the value else put the key value pair
		if(map.containsKey(words[i])){
			map.put(words[i], map.get(words[i])+1);
		}else{
			map.put(words[i], 1);
		}
	}
	
	//In order to sort the map according to values. Create a List of Map entries
	
	List<Entry<String,Integer>> list= new ArrayList<Entry<String, Integer>>(map.entrySet());
	//Used Collections.sort on list with anonymous comparator function that sorts the map according to values
	Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String,Integer> o2){
			return (o2.getKey()).compareTo(o1.getKey());
		    }
			});
	
	//Printing the map values according to the values in descending order
	for(Map.Entry<String, Integer> e : list){
		System.out.println(e.getKey()+":"+e.getValue());
	}
}
}
