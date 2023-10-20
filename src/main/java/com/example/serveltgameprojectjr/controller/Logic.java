package com.example.serveltgameprojectjr.controller;

import com.example.serveltgameprojectjr.model.Data;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Logic", value = "/logic")
public class Logic extends HttpServlet {

    private int count = 1;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

        Data quest = new Data();

        String button = null;
        if (request.getParameter("button") != null) {
            button = request.getParameter("button");
        }

        String choice = "Играть в игру?";
        if (button != null) {
            choice = quest.getAnswers().get(button);
        }

       session.setAttribute("choice", choice);
       session.setAttribute("question", quest.getQuests().get(choice));

        String buttonOne = null;
        String buttonTwo = null;
        try {
            buttonOne = quest.getChoice().get(choice).getStr1();
            buttonTwo = quest.getChoice().get(choice).getStr2();
        } catch (Exception e) {}

        if (choice.contains("Поражение")) {
            session.setAttribute("buttonOne", "lose");
            session.setAttribute("buttonTwo", "lose");
        } else if (choice.contains("Победа")) {
            session.setAttribute("buttonOne", "win");
            session.setAttribute("buttonTwo", "win");
        } else {
            session.setAttribute("buttonOne", buttonOne);
            session.setAttribute("buttonTwo", buttonTwo);
        }

        response.sendRedirect("/game.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();

        session.setAttribute("name", req.getParameter("name"));
        session.setAttribute("ipAddress", req.getRemoteAddr());
        session.setAttribute("counts", count);

        resp.sendRedirect("/logic");
    }
}