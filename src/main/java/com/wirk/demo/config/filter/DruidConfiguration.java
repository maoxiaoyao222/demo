package com.wirk.demo.config.filter;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfiguration {

  @Bean
  public ServletRegistrationBean druidStatViewServlet() {
    ServletRegistrationBean servletRegistrationBean =
        new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
    servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
    servletRegistrationBean.addInitParameter("deny", "192.168.1.73");
    servletRegistrationBean.addInitParameter("loginUsername", "admin");
    servletRegistrationBean.addInitParameter("loginPassword", "123");
    servletRegistrationBean.addInitParameter("resetEnable", "false");
    return servletRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean druidStatFilter() {
    FilterRegistrationBean filterRegistrationBean =
        new FilterRegistrationBean<>(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter(
        "exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
    return filterRegistrationBean;
  }
}
