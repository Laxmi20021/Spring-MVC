package com.xworkz.YuvaNidhi.initilize;

import com.xworkz.YuvaNidhi.configuration.YuvaNidhiConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class YuvaNidhiInitilize extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public YuvaNidhiInitilize()
    {
        System.out.println("Running YuvaNidhiInitilize");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("Created getServletConfigClasses");
        return new Class[]{YuvaNidhiConfiguration.class};
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
