package a15_casting;

import java.util.ArrayList;

class Animals {

	
	void Arraylists(ArrayList<String > list){
		
		for(String ss : list){
			
			System.out.println(ss);
		}
		
	}
}

public class Testarraylist {

	public static void main(String[] args) {
                    
		ArrayList<String > ma = new ArrayList<String>();
		ma.add("Test1");
		ma.add("Test2");
		ma.add("Test3");
		ma.add("Test4");
		
		Animals anim = new Animals();
		anim.Arraylists(ma);
	}

	
}