package com.selzlein.djeison.fooddelivery.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.controller.ControllerDefault;
import com.selzlein.djeison.fooddelivery.model.Restaurant;
import com.selzlein.djeison.fooddelivery.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController extends ControllerDefault<Restaurant, RestaurantService> {

}
