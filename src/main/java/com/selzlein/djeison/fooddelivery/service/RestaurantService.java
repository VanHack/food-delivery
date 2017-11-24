package com.selzlein.djeison.fooddelivery.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.model.Restaurant;
import com.selzlein.djeison.fooddelivery.model.RestaurantRepository;

@Service
public class RestaurantService extends ServiceDefault<Restaurant, RestaurantRepository> {

}
