package co.kr.frontcontroller;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")///���Ƴ� �̷��� ������ �ü��ִ� 20210506
public class frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public frontcontroller() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get��ö �߻�");
		
		String uri=request.getRequestURI();
		System.out.println(request.getRequestURI());
		
		if(uri.equals("/EL/join.do"))///���Ƴ� �������������� �̷��� �ȴٰ� ��������20210506
		{
		System.out.println("ȸ�����Կ�ö");
		}
		else if(uri.equals("/EL/loing.do"))
		{
			System.out.println("�α��ο�ö");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
