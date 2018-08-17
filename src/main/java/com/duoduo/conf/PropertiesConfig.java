package com.duoduo.conf;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.tiantian.config.Constants;

public class PropertiesConfig extends PropertyPlaceholderConfigurer{
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		//环境变量
		Constants.ENVIRONMENT = props.getProperty("env.name");
	}

}