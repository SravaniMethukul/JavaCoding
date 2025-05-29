package CollectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Good morning");
		hm.put(2, "Goodbye");
		
		hm.remove(1);
		System.out.println(hm.get(1));
		
		Set sn = hm.entrySet();
		Iterator itr = sn.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry)itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
