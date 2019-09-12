package com.test.Sep10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class Java9Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this following returns immutable list
		List<String> friends = List.of("Rama", "Shyam", "Rphi");
		System.out.println(friends);
		
		//friends.add("helloFriend2");  //this will throw exception..
		
		List<String> friends2= Arrays.asList("Rahul", "Tenu", "RRR");
		
		//friends2.add("helloFriend2");  //this will throw exception..
		
		
		//for Map
		
		Map<String, Integer> ageOfFriends = Map.ofEntries(entry("Rahul", 12), entry("Reeta", 14));
		
		System.out.println(ageOfFriends);
		
		
		
		
	}

}
