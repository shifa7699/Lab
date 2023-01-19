package com.Lab.work;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Lab.entity.College;

public class Test_College {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContent.xml");
		BeanFactory bf = new XmlBeanFactory(resource);		
		College cl =(College) bf.getBean("C");
		cl.display();
	}
}

