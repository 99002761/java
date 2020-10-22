package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda {
	@Autowired
	@Qualifier("indian")
	Menu iMenu;
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	
	public List<String> showMenu(String choice) {
		if(choice.equals("Indian")) {
			return iMenu.itemsAvailable();
		}
		else if(choice.equals("Chinese"))
		{
			return cMenu.itemsAvailable();
		}
		return null;
		
		/*Chinese china = new Chinese();
		for(Chinese china:iMenu)
			System.out.println(china);
		for(Indian india:)*/
		
		
		
		}

}
