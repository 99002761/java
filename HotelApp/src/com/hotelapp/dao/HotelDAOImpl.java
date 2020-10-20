package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		List<Hotel> newHotelList= new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getCity().equals(hotel))
				newHotelList.add(hotel);
		}
		// TODO Auto-generated method stub
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newHotelList =new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		// TODO Auto-generated method stub
		return newHotelList;
	}

	@Override
	public Hotel getById(int id) {
		for(Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==id)
				return hotel;
		}
		// TODO Auto-generated method stub
		return null;
	}

	private List<Hotel> showHotelList() {
		return Arrays.asList(
				new Hotel("myntra",37,"karimnagar","nonveg"),
				new Hotel("peacock",38,"warangal","veg"),
				new Hotel("silver",39,"hyderabad","nonveg")
				);
		// TODO Auto-generated method stub
		//return null;
	}



}
