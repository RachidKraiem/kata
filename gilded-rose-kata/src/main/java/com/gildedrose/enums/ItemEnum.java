package com.gildedrose.enums;

public enum ItemEnum {

	AGED_BRIE("Aged Brie"), BACKSTAGE("Backstage passes to a TAFKAL80ETC concert"), SULFURAS("Sulfuras, Hand of Ragnaros");

	private String value;

	private ItemEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static boolean contains(String value) {
		for (ItemEnum type : values()) {
			if (type.value.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

}
