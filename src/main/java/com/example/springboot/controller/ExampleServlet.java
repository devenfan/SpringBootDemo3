package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Deven on 2016-02-22.
 * It seems @WebServlet is useless...
 */
@WebServlet("/example1")
public class ExampleServlet extends HttpServlet {


    private Logger logger = LoggerFactory.getLogger(ExampleServlet.class);


    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 使用正常的servlet API获取session，在底层，
        // session是通过Spring Session得到的，并且会存储到Redis或
        // 其他你所选择的数据源中

        HttpSession session = request.getSession();
        String value = (String)session.getAttribute("key1");

        System.out.println("key1: " + value);
        logger.info("key1: " + value);
    }

}
