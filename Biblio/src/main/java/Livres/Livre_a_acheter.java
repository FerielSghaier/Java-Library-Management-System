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
public class Livre_a_acheter extends Livre{
    private int nbexemplaires ; 
    private Double vraiprix ;
    
    
    public Livre_a_acheter(int reference ,String titreL ,String auteur ,int anneecreation , int nbpages ,String type,int nbexemplaires,Double vraiprix )
    {super(reference ,titreL ,auteur , anneecreation , nbpages ,type);
    this.nbexemplaires=nbexemplaires;
    this.vraiprix=vraiprix; 
    }
    
   public int get_nbexemplaires() {return nbexemplaires ;}
   public  void set_nbexemplaires(int nb){this.nbexemplaires=nb;}
   public Double get_vraiprix(){return vraiprix;}
   public void set_vraiprix(Double vp){this.vraiprix=vp;}
   
   
  public void afficher_livachat() {
  System.out.println(this);
  System.out.println (" ,le nombre d'emplaires ");
  System.out.println(nbexemplaires);
  System.out.println( " ,le vrai prix ");
  System.out.println( vraiprix);
  
  }
  public void saisir_livachat(Scanner sc ){
  saisirliv(sc);
  System.out.println("donner le nombre d'exemplaires du livre ");
   nbexemplaires=sc.nextInt();
   System.out.println("donner le vrai prix du livre ");
   vraiprix=sc.nextDouble() ;      
  } 
    
    
}
