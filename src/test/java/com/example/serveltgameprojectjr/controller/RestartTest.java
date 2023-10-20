package com.example.serveltgameprojectjr.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

class RestartTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private HttpSession session;

    private restart restartServlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        restartServlet = new restart();
        when(request.getSession()).thenReturn(session);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        when(session.getAttribute("name")).thenReturn("Иван");
        when(session.getAttribute("ipAddress")).thenReturn("8.8.8.8");
        when(session.getAttribute("counts")).thenReturn("5");

        restartServlet.doGet(request, response);

        verify(request, times(3)).getSession();
        verify(session, times(3)).getAttribute(any());
        verify(session, times(3)).setAttribute(anyString(), any());
        verify(response).sendRedirect("/logic");
    }

}
