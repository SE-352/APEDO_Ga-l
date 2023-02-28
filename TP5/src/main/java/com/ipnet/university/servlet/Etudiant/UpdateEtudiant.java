package com.ipnet.university.servlet.Etudiant;

import com.ipnet.university.dto.Etudiant;
import com.ipnet.university.service.EtudiantService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/update/etudiant")
public class UpdateEtudiant extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        String adresse = req.getParameter("adresse");
        String telephone = req.getParameter("telephone");
        //Departement departement = req.getParameter("prenom");

        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setAdresse(adresse);
        etudiant.setTelephone(telephone);
        //etudiant.setDepartement(departement);

        EtudiantService etudiantService = new EtudiantService();
        Etudiant e = etudiantService.saveEtudiant(etudiant);

        HttpSession session = req.getSession();

        if (e != null) {
            session.setAttribute("success", "Etudiant updated successfully");
            resp.sendRedirect("etudiant.jsp");
        } else {
            session.setAttribute("error", "Etudiant failed to get saved");
            resp.sendRedirect("etudiant.jsp");
        }
    }
}
