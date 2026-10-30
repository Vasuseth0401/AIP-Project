package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String studentName = request.getParameter("studentName");
        String rollNo = request.getParameter("rollNo");
        String subject = request.getParameter("subject");
        String rating = request.getParameter("rating");
        String feedback = request.getParameter("feedback");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");

        out.println("<title>Feedback Submitted</title>");

        out.println("<style>");

        out.println("body {");
        out.println("font-family: Arial, sans-serif;");
        out.println("background: #f2f2f2;");
        out.println("margin: 0;");
        out.println("padding: 0;");
        out.println("}");

        out.println(".result {");
        out.println("width: 450px;");
        out.println("margin: 70px auto;");
        out.println("background: white;");
        out.println("padding: 30px;");
        out.println("border-radius: 12px;");
        out.println("box-shadow: 0 0 15px #bbb;");
        out.println("}");

        out.println("h1 {");
        out.println("text-align: center;");
        out.println("color: green;");
        out.println("}");

        out.println("h3 {");
        out.println("padding: 8px;");
        out.println("border-bottom: 1px solid #ddd;");
        out.println("}");

        out.println(".back {");
        out.println("display: block;");
        out.println("text-align: center;");
        out.println("margin-top: 20px;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='result'>");

        out.println("<h1>Feedback Submitted!</h1>");

        out.println("<h3>Student Name: " + studentName + "</h3>");
        out.println("<h3>Roll Number: " + rollNo + "</h3>");
        out.println("<h3>Subject: " + subject + "</h3>");
        out.println("<h3>Rating: " + rating + "/5</h3>");
        out.println("<h3>Feedback: " + feedback + "</h3>");

        out.println("<div class='back'>");
        out.println("<a href='index.html'>Submit Another Feedback</a>");
        out.println("</div>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}