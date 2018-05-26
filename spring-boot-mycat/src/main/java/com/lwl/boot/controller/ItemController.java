package com.lwl.boot.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.model.Item;
import com.lwl.boot.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	
	@Resource
	private ItemService itemService;
	
	@RequestMapping("/add")
	public String add(String value) {
		Item i = new Item();
		i.setValue(Integer.valueOf(value)).setIndate(new Date());
		itemService.add(i);
		return "添加成功";
	}
	
	
	
	@RequestMapping("/find")
	public List<Item> find() {
		//默认分页参数是100
		return itemService.find();
	}

}
