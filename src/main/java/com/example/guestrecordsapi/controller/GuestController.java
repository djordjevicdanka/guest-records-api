package com.example.guestrecordsapi.controller;

import com.example.guestrecordsapi.model.Guest;
import com.example.guestrecordsapi.model.Hotel;
import com.example.guestrecordsapi.service.GuestService;
import com.example.guestrecordsapi.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    //GET
    @ResponseBody
    @RequestMapping(value = "/guests", method= RequestMethod.GET)
    public List<Guest> getGuests(){
        return guestService.getAllGuests();
    }

    @ResponseBody
    @RequestMapping(value = "/guests/{guest_id}", method = RequestMethod.GET)
    public Guest getGuestByGuestId(@PathVariable int guest_id){
        return guestService.getGuest(guest_id);
    }

    //POST -> Save the data
    @ResponseBody
    @RequestMapping(value = "/guests/save", method = RequestMethod.POST)
    public void saveGuest(@RequestBody Guest guest){
        guestService.saveGuest(guest);
    }

    //PUT -> Update the data
    @ResponseBody
    @RequestMapping(value = "/guests/update", method = RequestMethod.PUT)
    public void  updateGuest(@RequestBody Guest guest){
        guestService.updateGuest(guest);
    }

    //DELETE -> Delete the data
    public void deleteGuest(int guest_id){
        guestService.deleteGuest(guest_id);
    }

}