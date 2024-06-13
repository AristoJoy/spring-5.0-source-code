package com.luban.test;

import com.luban.app.Appconfig;
import org.apache.catalina.Wrapper;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringApplication {
	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8000);
		tomcat.addContext("/", "F:\\tmp\\");
		try {
			AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
			ac.register(Appconfig.class);
			ac.refresh();

			// Create and register the DispatcherServlet
			DispatcherServlet servlet = new DispatcherServlet(ac);
			Wrapper wrapper = tomcat.addServlet("/", "mvc", servlet);
			wrapper.addMapping("*.do");


			tomcat.start();

			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
