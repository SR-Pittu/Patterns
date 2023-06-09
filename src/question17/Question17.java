/**
 * 
 */
package question17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question17 {
	
	public static void main(String[] args) {
		// Fail-Fast Iterator example
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num == 3) {
				list.remove(Integer.valueOf(num)); //modifying list
			}
		}
//
//		Map<Integer, String> map = new ConcurrentHashMap<>();
//		map.put(1, "John");
//		map.put(2, "Jane");
//		map.put(3, "Alex");
//		Iterator<Integer> mapIterator = map.keySet().iterator();
//		while (mapIterator.hasNext()) {
//			int key = mapIterator.next();
//			if (key == 3) {
//				map.put(4, "Mary"); //modifying map
//			}
//		} 
	}

}
