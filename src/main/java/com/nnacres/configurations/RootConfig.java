/**
 * Project : pingme
 * Author : Saurabh Sharma
 */

package com.nnacres.configurations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	public RootConfig(){
		System.out.println("Creating root config");
	}
}
