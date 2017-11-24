package com.selzlein.djeison.fooddelivery.customer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.customer.model.Customer;
import com.selzlein.djeison.fooddelivery.customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController extends ControllerDefault<Customer, CustomerService> {

}
