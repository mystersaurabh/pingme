/**
 * Project : pingme
 * Author : Saurabh Sharma
 */
package com.nnacres.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	
	@Override
	protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic registration) {
		super.customizeRegistration(registration);
		registration.setInitParameter("throwExceptionIfNoHandlerFound","true");
	}

}

