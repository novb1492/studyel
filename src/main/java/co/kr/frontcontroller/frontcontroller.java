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
		String conpath=request.getContextPath();
		
		System.out.println(request.getRequestURI()+"爽社");
		System.out.println(request.getContextPath()+"鳶徹走戚硯");
		
		String com=uri.substring(conpath.length());
		
		//System.out.println(com+"sub");
		
		if(com.equals("/join.do"))///耕弾革 せせせせせせせ 戚訓惟 吉陥壱 せせせせ20210506 位股醸澗汽 持唖左陥 戚背亜 察軒鞠辞 陥楳戚陥...
		{
		System.out.println("噺据亜脊推旦");
		}
		else if(com.equals("/loing.do"))
		{
			System.out.println("稽益昔推旦");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
