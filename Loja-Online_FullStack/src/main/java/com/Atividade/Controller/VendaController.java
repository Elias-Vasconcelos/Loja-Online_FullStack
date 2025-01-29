package com.Atividade.Controller;

import com.Atividade.Domain.Cliente;
import com.Atividade.Domain.Venda;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/venda")
public class VendaController extends HttpServlet {
    public Venda venda = new Venda();
    private Gson gson = new Gson();
    public static String test = "sim";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String nomeCliente = req.getParameter("nome");
        Long cpfCliente = Long.parseLong(req.getParameter("cpf"));
        Long telCliente = Long.parseLong(req.getParameter("tel"));
        String endCliente = req.getParameter("end");
        Integer numeroCliente = Integer.parseInt(req.getParameter("numero"));
        String cidadeCliente = req.getParameter("cidade");
        String estadoCliente = req.getParameter("estado");

        Cliente cliente = new Cliente();
        cliente.setCpf(cpfCliente);
        cliente.setNome(nomeCliente);
        cliente.setCidade(cidadeCliente);
        cliente.setEnd(endCliente);
        cliente.setEstado(estadoCliente);
        cliente.setNumero(numeroCliente);
        cliente.setTel(telCliente);


    }
}
