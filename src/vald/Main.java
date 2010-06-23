package vald;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import org.vamdc.vald.VALD;

/**
 *
 * @author monstr
 */
public class Main {

    /**
     * @param args the command line arguments
     */



    public static void main(String[] args) {
        // TODO code application logic here

     try{
         long t0=System.currentTimeMillis();
       VALD vald=new VALD();
       long t1=System.currentTimeMillis();
       vald.sendQuery("*", "limit 10");
       long t2=System.currentTimeMillis();
       vald.build();
       long t3=System.currentTimeMillis();
       System.out.println((t1-t0)+" "+(t2-t1)+" "+(t3-t2));
//       vald.toFile("/home/monstr/work/VAMDC/Koln/test.xsams");
       System.out.println(vald.getXSAMS());
     }catch(Exception e){System.out.println(e.toString());}

 }
}