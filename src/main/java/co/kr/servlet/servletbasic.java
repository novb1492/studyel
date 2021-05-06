package co.kr.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//선언법
//보안 위해 url 맵핑
@WebServlet("/apple")
public class servletbasic extends HttpServlet {

	public servletbasic() {
	System.out.println("생성자");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init호출");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get요청");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post요청");
	}
	@Override
	public void destroy() {
		System.out.println("소멸자");
	}
}
