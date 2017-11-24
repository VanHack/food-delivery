package com.selzlein.djeison.fooddelivery.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.controller.ControllerDefault;
import com.selzlein.djeison.fooddelivery.model.Item;
import com.selzlein.djeison.fooddelivery.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController extends ControllerDefault<Item, ItemService> {

}
