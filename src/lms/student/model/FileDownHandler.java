package lms.student.model;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.CommandHandler;

public class FileDownHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		return "/WEB-INF/view/download/lmsFileDownloadPage.jsp";
		
	}

}
