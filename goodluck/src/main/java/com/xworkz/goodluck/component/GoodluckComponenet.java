package com.xworkz.goodluck.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class GoodluckComponenet {


    public GoodluckComponenet()
    {
        System.out.println("Running GoodluckComponenet");
    }

    @RequestMapping("/press")
    public String onPress()
    {
        System.out.println("Running onpress in GoodluckComponenet");
        return "index.jsp";
    }


}
