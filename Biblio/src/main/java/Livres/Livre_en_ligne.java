/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livres;

import java.util.Scanner;


/**
 *
 * @author MSI
 */
public class Livre_en_ligne extends Livre{
    String format ;
    Double prix_reel ;
    Double pourcentage_reduction ;
    
    public Livre_en_ligne(int reference ,String titreL ,String auteur ,int anneecreation , int nbpages ,String type,String format , Double prix_reel ,Double pourcentage_reduction)
    {super(reference ,titreL ,auteur , anneecreation , nbpages ,type);
    this.format=format ;
    this.prix_reel=prix_reel ;
    this.pourcentage_reduction=pourcentage_reduction;  
    } 
    
     public String get_format() {return format ;}
   public  void set_format(String f){this.format =f;}
   public Double get_prixReel(){return prix_reel;}
   public void set_prixReel(Double pr){this.prix_reel=pr;}
     public Double get_pourcentageRed() {return  pourcentage_reduction ;}
   public  void set_pourcentageRed(Double pred){this. pourcentage_reduction =pred;}
   
       public void afficher_livLigne() {
  System.out.println(this);
  System.out.println (" ,le format ");
  System.out.println(format);
  System.out.println( " ,le prix reel ");
  System.out.println( prix_reel);
   System.out.println (" ,le pourcentage de réduction ");
  System.out.println( pourcentage_reduction);
  }
       
       
  public void saisir_livemprunt(Scanner sc ){
  saisirliv(sc);
  System.out.println("donner le format du livre ");
  format=sc.nextLine() ;
  System.out.println("donner le prix reel du livre ");
  prix_reel = sc.nextDouble() ; 
  System.out.println("donner le pourcentage de réduction du livre ");
  pourcentage_reduction=sc.nextDouble();
  }  
}
