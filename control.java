/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chsra
 */
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class control {
    static fileHandling fh=new fileHandling();
    static dataWriting dw=new dataWriting();
    static dataReading1 dr=new dataReading1();
    //static createBlock cr=new createBlock();
    //static block b=new block("112233445564");
    static QRCodeGenerator qr=new QRCodeGenerator();
    public control()
    {
        
    }
    public static void main(String args[])
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
        dr.bidTimeStamp();
        dr.bidPrevHash();
        dr.barbid();
        dr.barQr();
       /* Iterator it = dr.bton.entrySet().iterator();
         while(it.hasNext()) {
             System.out.println("HELLO1");
            Map.Entry obj = (Entry)it.next();
            System.out.println(obj.getKey());}
        //dw.barChemical("012345678910","propanol");
        dw.barChemical("012345678910","etahnol");
        //dw.barChemicalId("012345678910","arIndustry");
        dw.barChemicalId("012345678910", "brIndustry");
      //  dw.barChemicalManuDate("012345678910","22/08/19");
        dw.barChemicalManuDate("012345678910","23/08/19");
        dw.barName("012345678911","para");*/
       
//       dw.barblockid("112233445560","000001");
//       dw.bidPrevHash("000001","0");
//       dw.bidTimeStamp("000001","211652166");
//       dw.barNamePharm("112233445560", "apolo");
//       dw.barTravel2("112233445560", "ekart");
//       dw.barDateArrival2("112233445560", "16/09/2020");
//       dw.bidplace("000001", "P");
       // System.out.println(cr.dataRetrival("112233445572"));
       
     //b.check();
       //System.out.println(qr.hashreturn("112233445565", ""));
    }
}
