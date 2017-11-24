package com.selzlein.djeison.fooddelivery.item.service;

import org.springframework.stereotype.Repository;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.item.model.Item;
import com.selzlein.djeison.fooddelivery.item.model.ItemRepository;

@Repository
public class ItemService extends ServiceDefault<Item, ItemRepository> {

}
