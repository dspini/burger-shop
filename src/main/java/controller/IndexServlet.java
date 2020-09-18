package controller;

import model.Burger;
import model.DaoFactory;
import model.Soda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // This will be the page we access when we hit 'http://localhost:8080/ - without any URL patterns to recognize

        // Get all of the existing burgers, and list them here with links to their individual profile pages
        List<Burger> allBurgers = new ArrayList<>();
        allBurgers.add(DaoFactory.getBurgersDao().findById(1L)); // BigMac
        allBurgers.add(DaoFactory.getBurgersDao().findById(2L)); // Homestyle
        allBurgers.add(DaoFactory.getBurgersDao().findById(3L)); // QuarterPounder

        req.setAttribute("allBurgers", allBurgers); // sending our List<Burger> allBurgers as the attribute "allBurgers"

        // create a list of all our existing sodas
        List<Soda> allSodas = new ArrayList<>();
        allSodas.add(DaoFactory.getSodasDao().findById(1L)); // coke
        allSodas.add(DaoFactory.getSodasDao().findById(2L)); // drpepper
        allSodas.add(DaoFactory.getSodasDao().findById(3L)); // sprite

        // add a new attribute called "allSodas" or something similar
        req.setAttribute("allSodas", allSodas);

        // Determine the Size of a Soda instance, based on its `quantity` value

        List<String> cokeSize = new ArrayList<>();
        for ( Soda soda : allSodas ) {

            switch (soda.getQuantity()) {
                case 1:
                    cokeSize.add("Small");
                    break;
                case 2:
                    cokeSize.add("Medium");
                    break;
                case 3:
                    cokeSize.add("SuperSize");
                    break;
                default:
                    cokeSize.add("Huh?");
                    break;
            }

        }



        //  [ "medium", "medium", "Super-Size" ]
        req.setAttribute("cokeSizes", cokeSize);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}