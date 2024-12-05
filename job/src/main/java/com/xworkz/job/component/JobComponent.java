package com.xworkz.job.component;

import com.xworkz.job.dto.JobDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class JobComponent {



    public JobComponent()
    {
        System.out.println("Running JobComponent");
    }




    @RequestMapping("/apply")
    public String onApply(JobDTO jobDTO)
    {
        System.out.println("Running onApply in JobComponent");
        System.out.println("Data from form:"+ jobDTO);
        return "Job.jsp";
    }
}
