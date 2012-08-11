package com.neutrino.common.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect implements MethodInterceptor{
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		String className = invocation.getThis().getClass().getName();
		
		if(logger.isDebugEnabled()){
			logger.debug(className + "." + invocation.getMethod().getName() + "() Start!");
			Object[] args = invocation.getArguments();
			if(args != null && args.length >0){
				for(int i=0;args.length>i;i++){
					logger.debug("["+i+"] arg :" +args[i]);
				}
			}
		}
		
		//Target class method proceed
		Object retVal = invocation.proceed();
		
		if(logger.isDebugEnabled()){
			logger.debug(className + "." + invocation.getMethod().getName() + "() Finish!");
		}
		
		return retVal;
	}
}
