
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohithputha
 */
public class QRCodeGenerator {
    dataReading1 dr=new dataReading1();
    hashFunction hf=new hashFunction();
    QRCodeGenerator(){
        dr.barChemicalIdRead();
        dr.barChemicalManuDateRead();
        dr.barChemicalRead();
        dr.barDateArrival1Read();
        //dr.barTravel2Read();
        //dr.barDateArrival2Read();
        dr.barManuDateRead();
        dr.barManuIdRead();
        dr.barManuNameRead();
        dr.barNameAgencyRead();
        //dr.barNamePharmRead();
        dr.barNameRead();
        dr.barTravel1Read();
    }
    
    public String hashreturn(String bar,String d){
        
        //d=d+(dr.btona.get(bar));
        //d=d+(dr.btot2.get(bar));
        
           ArrayList<String> ar=new ArrayList<String>();
        ar=dr.btoci.get(bar);
//        for (int i=0;i<ar.size();i++)
//        {
//            System.out.println(ar.get(i));
//        }
//        
        for(int i=0;i<ar.size();i++)
        {
            d=d+ar.get(i);
        }
        ar=dr.btoc.get(bar);
        for(int i=0;i<ar.size();i++)
        {
            d=d+ar.get(i);
        } 
        
        ar=dr.btocmd.get(bar);
        for(int i=0;i<ar.size();i++)
        {
            d=ar.get(i)+d;
        }
        d=d+(dr.btomd.get(bar));
        d=d+(dr.btomi.get(bar));
        //d=d+(dr.btonp.get(bar));
        //d=d+(dr.btoda1.get(bar));
        //d=d+(dr.btoda2.get(bar));
        d=d+(dr.bton.get(bar));
        //d=d+(dr.btot1.get(bar));
        d=d+(dr.btomn.get(bar));
        d=d+bar;
       
        
       
        String k="";
         for(int i=d.length()-1;i>=0;i--){
             k=k+Character.toString(d.charAt(i));
         }
        String hash=generateHash(k);
        
       return hash.substring(25,41);
    }
     public String generateHash(String d)
    {
        String h="";
        try
        {
            byte a[]=hf.getSHA(d);
            h=hf.toHexString(a);
        }
        catch(Exception e)
        {
            
        }
        return h;
    }
  }
