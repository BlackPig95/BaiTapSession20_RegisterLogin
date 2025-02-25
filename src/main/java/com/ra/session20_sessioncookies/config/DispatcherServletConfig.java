package com.ra.session20_sessioncookies.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//Config Dispatcher Servlet
public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[]{AppConfig.class, SpringWebMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters()
    {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true);
        return new Filter[]{characterEncodingFilter};
    }
}
