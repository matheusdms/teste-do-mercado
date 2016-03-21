package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Mercadoria;
import persistence.MercadoriaDao;

/**
 * Servlet implementation class CadastrarMercadoria
 */
@WebServlet("/cadastrar")
public class CadastrarMercadoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarMercadoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
        Mercadoria m;  
        MercadoriaDao md;      
        
        m = new Mercadoria();  
    	m.codigo = Integer.parseInt(request.getParameter("codigo"));   
    	m.tipoMercadoria = request.getParameter("tipomercadoria");
        m.nome = request.getParameter("nome"); 
        m.quantidade = Integer.parseInt(request.getParameter("quantidade")); 
        m.preco = Double.parseDouble(request.getParameter("preco"));
        m.tipoNegocio = request.getParameter("tiponegocio");
            
        md = new MercadoriaDao();
        
        try {
			md.inserir(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}  
 
        request.getRequestDispatcher("/listar").forward(request, response);
    }  
}

