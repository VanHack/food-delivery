package com.selzlein.djeison.fooddelivery.restaurant.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.selzlein.djeison.fooddelivery.restaurant.model.Restaurant;

public class RestaurantIdSerializer extends StdSerializer<Restaurant> {

	private static final long serialVersionUID = 1L;

	public RestaurantIdSerializer() {
		this(null);
	}

	protected RestaurantIdSerializer(Class<Restaurant> t) {
		super(t);
	}

	@Override
	public void serialize(Restaurant restaurant, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeStartObject();
		generator.writeNumberField("id", restaurant.getId());
		generator.writeEndObject();
	}
}
