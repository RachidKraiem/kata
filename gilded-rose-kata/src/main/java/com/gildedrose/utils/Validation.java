package com.gildedrose.utils;

import com.gildedrose.Item;

public interface Validation {

	public default boolean isNotValid(Item item) {
		return item.quality < 0 || item.quality > 50;
	}

}
