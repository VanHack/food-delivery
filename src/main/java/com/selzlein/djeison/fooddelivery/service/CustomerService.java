package com.selzlein.djeison.fooddelivery.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.model.Customer;
import com.selzlein.djeison.fooddelivery.model.CustomerRepository;

@Service
public class CustomerService extends ServiceDefault<Customer, CustomerRepository> {

}
