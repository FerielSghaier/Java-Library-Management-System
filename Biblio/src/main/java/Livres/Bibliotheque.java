       /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Livres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;  

/**
 *
 * @author MSI
 */
  public class Bibliotheque {

    private String AdresseB;
    private ArrayList<Livre> stockLiv;
    private ArrayList<Adherent> Adh;
    private ArrayList<Administrateur> Admin;

    public Bibliotheque(String AdresseB) {
        this.AdresseB = AdresseB;
        stockLiv = new ArrayList();
        Adh = new ArrayList();
        Admin = new ArrayList();
    }

    public void supprimerLivre(int refL) {

        for (int i = 0; i < stockLiv.size(); i++) {
            {
                if (stockLiv.get(i).get_ref() == refL) {
                    stockLiv.remove(i);
                }
            }
        }
    }

    public void ajouterLivre(Livre L)
    {
        stockLiv.add(L);
    }

    public int chercherLivre(int refL) {
        for (int i = 0; i < stockLiv.size(); i++) {
            if (stockLiv.get(i).get_ref() == refL) {
                return i;
            }
        }
    }

    public void afficherbib() {
        System.out.println(AdresseB);
        List<Livre> LIV = stockLiv.stream().collect(Collectors.toList());
        System.out.println(LIV);
        List<Adherent> adher = Adh.stream().collect(Collectors.toList());
        System.out.println(adher);
        List<Administrateur> admini = Admin.stream().collect(Collectors.toList());
        System.out.println(admini);
    }

    public void saisirBiblio(Scanner sc) {
        System.out.println("Ecrire l'adresse de la bibliotheque : ");
        AdresseB = sc.nextLine();
        System.out.println("Ajouter un livre OUI/NON : ");
        String rep = sc.nextLine();
        while ("OUI".equals(rep)) {
            Livre liv = new Livre();
            stockLiv.add(liv.saisirliv(sc));
            System.out.println("Ajouter un livre OUI/NON : ");
            rep = sc.nextLine();
        }
        System.out.println("Ajouter un administrateur OUI/NON : ");
        String repp = sc.nextLine();
        while ("OUI".equals(repp)) {
            Administrateur a = new Administrateur();
            Admin.add(a.saisiradm());
            System.out.println("Ajouter un administrateur OUI/NON : ");
            repp = sc.nextLine();
        }
        System.out.println("Ajouter un adherent OUI/NON : ");
        String reppp = sc.nextLine();
        while ("OUI".equals(reppp)) {
            Adherent ad = new Adherent();
            Admin.add(ad.saisiradh());
            System.out.println("Ajouter un adherent OUI/NON : ");
            reppp = sc.nextLine();
        }}
       

    public void supprimerAdh(int cinadh) {
        for (int i = 0; i < Adh.size(); i++) {
            {
                if (Adh.get(i).get_cin() == cinadh) {
                    Adh.remove(Adh.get(i));
                }
            }
        }
    }

    public Boolean chercherAdh(Adherent adh) {
        return Adh.contains(adh);
    }
     public void ajouterAdh(Adherent ad)
    {
        Adh.add(ad);
    }
     public void supprimerAdmin(int cinadm) {
        for (int i = 0; i < Admin.size(); i++) {
            {
                if (Admin.get(i).get_cin() == cinadm) {
                    Adh.remove(Admin.get(i));
                }
            }
        }
    }
     
     public Boolean chercherAdmin(Administrateur adm) {
        return Admin.contains(adm);
    }
     public void ajouterAdmin(Administrateur adm)
    {
        Admin.add(adm);
    }
     public void afficherAdh() {
     
         System.out.println("les adherents sont : ");
        List<Adherent> adher = Adh.stream().collect(Collectors.toList());
        System.out.println(adher);
       
    }
      public void afficherAdmin() { 
     System.out.println("les administrateurs sont : ");
        List<Administrateur> admini = Admin.stream().collect(Collectors.toList());
        System.out.println(admini);}
      
       public void afficherLiv() { 
     System.out.println("les livres disponibles sont : ");
        List<Livre> LIV = stockLiv.stream().collect(Collectors.toList());
         System.out.println(LIV);}

}    
  
