/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jithe
 */
import java.io.*;
import java.util.*;

public class dataReading1 {
      //fileHandling fh=new fileHandling();
      File f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17;
    HashMap<String,ArrayList<String>> btoci=new HashMap<String,ArrayList<String>>(); 
    HashMap<String,ArrayList<String>> btoc=new HashMap<String,ArrayList<String>>(); 
    HashMap<String,ArrayList<String>> btocmd=new HashMap<String,ArrayList<String>>(); 
    HashMap<String,String> btomn=new HashMap<String,String>(); 
    HashMap<String,String> btomi=new HashMap<String,String>(); 
    HashMap<String,String> bton=new HashMap<String,String>(); 
    HashMap<String,String> btomd=new HashMap<String,String>(); 
    HashMap<String,String> btona=new HashMap<String,String>(); 
    HashMap<String,String> btoda1=new HashMap<String,String>();
    HashMap<String,String> btot1=new HashMap<String,String>(); 
    HashMap<String,String> btonp=new HashMap<String,String>(); 
    HashMap<String,String> btoda2=new HashMap<String,String>(); 
    HashMap<String,String> btot2=new HashMap<String,String>(); 
    HashMap<String,String> btoqr=new HashMap<String,String>(); 
    HashMap<String,ArrayList<String>> btobid=new HashMap<String,ArrayList<String>>(); 
    HashMap<String,String> bidtoph=new HashMap<String,String>(); 
    HashMap<String,String> bidtots=new HashMap<String,String>(); 
    HashMap<String,String> bidtob=new HashMap<String,String>(); 
    HashMap<String,String> bidtopl=new HashMap<String,String>();
    dataReading1(){
        f=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barManuName.txt");
        f1=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barManuId.txt");
        f2=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barName.txt");
        f3=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barManuDate.txt");
        f4=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barNameAgency.txt");
        f5=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barDateArrival1.txt");
        f6=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barTravel1.txt");
        f7=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barNamePharm.txt");
        f8=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barDateArrival2.txt");
        f9=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barTravel2.txt");
        f10=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barChemical.txt");
        f11=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barChemicalId.txt");
        f12=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barChemicalManuDate.txt");
        f13=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barqr.txt");
        f14=new File ("/Users/rohithputha/Desktop/AtmaNirbar/barblockid.txt");
        f15=new File ("/Users/rohithputha/Desktop/AtmaNirbar/blockidprevhash.txt");
        f16=new File ("/Users/rohithputha/Desktop/AtmaNirbar/blockidtimestamp.txt");
        f17=new File ("/Users/rohithputha/Desktop/AtmaNirbar/blockidplace.txt");
    }
    public void barManuNameRead()
        {
           try{
               Scanner sc=new Scanner(f);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String manuname=s.substring(12);
                   btomn.put(barcode, manuname);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
    public void barManuIdRead()
        {
           try{
               Scanner sc=new Scanner(f1);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String manuid=s.substring(12);
                   btomi.put(barcode, manuid);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
     public void barNameRead()
        {
           try{
               Scanner sc=new Scanner(f2);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barname=s.substring(12);
                   bton.put(barcode, barname);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
      public void barManuDateRead()
        {
           try{
               Scanner sc=new Scanner(f3);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String manudate=s.substring(12);
                   btomd.put(barcode, manudate);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
      public void barNameAgencyRead()
        {
           try{
               Scanner sc=new Scanner(f4);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barnameagency=s.substring(12);
                   btona.put(barcode, barnameagency);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
      public void barDateArrival1Read()
        {
           try{
               Scanner sc=new Scanner(f5);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String bardatearrival1=s.substring(12);
                   btoda1.put(barcode, bardatearrival1);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
       public void barTravel1Read()
        {
           try{
               Scanner sc=new Scanner(f6);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String bartravel1=s.substring(12);
                   btot1.put(barcode, bartravel1);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barNamePharmRead()
        {
           try{
               Scanner sc=new Scanner(f7);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barnamepharm=s.substring(12);
                   btonp.put(barcode, barnamepharm);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barDateArrival2Read()
        {
           try{
               Scanner sc=new Scanner(f8);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String bardatearrival2=s.substring(12);
                   btoda2.put(barcode, bardatearrival2);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
         public void barTravel2Read()
        {
           try{
               Scanner sc=new Scanner(f9);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String bartravel2=s.substring(12);
                   btot2.put(barcode, bartravel2);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barChemicalRead()
        {
           try{
               Scanner sc=new Scanner(f10);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barchemical=s.substring(12);
                  
                   btoc.putIfAbsent(barcode,new ArrayList<String>());
                   btoc.get(barcode).add(barchemical);
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barChemicalIdRead()
        {
           try{
               Scanner sc=new Scanner(f11);
               while(sc.hasNextLine())
               {
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barchemicalid=s.substring(12);
                  
                   btoci.putIfAbsent(barcode,new ArrayList<String>());
                   btoci.get(barcode).add(barchemicalid);
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barChemicalManuDateRead()
        {
           try{
               Scanner sc=new Scanner(f12);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String barchemicalmanudate=s.substring(12);
                  
                   btocmd.putIfAbsent(barcode,new ArrayList<String>());
                   btocmd.get(barcode).add(barchemicalmanudate);
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barQr()
        {
           try{
               Scanner sc=new Scanner(f13);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String qr=s.substring(12);
                   btoqr.put(barcode, qr);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void barbid()
        {
           try{
               Scanner sc=new Scanner(f14);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String barcode=s.substring(0,12);
                   String id=s.substring(12);
//                   btobid.put(barcode,id);
                   bidtob.put(id,barcode); 
                    
                   btobid.putIfAbsent(barcode,new ArrayList<String>());
                   btobid.get(barcode).add(id);
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void bidPrevHash()
        {
           try{
               Scanner sc=new Scanner(f15);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String id=s.substring(0,6);
                   String ph=s.substring(6);
                   bidtoph.put(id,ph);
                                      
               }
           }
           catch(Exception e)
           {
               
           }
        }
        public void bidTimeStamp()
        {
           try{
               Scanner sc=new Scanner(f16);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String id=s.substring(0,6);
                   String ts=s.substring(6);
                   bidtots.put(id,ts);
                                    
               }
           }
           catch(Exception e)
           {
               
           }
        }
      
      
     public void bidPlace()
        {
           try{
               Scanner sc=new Scanner(f17);
               while(sc.hasNextLine()){
                   String s=sc.nextLine();
                   String id=s.substring(0,6);
                   String ts=s.substring(6);
                   bidtopl.put(id,ts);
                                    
               }
           }
           catch(Exception e)
           {
               
           }
        }

  
}
