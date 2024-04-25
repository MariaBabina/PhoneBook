package com.maria.phonebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhonePerson {
	private String name;
	private Set <String> phones = new HashSet();
	
	public PhonePerson (String name, String phone) {
		this.name = name;
		phones.add(phone);
	}
	
	public void addPhone(String phone) {
		phones.add(phone);
	}
	
	public String toString() {
		var phonesStr = String.join(", ", phones);
		return "%s: %s".formatted(name, phonesStr);
	}
	
	public int getPhonesAmount() {
		return phones.size();
	}
	
}
