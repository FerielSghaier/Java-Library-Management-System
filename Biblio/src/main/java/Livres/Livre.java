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
public class Livre {
    private int reference ;
    private  String titreL ;
    private  String auteur ; 
    private  int anneecreation ; 
    private  int nbpages ;
    private  String type ;
    
    public Livre(){}
    public Livre(int reference ,String titreL ,String auteur ,int anneecreation , int nbpages ,String type ){
        this.anneecreation=anneecreation;
        this.reference=reference ;
        this.auteur=auteur;
        this.titreL=titreL;
        this.nbpages=nbpages;
        this.type=type ;   
    }
    
   
    @Override
   public String toString()
           {
    return "Le livre est de reference "+this.reference+" ,de titre "+ this.titreL+" ,d'auteur "+ this.auteur +" , créé en " +this.anneecreation+" , de nombre de pages "+this.nbpages+"et de type "+this.type ;
           }
   
   
   public int get_ref() {return reference ;}
   public  void set_ref(int r){this.reference=r;}
   public String get_titre(){return titreL;}
   public void set_titre(String t){this.titreL=t;}
   public String get_type(){return type;}
   public void set_type(String t){this.type=t;}
   public String get_auteur(){return auteur;}
   public void set_auteur(String a){this.auteur=a;}
    public int get_anneecreation(){return anneecreation;}
   public void set_anneecreation(int an){this.anneecreation=an;}
    public int get_nbpages(){return nbpages;}
   public void set_nbpages(int nb){this.nbpages=nb;}
   
   
   
   public void saisirliv(Scanner sc ){ 
 System.out.println("donner la reference du livre ");
   reference =sc.nextInt();
 System.out.println("donner le titre du livre ");
 titreL=sc.nextLine();
 System.out.println("donner l'auteur du livre ");
  auteur=sc.nextLine();
   System.out.println("donner l'année de création du livre ");
  anneecreation =sc.nextInt();
   System.out.println("donner le nombre de pages du livre ");
  nbpages =sc.nextInt();
     System.out.println("donner le type du livre ");
  type=sc.nextLine();
   }
 
}
