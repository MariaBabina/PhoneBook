package com.maria.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	private Map<String, PhonePerson> book = new HashMap<>();
	
	public void addContact(String name, String phone) {
		if(book.containsKey(name)) {
			book.get(name).addPhone(phone);
		}else {
			var contact = new PhonePerson(name, phone);
			book.put(name, contact);
		}
		
	}

	public void print() {
		List<PhonePerson> list = new ArrayList<>(book.values());
		Collections.sort(list, (v1, v2) -> {
			return Integer.compare(v2.getPhonesAmount(), v1.getPhonesAmount());
		});
		list.forEach(System.out::println);
	}
	
}
