package bitcamp.mvc.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 웹 애플리케이션을 시작할 때 이 메서드를 호출한다. 누가?
        System.out.println("====> MyWebApplicationInitializer.onStartup"); 
        
        // 1) 프론트 컨트롤러가 사용할 SPringIoC 컨테이너를 만든다
        XmlWebApplicationContext iocContainer = new XmlWebApplicationContext();
        iocContainer.setConfigLocation("/WEB-INF/spring/mvc-servlet.xml");
        
        // 2) 프론트 컨트롤러를 만든다.
        DispatcherServlet mvcDispatcher = new DispatcherServlet(iocContainer);
        
        // 3) 프론트 컨트롤러를 웹 애플리케이션에 등록한다.
        // => addServlet()의 리턴 값은 서블릿 URL 패턴 등을 설정할 때 사용할 도구.
        Dynamic registration = servletContext.addServlet("mvc", mvcDispatcher);
        
        
        // 4) load-on-startup 값 설정
        registration.setLoadOnStartup(1);
        registration.addMapping("/mvc/*");
    }

}
