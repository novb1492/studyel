package co.kr.frontcontroller;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")///미쳤네 이렇게 가지고 올수있다 20210506
public class frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public frontcontroller() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("get요철 발생");
		
		String uri=request.getRequestURI();
		String conpath=request.getContextPath();
		
		System.out.println(request.getRequestURI()+"주소");
		System.out.println(request.getContextPath()+"패키지이름");
		
		String com=uri.substring(conpath.length());
		
		//System.out.println(com+"sub");
		
		if(com.equals("/join.do"))///미쳤네 ㅋㅋㅋㅋㅋㅋㅋ 이런게 된다고 ㅋㅋㅋㅋ20210506 겁먹었는데 생각보다 이해가 빨리되서 다행이다...
		{
		System.out.println("회원가입요철");
		}
		else if(com.equals("/loing.do"))
		{
			System.out.println("로그인요철");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
