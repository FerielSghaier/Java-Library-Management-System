/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Date {
   private int jour ;
   private int mois ; 
   private  int annee ;
   public Date(int jour ,int mois , int annee )
   {this.jour=jour ;
   this.mois=mois ;
   this.annee=annee ; 
   }
   @Override
   public String toString(){
   return "Le jour est "+this.jour+" ,le mois est "+ this.mois+ "et d'annee "+this.annee;
   }
   public int get_jour() {return jour;}
   public  void set_jour(int j){this.jour=j;}
   public int get_mois() {return mois;}
   public  void set_mois(int m){this.mois=m;}
   public int get_annee() {return annee;}
   public  void set_annee(int a){this.annee=a;}
   public void saisirDate(Scanner sc){
   System.out.println(" donner le jour ");
   jour =sc.nextInt();
   System.out.println(" donner le mois ");
   mois =sc.nextInt();
   System.out.println(" donner l'annee ");
   annee =sc.nextInt();
   
   }
   
}