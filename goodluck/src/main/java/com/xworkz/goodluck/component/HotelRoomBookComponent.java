package com.xworkz.goodluck.component;

import com.xworkz.goodluck.dto.HotelRoomBookDTO;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/"
public class HotelRoomBookComponent {


    public HotelRoomBookComponent()
    {
        System.out.println("running HotelRoomBookComponent");
    }

    @RequestMapping("/book")
    public String onBook(HotelRoomBookDTO hotelRoomBookDTO)
    {
        System.out.println("running onbook in HotelRoomBookComponent");
        System.out.println("data from form:"+ hotelRoomBookDTO);
        return "HotelRoomBook.jsp";
    }
}
