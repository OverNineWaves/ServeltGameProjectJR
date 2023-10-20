package com.example.serveltgameprojectjr.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Restart", value = "/restart")
public class restart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();

        String ipAddress = (String) session.getAttribute("ipAddress");

        String name = (String) session.getAttribute("name");

        int count = Integer.parseInt(String.valueOf(session.getAttribute("counts")));
        count++;

        req.getSession().invalidate();

        session = req.getSession();

        session.setAttribute("ipAddress", ipAddress.toString());
        session.setAttribute("name", name);
        session.setAttribute("counts", count);
        resp.sendRedirect("/logic");
    }
}