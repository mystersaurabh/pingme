/**
 * Project : pingme
 * Author : Saurabh Sharma
 */

package com.nnacres.configurations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan("com.nnacres.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
	
	public WebConfig(){
		System.out.println("creating webconfig");
	}
}
