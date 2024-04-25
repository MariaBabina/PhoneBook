package com.maria.phonebook;

public class PhoneBookApp {

	public static void main(String[] args) {
		
		var book = new PhoneBook();
		book.addContact("Мария","12345886");
		book.addContact("Семен","12366886");
		book.addContact("Семен","1234566666");
		book.addContact("Александр","1266666");
		book.addContact("Александр","12346666666");
		book.addContact("Александр","1234643386");
		book.addContact("Александр","12345333386");
		book.addContact("Арсений","123211886");
		book.addContact("Арсений","12345988886");
		
		book.print();
		
	}

}
