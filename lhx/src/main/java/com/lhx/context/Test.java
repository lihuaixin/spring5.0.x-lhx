package com.lhx.context;

import com.lhx.context.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		/**
		 * lhx 代码注释
		 * 刷新容器，因为配置是容器初始化后注册的，所以要重新刷新容器
		 */
		applicationContext.refresh();
	}

}
