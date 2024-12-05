package com.xworkz.Matrimony.initilize;

import com.xworkz.Matrimony.configuration.MatrimonyConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MatrimonyInitilize extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {




    public MatrimonyInitilize()
    {
        System.out.println("Running MatrimonyInitilize");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("Created getServletConfigClasses");
        return new Class[]{MatrimonyConfiguration.class};
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
