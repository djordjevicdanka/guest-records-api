package com.example.guestrecordsapi.controller;

import com.example.guestrecordsapi.model.Hotel;
import com.example.guestrecordsapi.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //GET
    @ResponseBody
    @RequestMapping(value = "/hotels", method= RequestMethod.GET)
    public List<Hotel> getHotels(){
        return hotelService.getAllHotels();
    }



    @ResponseBody
    @RequestMapping(value = "/hotels/{hotel_id}", method = RequestMethod.GET)
    public Hotel getHotelByHotelId(@PathVariable int hotel_id){
        return hotelService.getHotel(hotel_id);
    }

    //POST -> Save the data
    @ResponseBody
    @RequestMapping(value = "/hotels/save", method = RequestMethod.POST)
    public void saveHotel(@RequestBody Hotel hotel){
        hotelService.saveHotel(hotel);
    }

    //PUT -> Update the data
    @ResponseBody
    @RequestMapping(value = "/hotels/update", method = RequestMethod.PUT)
    public void  updateHotel(@RequestBody Hotel hotel){
        hotelService.updateHotel(hotel);
    }

    //DELETE -> Delete the data

    public void deleteHotel(int hotel_id){
        hotelService.deleteHotel(hotel_id);
    }


}
