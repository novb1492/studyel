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
		String conpath=request.getContextPath();
		
		System.out.println(request.getRequestURI()+"�ּ�");
		System.out.println(request.getContextPath()+"��Ű���̸�");
		
		String com=uri.substring(conpath.length());
		
		//System.out.println(com+"sub");
		
		if(com.equals("/join.do"))///���Ƴ� �������������� �̷��� �ȴٰ� ��������20210506 �̸Ծ��µ� �������� ���ذ� �����Ǽ� �����̴�...
		{
		System.out.println("ȸ�����Կ�ö");
		}
		else if(com.equals("/loing.do"))
		{
			System.out.println("�α��ο�ö");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
