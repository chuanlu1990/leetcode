public class slidingWindow {

	public int slidingWindow(String s, String p){
		int[] map= new int[128];
		int counter; // check whether the substring is valid
		int begin=0, end=0; //two pointers, one point to tail and one  head
		int d; //the length of substring

		for(int i=0; i< p.length(); i++) { /* initialize the hash map here */ }

		while(end<s.length()){

			if (map[s[end++]]-- ?) {  //e.g map[s[end++]]-- > 0, means it's removing p's character from s
				/* modify counter here */
			}

			while(/* counter condition */){

				/* update d here if finding minimum*/

				//increase begin to make it invalid/valid again

				if(map[s[begin++]]++ ?){ // e.g map[s[begin++]]++ == 0, mean's it's adding back p's character
					/*modify counter here*/
				}
			}

			/* update d here if finding maximum*/
		}
		return d;
	}
}
