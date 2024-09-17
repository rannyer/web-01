package br.com.testandoServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Cantor{
    private int ID;
    private String nome;
    private String estiloMusical;
    private String qtdAlbuns;

    public Cantor(int ID, String nome, String estiloMusical, String qtdAlbuns) {
        this.ID = ID;
        this.nome = nome;
        this.estiloMusical = estiloMusical;
        this.qtdAlbuns = qtdAlbuns;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getQtdAlbuns() {
        return qtdAlbuns;
    }

    public void setQtdAlbuns(String qtdAlbuns) {
        this.qtdAlbuns = qtdAlbuns;
    }
}

public class CriaCantorServlet extends HttpServlet {

    static ArrayList<Cantor> cantores =  new ArrayList<>();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String estiloMusical = request.getParameter("estiloMusical");
        String qtdAlbuns = request.getParameter("qtdAlbuns");

        System.out.println(nome);
        System.out.println(estiloMusical);
        System.out.println(estiloMusical);

        cantores.add(new Cantor(1, nome, estiloMusical, qtdAlbuns));

        PrintWriter out =  response.getWriter();
        out.println("<html><body><h1>Cantor Adicionado com sucesso</h1></body></html>");

    }

}
