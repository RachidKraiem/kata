package com.gildedrose.services;

import com.gildedrose.Item;
import com.gildedrose.utils.Validation;

public class SulfurasService extends DefaultService implements Validation{

	@Override
	public void updateItemQuality(Item item) {
		if(isNotValid(item)){
			System.out.println("Sulfuras is a legendary item and as such its Quality is 80 and it never alters");
			return;
		}
		//NoThing
	}
	
	@Override
	public boolean isNotValid(Item item) {
		return item.quality != 80 ;
	}

}
