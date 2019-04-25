

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet(name = "SignupServlet", urlPatterns= {"signup"})
public class SignupServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String[] fields = new String[8];
		fields[0] = request.getParameter("firstname");
		fields[1] = request.getParameter("lastname");
		fields[2] = request.getParameter("department");
		fields[3] = request.getParameter("position");
		fields[4] = request.getParameter("email");
		fields[5] = request.getParameter("cemail");
		fields[6] = request.getParameter("password");
		fields[7] = request.getParameter("cpassword");
		
		boolean[] validity = validate(fields);
		if(!validity[3]) {
			//go to valid page
		}else {
			//change signup page
			out.println("<!DOCTYPE html>"); 
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Sign-up Page</title>"); 
			out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"Signup.css\">"); 
			out.println("<script src=\"Signup.js\"></script>"); 
			out.println("</head>"); 
			out.println("<body>"); 
			out.println("<header>"); 
			out.println("<h1>Sign-up</h1>"); 
			out.println("</header>"); 
			out.println("<ul class=\"card\">"); 
			out.println("<li><a href=\"#link1\">Home</a></li>"); //home link
			out.println("<li><a href=\"#link2\">Login</a></li>"); //login link
			out.println("</ul>"); 
			out.println("<div class=\"container\">"); 
			out.println("<form name=\"Sign-up\" action=\"SignupServlet\" method=\"post\">"); 
			out.println("<p id=\"missing\"></p>"); 
			out.println("<fieldset class=\"card\">"); 
			out.println("<legend>PERSONAL INFORMATION</legend>"); 
			out.println("<table>"); 
			out.println("<tr>"); 
			out.println("<td><input type=\"text\" name=\"firstname\" placeholder=\"First Name\" value=\""+ fields[0] +"\" required>"); 
			out.println("<p></p></td>"); 
			out.println("<td><input type=\"text\" name=\"lastname\" placeholder=\"Last Name\" value=\""+ fields[1] +"\" required>"); 
			out.println("<p></p></td>"); 
			out.println("</tr>"); 
			out.println("<tr>"); 
			out.println("<td><input type=\"text\" name=\"department\" placeholder=\"Department\" value=\""+ fields[2] +"\" required>"); 
			out.println("<p></p></td>"); 
			out.println("<td><input type=\"text\" name=\"position\" placeholder=\"Position\" value=\""+ fields[3] +"\" required>"); 
			out.println("<p></p></td>"); 
			out.println("</tr>"); 
			out.println("</table>"); 
			out.println("</fieldset>"); 
			out.println("<br>"); 
			out.println("<fieldset class=\"card\">"); 
			out.println("<legend>LOGIN CREDENTIALS</legend>"); 
			out.println("<table>"); 
			out.println("<tr>"); 
			if(validity[0]) {
				out.println("<td><input type=\"email\" name=\"email\" placeholder=\"Email\" required>"); 
				out.println("<p></p></td>"); 
				out.println("<td><input type=\"email\" name=\"cemail\" placeholder=\"Confirm Email\" required>"); 
				out.println("<p id=\"emlMch\" style=\"color:red\">E-mails do not Match</p></td>");
			}else {
				out.println("<td><input type=\"email\" name=\"email\" placeholder=\"Email\" value=\""+ fields[4] +"\" required>"); 
				out.println("<p></p></td>"); 
				out.println("<td><input type=\"email\" name=\"cemail\" placeholder=\"Confirm Email\" value=\""+ fields[4] +"\" required>"); 
				out.println("<p id=\"emlMch\"></p></td>");
			}
			out.println("</tr>"); 
			out.println("<tr>"); 
			if(validity[1]||validity[2]) {
				out.println("<td><input type=\"password\" name=\"password\" onfocusout=\"formatPassword()\" placeholder=\"Password\" required>"); 
				out.println("<p id=\"pwdFrmt\"></p></td>"); 
				out.println("<td><input type=\"password\" name=\"cpassword\" onfocusout=\"matchPassword()\" placeholder=\"Confirm Password\" required>"); 
				out.println("<p id=\"pwdMch\" style=\"color:red\">Re-enter Passwords</p></td>");
			}else {
				out.println("<td><input type=\"password\" name=\"password\" onfocusout=\"formatPassword()\" placeholder=\"Password\" value=\""+ fields[6] +"\" required>"); 
				out.println("<p id=\"pwdFrmt\"></p></td>"); 
				out.println("<td><input type=\"password\" name=\"cpassword\" onfocusout=\"matchPassword()\" placeholder=\"Confirm Password\" value=\""+ fields[7] +"\" required>"); 
				out.println("<p id=\"pwdMch\"></p></td>");
			}
			out.println("</tr>"); 
			out.println("</table>"); 
			out.println("</fieldset>"); 
			out.println("<br>"); 
			out.println("<input class=\"card\" type=\"submit\" value=\"SIGNUP\" onsubmit=\"return validateForm()\">"); 
			out.println("</form>"); 
			out.println("</div>"); 
			out.println("</body>"); 
			out.println("</html>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public boolean[] validate(String[] fds) {
		boolean[] checks = new boolean[4];
		//check for matching email
		if(!fds[4].equals(fds[5])){
			checks[0]=true;
			checks[3]=true;
		}
		if(!fds[6].matches("[A-Za-z0-9]{6,30}")) {
			checks[1]=true;
			checks[3]=true;

		}
		if(!fds[6].equals(fds[7])) {
			checks[2]=true;
			checks[3]=true;

		}
		return checks;
	}

}
