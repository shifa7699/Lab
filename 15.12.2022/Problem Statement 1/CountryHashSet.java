//Problem Statement 2:
package collection;

import java.util.HashSet;
import java.util.Iterator;

public class CountryHashSet 
{
	
		String country;
		 //creating HashSet and adding elements 
		HashSet<String> H1 = new HashSet();  //set 
		void storeCountryNames(String countryName) { //method to store country names
			H1.add(countryName);
		}
		public String retrieveCountry(String countryName)  { //method to retrieve a country name
			Iterator itr = H1.iterator();  
			while( itr.hasNext()) {  //iterator search for the country name
				System.out.println(itr.next()); 
				if(H1.contains(countryName)) //if condition to check if the mentioned country is present or not
					return countryName; 
			}
			return null; }  //null--> if the country name is not present in the list
		public static void main(String[] args) {
			CountryHashSet cs= new CountryHashSet();  // creating main class object
			// name of the countries
			cs.storeCountryNames("India");
			cs.storeCountryNames("Switzerland");
			cs.storeCountryNames("Japan");
			cs.storeCountryNames("France");
			cs.storeCountryNames("Europe");
			// Retrieved country
			System.out.println("Retrieved Country : "+cs.retrieveCountry("Africa"));// null--> because africa is not present in the list
		}
	}
