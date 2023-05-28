package Filters;

	import java.io.IOException;

	import javax.servlet.Filter;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebFilter;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;


@WebFilter("/admin")
public class AdminPanel implements Filter {
	
	


		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			
			HttpSession session = ((HttpServletRequest)request).getSession();
			if (session.getAttribute("loggedInEmail") == null) {
				session.setAttribute("loginError", "Only Login");
				((HttpServletResponse)response).sendRedirect("view/login.jsp");
			}
			else if(session.getAttribute("loggedInEmail") != null && session.getAttribute("loggedInRole").equals("admin")) {
				chain.doFilter(request, response);
			}
			else {
				session.setAttribute("loginError", "Log in first");
				((HttpServletResponse)response).sendRedirect("view/login.jsp");
			}
		}

	


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
