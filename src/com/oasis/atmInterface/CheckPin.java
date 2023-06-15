package com.oasis.atmInterface;

public class CheckPin {
	
	public boolean check(int pinNo) {
		return switch(pinNo)
				{
		case 111:yield true;
		case 222:yield true;
		case 333:yield true;
		default: yield false;
		        
		
				};
	}

}
