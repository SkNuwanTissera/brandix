package com.spring.brandix;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by Nuwan-PC on 10/01/2017.
 */
@WebServlet(name = "MyServlet",
        urlPatterns = {"/hello"})
public class HelloWorld extends HttpServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
        res.getWriter().println("Hello World!!");
    }
}
