package com.xworkz.goodluck.initilize;

import com.xworkz.goodluck.configuration.GoodluckConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoodluckInitilize extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public GoodluckInitilize()
    {
        System.out.println("Running GoodluckInitilize");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("Created getServletConfigClasses");
        return new Class[]{GoodluckConfiguration.class};
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
