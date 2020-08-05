package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Country extends HttpServlet {
	 @Override
	 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		int code=0;
		//int code1=0;
		String capitals[]= {"New Delhi","Islamabad","Bejing","WashingtonDc","Colombo"};
		String currency[]= {"rupee","rupees","yen","dollar","rupeee"};
		String Language[]= {"telugu","hindi","english","english","tamil"};
		//get Printwriter
		pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//get country code
		code=Integer.parseInt(req.getParameter("country"));
		//display the capital
		//String h1;
		pw.println("<h1 style='color:blue;text-align:center'>Capital is::"+capitals[code]+"</h1>");
		pw.println("<h1 style='color:blue;text-align:center'>Currency is::"+currency[code]+"</h1>");
		pw.println("<h1 style='color:blue;text-align:center'>Language is::"+Language[code]+"</h1>");
	
        //add home hyperlink
		pw.println("<br><a href='form.html'>home</a>");
		//close stream
		pw.close();
	 }
	 @Override
	 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doGet(req,res); 
	 }

}