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
import java.lang.*;
public class createBlock {
    
    dataReading1 dr;
    hashFunction hf=new hashFunction();
    dataWriting dw=new dataWriting();
    String barcode;
    String timestamp;
    String blockid;
    String prevhash;
    public createBlock(String brcode,String tstp)
    {
        dr=new dataReading1();
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.bidPlace();
        barcode=brcode;
        timestamp=tstp;
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
//    public static void main(String args[])
//    {
//        createBlock cb= new createBlock();
//       // System.out.println(dataRetrival("123456789101"));
//    }
//   
//    
    public void  findid()
    {
        dr=new dataReading1();
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.bidPlace();
        
        blockid=Integer.toString(dr.bidtob.size()+1);
        //System.out.println(dr.btobid.size()+"---");
        while(blockid.length()<6){
            blockid="0"+blockid;
        }
        System.out.println(dr.btobid.size()+"---");
        System.out.println(blockid);
    }
    
    public void findprevhash(){ 
        //String bid=dr.btobid.get(barcode);
        
        int bidint=Integer.parseInt(blockid)-1;
        String prevbid=Integer.toString(bidint);
         while(prevbid.length()<6){
            prevbid="0"+prevbid;
        }
        
        String prevbarcode=dr.bidtob.get(prevbid);
        System.out.println(prevbid+"@@@@@----");
        System.out.println(prevbarcode);
        
        if(dr.bidtopl.get(prevbid).equals("M"))
        {
           
            String data=dataretrievalManu(prevbarcode);
            prevhash=generateHash(data);
        }
        
        else if (dr.bidtopl.get(prevbid).equals("W"))
        {
             String data=dataRetrievalWS(prevbarcode);
             prevhash=generateHash(data);
        }
        
        else if(dr.bidtopl.get(prevbid).equals("P"))
        {
             String data=dataRetrivalpharm(prevbarcode);
            prevhash=generateHash(data);
        }
        
     }
    
    public void writeblock(String place){
        
        dw.barblockid(barcode, blockid);
        dw.bidPrevHash(blockid, prevhash);
        dw.bidTimeStamp(blockid, timestamp);
        dw.bidplace(blockid, place);
        dr=new dataReading1();
        dw=new dataWriting();
    }
    
    public String dataretrievalManu(String bar)
    {
          
        dr=new dataReading1();
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.bidPlace();
        
        
        String d="";
        //d=d+(dr.btot2.get(bar));
        d=d+bar;
        d=d+(dr.btomi.get(bar));
        //d=d+(dr.btonp.get(bar));
        //d=d+(dr.btoda1.get(bar));
        //d=d+(dr.btoda2.get(bar));
        d=d+(dr.btomd.get(bar));
        //d=d+(dr.btot1.get(bar));
        d=d+(dr.btomn.get(bar));
        d=d+(dr.bton.get(bar));
        //d=d+(dr.btona.get(bar));
       System.out.println("_-_______");
        ArrayList<String> ar=new ArrayList<String>();
//        ar=dr.btoci.get("112233445565");
//        System.out.println(bar);
       System.out.println(bar);
        ar=dr.btoci.get(bar);
        
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
        
        return d+bar;
    }
    public String dataRetrievalWS(String bar){
          
        dr=new dataReading1();
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.bidPlace();
        
        
        String d="";
        //d=d+(dr.btot2.get(bar));
        d=d+bar;
        //d=d+(dr.btomi.get(bar));
        //d=d+(dr.btonp.get(bar));
        d=d+(dr.btoda1.get(bar));
        //d=d+(dr.btoda2.get(bar));
        //d=d+(dr.btomd.get(bar));
        d=d+(dr.btot1.get(bar));
        //d=d+(dr.btomn.get(bar));
        d=d+(dr.bton.get(bar));
        d=d+(dr.btona.get(bar));

        return d+bar;
    }
    
     public String dataRetrivalpharm(String bar)
    {   
        
        dr=new dataReading1();
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.bidPlace();
        
        
        String d="";
        d=d+(dr.btot2.get(bar));
        d=d+bar;
        //d=d+(dr.btomi.get(bar));
        d=d+(dr.btonp.get(bar));
        //d=d+(dr.btoda1.get(bar));
        d=d+(dr.btoda2.get(bar));
        //d=d+(dr.btomd.get(bar));
        //d=d+(dr.btot1.get(bar));
        //d=d+(dr.btomn.get(bar));
        d=d+(dr.bton.get(bar));
        //d=d+(dr.btona.get(bar));
   
        
        return d+bar;
    }
    
}
