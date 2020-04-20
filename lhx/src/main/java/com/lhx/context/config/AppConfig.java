package com.lhx.context.config;

import com.lhx.context.my_imports.MyImportBeanDefinitionRegistar;
import com.lhx.context.my_imports.MyImportSelector;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configurable
@ComponentScan("com.lhx.context.dao")
@Import({MyImportSelector.class, MyImportBeanDefinitionRegistar.class})
public class AppConfig {

}
