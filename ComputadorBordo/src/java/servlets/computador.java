package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "computador", urlPatterns = {"/computador"})
public class computador extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float total = Float.parseFloat(request.getParameter("total"));
        float preco = Float.parseFloat(request.getParameter("preco"));
        float consumo = Float.parseFloat(request.getParameter("consumo"));

        float valor = total / preco;
        float distancia = total * consumo;

        // adicionando atributos à requesição que será enviada para outra página
        request.setAttribute("valor", valor);
        request.setAttribute("distancia", distancia);
        // para onde será redirecionado dentro da aplicação
        request.getRequestDispatcher("computador.jsp").forward(request, response);

    }
}
