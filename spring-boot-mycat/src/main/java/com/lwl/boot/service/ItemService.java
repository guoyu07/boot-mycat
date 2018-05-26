package com.lwl.boot.service;

import java.util.List;

import com.lwl.boot.model.Item;

public interface ItemService {
	
	void add(Item i);
	
	List<Item> find();
	
}
