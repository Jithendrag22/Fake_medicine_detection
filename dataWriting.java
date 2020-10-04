/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chsra
 */

import java.util.*;
import java.io.*;
public class dataWriting {
    //fileHandling dr=new fileHandling();
/*    public dataWriting(fileHandling f)
    {
        dr=f;
    }*/
    dataReading1 dr=new dataReading1();
    public dataWriting()
    {
        dr.barChemicalIdRead();
        dr.barChemicalManuDateRead();
        dr.barChemicalRead();
        dr.barDateArrival1Read();
        dr.barTravel2Read();
        dr.barDateArrival2Read();
        dr.barManuDateRead();
        dr.barManuIdRead();
        dr.barManuNameRead();
        dr.barNameAgencyRead();
        dr.barNamePharmRead();
        dr.barNameRead();
        dr.barTravel1Read();
        dr.barQr();
        dr.barbid();
        dr.bidPrevHash();
        dr.bidTimeStamp();
        dr.bidPlace();
    }
    public void barManuName(String bar,String manuname)
    {
         try
             {
               String textToAppend =bar+manuname;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barManuName.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.btomn.size()>0)
                writer.newLine(); 
              dr.btomn.put(bar, manuname);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barManuId(String bar,String manuid)
    {
         try
             {
               String textToAppend =bar+manuid;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barManuId.txt", true)  //Set true for append mode
                            );  
              if(dr.btomi.size()>0)
                writer.newLine();  
              dr.btomi.put(bar, manuid);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barName(String bar,String name)
    {
         try
             {
               String textToAppend =bar+name;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barName.txt", true)  //Set true for append mode
                            );  
              if(dr.bton.size()>0)
                writer.newLine();  
              dr.bton.put(bar, name);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barManuDate(String bar,String date)
    {
         try
             {
               String textToAppend =bar+date;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barManuDate.txt", true)  //Set true for append mode
                            );  
              if(dr.btomd.size()>0)
                writer.newLine();  
              dr.btomd.put(bar, date);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barNameAgency(String bar,String name)
    {
         try
             {
               String textToAppend =bar+name;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barNameAgency.txt", true)  //Set true for append mode
                            );  
              if(dr.btona.size()>0)
                writer.newLine(); 
              dr.btona.put(bar, name);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barDateArrival1(String bar,String date)
    {
         try
             {
               String textToAppend =bar+date;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barDateArrival1.txt", true)  //Set true for append mode
                            );  
              if(dr.btoda1.size()>0)
                writer.newLine();  
                 dr.btoda1.put(bar, date);                   //Add new line
//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barTravel1(String bar,String travel)
    {
         try
             {
               String textToAppend =bar+travel;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barTravel1.txt", true)  //Set true for append mode
                            );  
              if(dr.btot1.size()>0)
                writer.newLine(); 
              dr.btot1.put(bar, travel);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barNamePharm(String bar,String name)
    {
         try
             {
               String textToAppend =bar+name;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barNamePharm.txt", true)  //Set true for append mode
                            );  
              if(dr.btonp.size()>0)
                writer.newLine();  
              dr.btonp.put(bar, name);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barDateArrival2(String bar,String date)
    {
         try
             {
               String textToAppend =bar+date;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barDateArrival2.txt", true)  //Set true for append mode
                            );  
              if(dr.btoda2.size()>0)
                writer.newLine();   
                dr.btoda2.put(bar, date);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barTravel2(String bar,String travel)
    {
         try
             {
               String textToAppend =bar+travel;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barTravel2.txt", true)  //Set true for append mode
                            );  
              if(dr.btot2.size()>0)
                 writer.newLine();
              dr.btot2.put(bar,travel);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barChemical(String bar,String chem)
    {
         try
             {
               String textToAppend =bar+chem;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barChemical.txt", true)  //Set true for append mode
                            );  
              if(dr.btoc.size()>0)
                 writer.newLine();  
             dr.btoc.putIfAbsent(bar,new ArrayList<String>());
              dr.btoc.get(bar).add(chem); //Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barChemicalId(String bar,String id)
    {    
       // System.out.println(dr.btoci.get("112233445560"));
         try
             {
               String textToAppend =bar+id;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barChemicalId.txt", true)  //Set true for append mode
                            );  
              if(dr.btoci.size()>0)
                 writer.newLine();
              dr.btoci.putIfAbsent(bar,new ArrayList<String>());
              dr.btoci.get(bar).add(id);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barChemicalManuDate(String bar,String date)
    {
         try
             {
               String textToAppend =bar+date;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barChemicalManuDate.txt", true)  //Set true for append mode
                            );  
              if(dr.btocmd.size()>0)
                 writer.newLine();   
              dr.btocmd.putIfAbsent(bar,new ArrayList<String>());
              dr.btocmd.get(bar).add(date);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barqrcode(String bar,String qr)
    {
        
         try
             {
               String textToAppend =bar+qr;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barqr.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.btoqr.size()>0)
                writer.newLine(); 
              dr.btoqr.put(bar,qr);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void barblockid(String bar,String bid)
    {
         try
             {
               String textToAppend =bar+bid;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/barblockid.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.btobid.size()>0)
                writer.newLine(); 
//              dr.btobid.put(bar,bid);//Add new line
              dr.btobid.putIfAbsent(bar,new ArrayList<String>());
              dr.btobid.get(bar).add(bid);
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void bidPrevHash(String bid,String ph)
    {
         try
             {
               String textToAppend =bid+ph;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/blockidprevhash.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.bidtoph.size()>0)
                writer.newLine(); 
              dr.bidtoph.put(bid,ph);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    public void bidTimeStamp(String bid,String ts)
    {
         try
             {
               String textToAppend =bid+ts;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/blockidtimestamp.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.bidtots.size()>0)
                writer.newLine(); 
              dr.bidtots.put(bid,ts);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
  
    
   public void bidplace(String bid,String ts)
    {
         try
             {
               String textToAppend =bid+ts;
     
              BufferedWriter writer = new BufferedWriter(
                                new FileWriter("/Users/rohithputha/Desktop/AtmaNirbar/blockidplace.txt", true)  //Set true for append mode
                            ); 
              
              if(dr.bidtopl.size()>0)
                writer.newLine(); 
              dr.bidtopl.put(bid,ts);//Add new line
              writer.write(textToAppend);
              writer.close();
             }
             catch(Exception e)
             {// Display error
                 
             }
    }
    

}
