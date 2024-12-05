package com.xworkz.YuvaNidhi.Componenet;

import com.xworkz.YuvaNidhi.dto.YuvaNidhiDTO;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class YuvaNidhiComponent {

    public YuvaNidhiComponent()
    {
        System.out.println("Running YuvaNidhiComponent");
    }




    @RequestMapping("/apply")
    public String onApply(YuvaNidhiDTO yuvaNidhiDTO)
    {
        System.out.println("Running onApply in YuvaNidhiComponent");
        System.out.println("Data from form:"+ yuvaNidhiDTO);
        return "YuvaNidhi.jsp";
    }
}
