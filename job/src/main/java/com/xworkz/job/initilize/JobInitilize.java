package com.xworkz.job.initilize;

import com.xworkz.job.configuration.JobConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JobInitilize extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public JobInitilize()
    {
        System.out.println("Running JobInitilize");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("Created getServletConfigClasses");
        return new Class[]{JobConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("configured urls for DispatcherService");
        return new String[]{"/"};

    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resource handling by server itself...");
        configurer.enable();
    }



}
