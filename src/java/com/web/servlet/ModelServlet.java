/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import com.web.bean.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anderson
 */
public class ModelServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        this.processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        this.processRequest(req, resp);
    }

    private void toLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        HttpSession session = req.getSession();
//        session.setAttribute("username", username);        
//        session.setAttribute("password", password);
//        UserBean user = new UserBean();
//        user.setUsername(username);
//        user.setPassword(password);
//        if (user.login()) {
//            resp.sendRedirect(req.getContextPath() + "/success.jsp");
        resp.sendRedirect("login"+"?username=admin&&password=admin");
//        }
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String actionType = req.getParameter("actionType");//使用提交表单中的actionType来决定不同的方法
        if ("login".equals(actionType)) {
            toLogin(req, resp);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
