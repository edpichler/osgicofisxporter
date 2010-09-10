package com.edpichler.receita.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect ExceptionLoggingAspect {

	public pointcut escopo(): within(com.edpichler..*);

	after() throwing(Throwable t): escopo() {
		logThrowable(t, thisJoinPoint.getClass());
	}

	before(Throwable t): handler(Exception+) && args(t) && escopo() {

		logThrowable(t, thisJoinPoint.getClass());
	}

	@SuppressWarnings("unchecked")
	protected synchronized void logThrowable(Throwable t, Class clazz) {

		Logger logger = LoggerFactory.getLogger(clazz);

		logger.error("Ops!", t);

	}
}