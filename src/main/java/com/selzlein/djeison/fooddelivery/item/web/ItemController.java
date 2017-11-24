package com.selzlein.djeison.fooddelivery.item.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.item.model.Item;
import com.selzlein.djeison.fooddelivery.item.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController extends ControllerDefault<Item, ItemService> {

}
