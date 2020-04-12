package com.lhx.context;

import com.lhx.context.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		applicationContext.refresh();
	}

}
