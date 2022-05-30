package com.mycompany.streamfilterpredicate;

import java.util.ArrayList;
import java.util.List;

public class StreamOne {
	public static void main(String[] args) {


	//		List<Integer> numList = new ArrayList<>();
		List<Integer> numList=new ArrayList<>();
		numList.add(11);
		numList.add(12);
		numList.add(211);

		numList.add(121);

		numList.add(141);

		numList.add(1661);

		numList.add(140);
		
		
		System.out.println(numList);
		List<Integer> oddNumList= new ArrayList<>();
		for(Integer num:numList) {
			if(num%2 !=0 ) {
				oddNumList.add(num);
			}
			
			
			
		}
		System.out.println(oddNumList);


	}

}
