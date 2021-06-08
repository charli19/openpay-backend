package com.openpay.app.common.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext ctx;

	/**
	 * Gets current Spring ApplicationContext instance.
	 * 
	 * @return {@link ApplicationContext}
	 */
	public static ApplicationContext getApplicationContext() {
		return ctx;
	}

	/**
	 * (non-Javadoc)
	 *
	 * @see ApplicationContextAware#setApplicationContext(ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext ctx) {
		ApplicationContextProvider.ctx = ctx;
	}

	/**
	 * Allows to overrides the static instance of the application with a new one
	 *
	 * @param newContext new Application Context to set
	 * @throws BeansException if something wrong happen
	 */
	public static void overrideApplicationContext(ApplicationContext newContext) {
		ApplicationContextProvider.ctx = newContext;
	}

	public static String getMessage(String key, Object[] arguments) {
		return ctx.getMessage(key, arguments, LocaleContextHolder.getLocale());
	}

	public static String getMessage(String key) {
		return ctx.getMessage(key, new Object[] {}, LocaleContextHolder.getLocale());
	}

}
