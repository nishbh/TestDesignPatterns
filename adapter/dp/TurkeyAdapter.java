package com.adapter.dp;


//this is the Adapter....which converts Adapteee( here Turkey...) to do what Duck does
public class TurkeyAdapter  implements Duck{

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey= turkey;
	}
	
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.turkeyfly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
		
	}

}
