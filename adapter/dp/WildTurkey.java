package com.adapter.dp;

public class WildTurkey  implements Turkey{

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble...instead of quack...as I am Turkey");
		
	}

	@Override
	public void turkeyfly() {
		// TODO Auto-generated method stub
		System.out.println("Turkey Fly...as I fly limited");
	}

}
