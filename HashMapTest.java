import java.util.HashMap;
import java.util.Set;

public class HashMapTest{
	public static void main(String[] args){	
		//init hashmap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//add elements to hashmap
		hashMap.put(1, "Java");
		hashMap.put(2, "C++");
		hashMap.put(3, "PHP");
		hashMap.put(4, "Python");
		//show hashmap
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.get(1));

		Set<Integer> ketSet = hashMap.keySet();
		for(Integer key : ketSet){
			System.out.println(key+ " " + hashMap.get(key));
		}
	}
}