package com.selzlein.djeison.fooddelivery.customer.web;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.selzlein.djeison.fooddelivery.FoodDeliveryApplication;
import com.selzlein.djeison.fooddelivery.customer.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = WebEnvironment.RANDOM_PORT,
		classes = FoodDeliveryApplication.class)
@AutoConfigureMockMvc
public class CustomerControllerTest {

	private static String URI = "/customers/";
	
	@Autowired
	private MockMvc mvc;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	public void shouldCreate() throws Exception {
		String json = objectMapper.writeValueAsString(buildCustomer());
		mvc.perform(post(URI)
			.contentType(MediaType.APPLICATION_JSON)
			.content(json)
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
	@Test
	public void shouldNotCreateWhenEmptyNameAndAddress() throws Exception {
		String json = objectMapper.writeValueAsString(buildCustomerEmpty());
		mvc.perform(post(URI)
			.contentType(MediaType.APPLICATION_JSON)
			.content(json)
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isBadRequest());	
	}

	@Test
	public void shouldGet() throws Exception {
		shouldCreate();

		// @formatter:off
		mvc.perform(get(URI)
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", hasSize(1)))
			.andExpect(jsonPath("$[0].name", equalTo("John")))
			.andExpect(jsonPath("$[0].address", equalTo("Main St.")))
			.andExpect(jsonPath("$[0].birthday", equalTo("2000-01-25"))
		);
		// @formatter:on
	}

	private Customer buildCustomer() {
		return Customer.builder()
				.name("John")
				.address("Main St.")
				.birthday(LocalDate.of(2000, 01, 25))
				.build();
	}

	private Customer buildCustomerEmpty() {
		return Customer.builder()
				.build();
	}
}
