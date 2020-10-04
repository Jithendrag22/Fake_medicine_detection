
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chsra
 */
public class block {
    String data;
    String hash;
    String prevhash;
    String timestamp;
    String blockID;
    String barcode;
    dataReading1 dr;
    hashFunction hf;
    public block(String brcode)
    {
        hf=new hashFunction();
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
    }
    

     
     public String  getHash(String data){
         
         String prhash=generateHash(data);
         return prhash;
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
   
   public ArrayList<String> getprblockids(){
       //return dr.btobid.get(barcode);
       return dr.btobid.get(barcode);
   }
   
   public String getnextblockid(String prblockid){
        int bidint=Integer.parseInt(prblockid)+1;
        String nextbid=Integer.toString(bidint);
         while(nextbid.length()<6){
            nextbid="0"+nextbid;
        }
       return nextbid; 
   }
   
   public boolean check(){
       
       ArrayList<String> prblockids=getprblockids();
       if(prblockids.size()<3){
           System.out.println("Fake");
           return false;
       }
       
       boolean manfac=false;
       boolean ws=false;
       boolean ph=false;
       boolean Nfake=true;
       for (int i=0;i<prblockids.size();i++){
           String nextblockid=getnextblockid(prblockids.get(i));
           String prblockid=prblockids.get(i);
           String data="";
           
           if(dr.bidtopl.get(prblockid).equals("M"))
           {
               manfac=true;
               data=dataretrievalManu(barcode);
           }
           else if(dr.bidtopl.get(prblockid).equals("W"))
           {
               ws=true;
               data=dataRetrievalWS( barcode);
           }
           else if(dr.bidtopl.get(prblockid).equals("P"))
           {
               ph=true;
               data =dataRetrivalpharm(barcode);
           }
           String prhash=getHash(data);
           String storedhash=dr.bidtoph.get(nextblockid);
           
           System.out.println(prhash+"--"+storedhash);
           
           if(!storedhash.equals(prhash))Nfake=false;
       }
       
       System.out.println(manfac);
       System.out.println(ws);
       System.out.println(ph);
       System.out.println(Nfake);
       
       if(manfac&&ws&&ph&&Nfake){
           System.out.println("Not Fake");
           return true;
       }
       else {
           System.out.println("fake");
           return false;
       }

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
        //=d+(dr.btona.get(bar));
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
    
}
