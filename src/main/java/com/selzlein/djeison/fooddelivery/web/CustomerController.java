package com.selzlein.djeison.fooddelivery.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.controller.ControllerDefault;
import com.selzlein.djeison.fooddelivery.model.Customer;
import com.selzlein.djeison.fooddelivery.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController extends ControllerDefault<Customer, CustomerService> {

}
