package co.kr.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//�����
//���� ���� url ����
@WebServlet("/apple")
public class servletbasic extends HttpServlet {

	public servletbasic() {
	System.out.println("������");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("initȣ��");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get��û");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post��û");
	}
	@Override
	public void destroy() {
		System.out.println("�Ҹ���");
	}
}
