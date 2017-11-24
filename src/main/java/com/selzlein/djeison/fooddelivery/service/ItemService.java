package com.selzlein.djeison.fooddelivery.service;

import org.springframework.stereotype.Repository;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.model.Item;
import com.selzlein.djeison.fooddelivery.model.ItemRepository;

@Repository
public class ItemService extends ServiceDefault<Item, ItemRepository> {

}
