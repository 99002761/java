package com.hotelapp.client;
import java.util.List;
import com.hotelapp.model.Hotel;

import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

public class User1 {
	//private static final String String = null;
	public static void main(String[] args) {
		HotelService hotelService =  new HotelServiceImpl();
		List<Hotel> hotelList = hotelService.getAllHotels();
		for(Hotel hotel: hotelList)
			System.out.println(hotel);
	}

}
