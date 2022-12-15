package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {  //main class
	private HashMap<String, String> M1;
	
	public CountryMap() { // default constructor
		M1 = new HashMap<String, String>(); //object created
	}
	
	public HashMap<String, String> 
	storeCountryCapital(String CountryName, String capital) { //method to store country name and capital
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String retrieveCapital(String CountryName) { //method to fetch capital through country name
		return M1.get(CountryName);
	}
	
	public String retrieveCountry(String capitalName) { //method to fetch country name through capital
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName)) //compares the value 
				return me.getKey(); //returns if present
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>(); //Array list created
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
public static void main(String[] args) {
	CountryMap countryMap = new CountryMap();
//values assigned
	countryMap.storeCountryCapital("India", "Delhi");
	countryMap.storeCountryCapital("Japan", "Tokyo");
	countryMap.storeCountryCapital("USA", "Washington, D.C.");
	countryMap.storeCountryCapital("Paris", "London");
// values retrive	
	System.out.println(countryMap.retrieveCapital("India"));
	System.out.println(countryMap.retrieveCountry("Tokyo"));
	//System.out.println(countryMap.toArrayList());
	
	HashMap<String, String> M2 = countryMap.swapKyeValue();
	System.out.println(M2);
}
}