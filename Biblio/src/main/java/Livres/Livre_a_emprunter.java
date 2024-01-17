/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livres;

import Date.Date;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Livre_a_emprunter extends Livre {
   private  Date date_emprunt ;
   private Date date_retour ;
    public Livre_a_emprunter (int reference ,String titreL ,String auteur ,int anneecreation , int nbpages ,String type,Date date_emprunt,Date date_retour)
   { super(reference ,titreL ,auteur , anneecreation , nbpages ,type);
    this.date_emprunt=date_emprunt; 
    this.date_retour=date_retour;}
    
   public Date get_dateEmp() {return date_emprunt ;}
   public  void set_dateEmp(Date de){this.date_emprunt =de;}
   public Date get_dateRe(){return date_retour;}
   public void set_dateRe(Date dr){this.date_retour=dr;}
   
    public void afficher_livemprunt() {
  System.out.println(this);
  System.out.println (" ,la date d'emprunt ");
  System.out.println(date_emprunt);
  System.out.println( " ,la date de retour ");
  System.out.println( date_retour);
  }
   
    public void saisir_livemprunt(Scanner sc ){
  saisirliv(sc);
  System.out.println("donner la date d'emprunt du livre ");
  date_emprunt.saisirDate(sc);
  System.out.println("donner la date de retour du livre ");
  date_retour.saisirDate(sc) ;      
  }  
    
}
