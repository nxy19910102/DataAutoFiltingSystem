package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharactorFilter implements Filter {

	private FilterConfig config;
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		String charset = config.getInitParameter("charset");
		if (charset==null){
			charset="utf-8";
		}
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);
		response.setContentType("text/html);charset="+charset);
		System.out.println("charFilterStart");
		arg2.doFilter(arg0, arg1);
		System.out.println("charFilterEnd");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		config = arg0;
	}
}
