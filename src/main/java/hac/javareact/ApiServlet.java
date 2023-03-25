package hac.javareact;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletApi", value = "/api")
public class ApiServlet extends HttpServlet {
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // your code here

        // note: this is necessary to allow cross-origin requests from the React frontend
        // response.setHeader("Access-Control-Allow-Origin", "*");

        // remove this line ! it's only for you to browse the template
        response.getWriter().println("You are not supposed to browse this page. It will be used for API calls.");
    }

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // your code here

        // note: this is necessary to allow cross-origin requests from the React frontend
        // response.setHeader("Access-Control-Allow-Origin", "*");

    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }
}
