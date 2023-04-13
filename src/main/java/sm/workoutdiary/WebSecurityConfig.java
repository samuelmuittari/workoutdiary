package sm.workoutdiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import sm.workoutdiary.web.UserDetailsImpl;
// configuroidaan httpsecurity ja passwordencoder
@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class WebSecurityConfig {
    @Autowired
    private UserDetailsImpl userDetailsService;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests().requestMatchers("/css/**", "/save").permitAll()
		.and()
		.authorizeHttpRequests().anyRequest().authenticated()
		.and()
		.headers().frameOptions().disable() //for h2 console			
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/workoutlist", true)
		.permitAll()
		.and()
		.logout().permitAll();
				
		return http.build();
	}

    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
    
}
