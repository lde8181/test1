package com.dj.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dj.dao.UserInfoDAO;
import com.dj.dto.PersonDTO;

/**
 * 회원가입을 시켜주는 Servlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PersonDTO person = new PersonDTO();
		person.setUserId(request.getParameter("id"));
		person.setPassword(request.getParameter("pw"));
		person.setName(request.getParameter("name"));
		person.setGender(request.getParameter("gender"));
		person.setAge(
				Integer.parseInt(
						request.getParameter("age")));
		person.setJob(request.getParameter("job"));
		person.setAddress(request.getParameter("address"));
		UserInfoDAO dao = new UserInfoDAO();
		HttpSession session = request.getSession();
		if(dao.setUserInfo(person)>0){
			session.setAttribute("sid", session.getId());
			session.setAttribute("pid", person);
			request.getRequestDispatcher("BBSListServlet").forward(request, response);
		}else{
			response.sendRedirect(
					"/TestProject/html/regist.jsp");
		}
	}
}