package co.kr.frontcontroller;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")///耕弾革 戚係惟 亜走壱 臣呪赤陥 20210506
public class frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public frontcontroller() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get推旦 降持");
		
		String uri=request.getRequestURI();
		System.out.println(request.getRequestURI());
		
		if(uri.equals("/EL/join.do"))///耕弾革 せせせせせせせ 戚訓惟 吉陥壱 せせせせ20210506
		{
		System.out.println("噺据亜脊推旦");
		}
		else if(uri.equals("/EL/loing.do"))
		{
			System.out.println("稽益昔推旦");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
