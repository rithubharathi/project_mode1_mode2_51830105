package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService detailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(detailsService);
	}
	
	@Bean
	protected PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/manager/**").hasAnyRole("ADMIN","MGR")
		.antMatchers("/customer/**").hasAnyRole("ADMIN","MGR","CUSTOMER")
		.antMatchers("/home/**").authenticated()
		.and().formLogin()
		.loginPage("/mylogin").loginProcessingUrl("/myloginprocessingurl")
		.usernameParameter("email").passwordParameter("password")
		.permitAll()
		.and().exceptionHandling().accessDeniedPage("/accessdenied");
		
	
	}
	

}
