package com.gildedrose.services;

import com.gildedrose.Item;
import com.gildedrose.utils.Validation;

public class BackstageService extends DefaultService implements Validation{

	@Override
	public void updateItemQuality(Item item) {
		if(isNotValid(item)){
			System.out.println("The Quality of an item is never negative or more than 50");
			return;
		}
		if (item.quality < 50) {
			item.quality = item.quality + 1;
			if (item.sellIn < 11 && item.quality < 50) {
				item.quality = item.quality + 1;
			}
			if (item.sellIn < 6 && item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
		item.sellIn = item.sellIn - 1;
		if (item.sellIn < 0) {
			item.quality = 0;
		}
	}

}
