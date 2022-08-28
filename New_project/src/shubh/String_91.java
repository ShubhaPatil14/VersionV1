package shubh;

import java.util.HashMap;

public class String_91 {

	public static void main(java.lang.String[] args) {
		String str = "hi shubham  its me rahul";
		String [] ar = str.split(" ");
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		for(int i =0 ; i<ar.length; i++) {
			String sp = ar[i];
			if(hs.containsKey(sp)) {
				hs.put(sp, hs.get(sp)+1);
			}
			else {
				hs.put(sp, 1);
			}
		}
		System.out.println(hs);
		

	}

}
