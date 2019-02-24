package testing;
import java.util.ArrayList;

public class cart {

	   ArrayList<Integer> price = new ArrayList<Integer>();
	    int totalcount;
	   int totalcost;
	public int countt() {
		// TODO Auto-generated method stub
		for(int j=0; j< price.size();j++) {
			totalcount++;
			}
			
		
		return totalcount;
	}
	public void addbook(String string, int i) {
		// TODO Auto-generated method stub
		 price.add(i);
	}
	public int value() {
		// TODO Auto-generated method stub
		for(int j =0 ; j< price.size() ; j++)
		{
			
			totalcost = totalcost+price.get(j);
		}

		return totalcost;
	}
	  
	
	
	
	

}
