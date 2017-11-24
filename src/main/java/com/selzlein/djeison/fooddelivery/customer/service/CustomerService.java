package com.selzlein.djeison.fooddelivery.customer.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.customer.model.Customer;
import com.selzlein.djeison.fooddelivery.customer.model.CustomerRepository;

@Service
public class CustomerService extends ServiceDefault<Customer, CustomerRepository> {

}
