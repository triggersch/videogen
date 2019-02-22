package fr.istic.videogen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("/web/**")
          .addResourceLocations("classpath:/static/");
        
        registry
        .addResourceHandler("/video/**")
        .addResourceLocations("classpath:/outputvideo/");
        
        registry
        .addResourceHandler("/img/**")
        .addResourceLocations("classpath:/pictures/");
        
        registry
        .addResourceHandler("/csv/**")
        .addResourceLocations("classpath:/csv/");
        
        registry
        .addResourceHandler("/dsl/**")
        .addResourceLocations("classpath:/dsl/");
        
        registry
        .addResourceHandler("/playlist/**")
        .addResourceLocations("classpath:/playlists/");
    }
    
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/web", "/web/index.html");
        registry.addRedirectViewController("/web/", "index.html");
    }
}