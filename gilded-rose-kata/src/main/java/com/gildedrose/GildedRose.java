package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.enums.ItemEnum;
import com.gildedrose.services.AgedBrieService;
import com.gildedrose.services.BackstageService;
import com.gildedrose.services.DefaultService;
import com.gildedrose.services.SulfurasService;

class GildedRose extends DefaultService {
	Item[] items;
	private Map<String, DefaultService> strategy;

	public GildedRose(Item[] items) {
		this.items = items;
		this.strategy = new HashMap<>();
		this.strategy.put(ItemEnum.AGED_BRIE.getValue(), new AgedBrieService());
		this.strategy.put(ItemEnum.BACKSTAGE.getValue(), new BackstageService());
		this.strategy.put(ItemEnum.SULFURAS.getValue(), new SulfurasService());
	}

	public void updateQuality() {
		for (Item item : items) {
			if (ItemEnum.contains(item.name)) {
				strategy.get(item.name).updateItemQuality(item);
			} else {
				updateItemQuality(item);
			}
		}
	}
}