package com.dp.Prototype;

import java.util.HashMap;
import java.util.Map;

//this is where the main action of creating Prototype pattern happens
public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}

	// heart of Prototype pattern in this example
	public Item createItem(String type) {
		Item item = null;

		try {
			item = (Item) (items.get(type).clone());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;

	}

	private void loadItems() {

		Movie movie = new Movie();
		movie.setTitle("Movie 1");
		movie.setPrice(44.44);
		movie.setRuntime("2.5 hrs");
		items.put("Movie", movie);

		Book book = new Book();
		book.setNumberOfPages(440);
		book.setPrice(29.00);
		book.setTitle("Java Book 1");
		items.put("Book", book);

	}

}
