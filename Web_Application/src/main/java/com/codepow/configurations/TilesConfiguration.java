package com.codepow.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration 
public class TilesConfiguration extends WebMvcConfigurerAdapter {
         
	@Bean
	public UrlBasedViewResolver UrlBasedViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
	
	@Bean 
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer configurer= new TilesConfigurer();
		configurer.setDefinitions(new String[] {
				
				"/WEB-INF/tiles/tiles_user.xml"
		});
		return configurer;
	}
}
