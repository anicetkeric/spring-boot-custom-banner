package com.bootlabs.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCustomBannerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootCustomBannerApplication.class);
		//application.setBannerMode(Banner.Mode.OFF); //Disabling the Banner
		//application.setBanner(new CustomAnsiBanner()); // custom banner
		application.run(args);
	}
}
