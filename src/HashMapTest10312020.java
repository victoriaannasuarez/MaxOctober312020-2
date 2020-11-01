import java.util.Hashtable;
import java.util.LinkedList;



public class HashMapTest10312020 {


		LinkedList[] hashArray;
		private static int SIZE = 10;
		String s = "dog";

		
		public HashMapTest10312020 () {
			
			hashArray = new LinkedList[SIZE];
			for(int i = 0; i<SIZE; i++) {
				hashArray[i] = new LinkedList();
			}
		}

		private int computeHash(String s) {
			int hash = 0;
			for(int i = 0; i<s.length(); i ++) {
				hash+=s.charAt(i);
			}
			return hash % SIZE;
		}
		
		public boolean containsString(String target) {
			
			int hash = computeHash(target);
			LinkedList list = hashArray[hash];
			if(list.contains(target)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void put(String s) {
			
			int hash = computeHash(s);
			LinkedList list = hashArray[hash];
//			if (!list.contains(s)) {
//				hashArray[hash]  (//add to start?)
//			}
			
		}
	


public static void main(String []args) {
	HashMapTest10312020 hm = new HashMapTest10312020();
	int number = hm.computeHash("frog");
	System.out.println(number);

	System.out.println(new String("hello").hashCode());

	//calculates the hashcode;
	//one object with another ---> calculates the hashCode(), equals method

}

}
