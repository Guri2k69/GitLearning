package com.niyuj.group.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookMap {
	Books book1 = new Books("name1", "fictional");
	Books book2 = new Books("name2", "romance");
	Books book3 = new Books("name3", "technology");
	Books book4 = new Books("name4", "technology");
	Books book5 = new Books("name5", "political");
	Books book6 = new Books("name6", "biography");
	Books book7 = new Books("name7", "biography");
	Books book8 = new Books("name8", "mathematics");
	Books book9 = new Books("name9", "science");
	Books book10 = new Books("name10", "language");

	private static ArrayList<Books> books = new ArrayList<Books>();
	{
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
	}

	public static ArrayList<Books> getlist(String role) {

		String name = books.get(1).getName();
		System.out.println(name);

		if (role.equals("STUDENT")) {
			ArrayList<Books> list = new ArrayList<Books>();
			for (int i = 0; i < books.size(); i++) {
				String category = books.get(i).getCategory();
				if (category == "technology") {
					Books book = books.get(i);
					list.add(book);
				}
			}
			return list;
		}

		else {

			return books;
		}

	}

}
