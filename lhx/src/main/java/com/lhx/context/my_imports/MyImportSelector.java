package com.lhx.context.my_imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("MyImportSelector.selectImports-----------------");
		return new String[]{"com.lhx.context.dao.ImportSelectIndexBean"};
	}
}
