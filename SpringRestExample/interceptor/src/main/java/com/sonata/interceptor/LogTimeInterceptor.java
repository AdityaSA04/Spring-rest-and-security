package com.sonata.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;

import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.HandlerInterceptor;

public class LogTimeInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object source) throws Exception {
		System.out.println("preHandle() method");
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler, @Nullable ModelAndViewContainer modelAndView ) {
		long time = (long) request.getAttribute("startTime");
		long timeTaken = System.currentTimeMillis()-time;
		System.out.println("The duration is: "+ timeTaken);
		
	}
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, @Nullable Exception e) throws Exception {
	System.out.println("After completion method");
}
}
