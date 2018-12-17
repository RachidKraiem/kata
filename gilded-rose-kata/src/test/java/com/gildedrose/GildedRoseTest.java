package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void test() {
		Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, -3), new Item("+5 Dexterity Vest", 0, 20), new Item("Aged Brie", 2, -1), new Item("Aged Brie", 20, 10), new Item("Aged Brie", 0, 10),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 60), new Item("Sulfuras, Hand of Ragnaros", 0, 80),
				new Item("Sulfuras, Hand of Ragnaros", -1, 40), new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals(-3, app.items[0].quality);
		assertEquals(18, app.items[1].quality);
		assertEquals(-1, app.items[2].quality);
		assertEquals(11, app.items[3].quality);
		assertEquals(12, app.items[4].quality);
		assertEquals(60, app.items[5].quality);
		assertEquals(80, app.items[6].quality);
		assertEquals(40, app.items[7].quality);
		assertEquals(23, app.items[8].quality);
		assertEquals(0, app.items[9].quality);
	}

}
