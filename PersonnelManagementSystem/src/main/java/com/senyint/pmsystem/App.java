package com.senyint.pmsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 工程启动类
 * 
 * @author CaiShiJun
 *
 */
@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);

	}
}
