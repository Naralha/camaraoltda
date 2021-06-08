package br.com.projeto.camaraoltda.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.projeto.camaraoltda.security.IGeneratorJWT;


@Component
public class AppFilter implements Filter {
	
	@Autowired
	private IGeneratorJWT generatorJWT;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		loggingFiltro();
		
		try {
			generatorJWT.validarJwt(req);
		} catch (Exception e) {
			e.printStackTrace();
			res.sendError(401);
			return;
		}
		
		System.out.println("entrou aqui");
		
		chain.doFilter(request, response);
        
		
        
	}
	
	@Bean
	public FilterRegistrationBean<LoggingFilter> loggingFiltro(){
	    FilterRegistrationBean<LoggingFilter> registrationBean 
	      = new FilterRegistrationBean<>();
	        
	    registrationBean.setFilter(new LoggingFilter());
	    registrationBean.addUrlPatterns("/loginAuth/*");
	        
	    return registrationBean;    
	}
	
	

}
