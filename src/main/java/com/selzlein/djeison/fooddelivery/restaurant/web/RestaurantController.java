package com.selzlein.djeison.fooddelivery.restaurant.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.restaurant.model.Restaurant;
import com.selzlein.djeison.fooddelivery.restaurant.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController extends ControllerDefault<Restaurant, RestaurantService> {

}
