/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vamdc.vald;

import java.sql.*;
import org.vamdc.xsams.*;
import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
 
/**
 *
 * @author monstr
 */


public class VALD {

private String[] element={"",
 "H","He","Li","Be", "B", "C", "N", "O", "F","Ne",
"Na","Mg","Al","Si", "P", "S","Cl","Ar", "K","Ca",
"Sc","Ti", "V","Cr","Mn","Fe","Co","Ni","Cu","Zn",
"Ga","Ge","As","Se","Br","Kr","Rb","Sr", "Y","Zr",
"Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn",
"Sb","Te", "I","Rn","Cs","Ba","La","Ce","Pr","Nd",
"Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb",
"Lu","Hf","Ta", "W","Re","Os","Ir","Pt","Au","Hg",
"Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th",
"Pa", "U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm",
"Md","No","Lr","Ku","Ns"};


 private double wavelength;
 private String code;
 private double loggf;
 private double E_low;
 private double J_low;
 private double g_low;
 private double E_up;
 private double J_up;
 private double g_up;
 private String Connection_low;
 private String Connection_up;
 private String Conf_low;
 private String Conf_up;
 private String Term_low;
 private String Term_up;
 private String Ref;
 private String Comments;

 private XSAMSData root=null;
 private ProcessesType procs=null;
 private StatesType states=null;
 private Sources sources=null;
 private RadiativeTransitionType rt=null;
 private Radiative rad=null;
 private RadiativeTransitionProbabilityType rtp=null;
 private Atoms atoms=null;
 private AtomType atom=null;
 private JAXBContext jc=null;
 private Marshaller m=null;
 private IsotopeType ist=null;
 private IonStateType is=null;
 private AtomicStateType aslow=null;
 private AtomicStateType asup=null;
 private AtomicNumericalDataType andtlow=null;
 private AtomicNumericalDataType andtup=null;
 private AtomicQuantumNumbersType aqnlow=null;
 private AtomicQuantumNumbersType aqnup=null;
 private AtomicCompositionType aclow=null;
 private AtomicCompositionType acup=null;
 private AtomicComponentType acmlow=null;
 private AtomicComponentType acmup=null;
 private ConfigurationType conflow=null;
 private ConfigurationType confup=null;
 private TermType termlow=null;
 private TermType termup=null;

 private String Driver="";
 private String point="[.]";
 private int colCount;
 public String WORK="NOT WORK";

 private StringWriter sw=null;

 public Connection con;
 private ResultSet rs;

 public VALD(String Driver) throws Exception {
  this.Driver=Driver;
  //Connect("jdbc:mysql://83.149.230.175:3306/vald","vald","vamdc2010");
  Connect("jdbc:mysql://localhost:3306/vald","vald","vamdc2010");
 }

 public VALD() throws Exception {
  this.Driver="com.mysql.jdbc.Driver";
   //Connect("jdbc:mysql://83.149.230.175:3306/vald","vald","vamdc2010");
  Connect("jdbc:mysql://localhost:3306/vald","vald","vamdc2010");
 }

private boolean Connect(String URL, String user, String pass) throws Exception {
   
   Class.forName(this.Driver).newInstance();
   con=DriverManager.getConnection(URL,user,pass);
   return true;
 
  }

public void sendQuery(String Select, String Where){
 // Driver="com.mysql.jdbc.Driver"

    try{

            jc = JAXBContext.newInstance( "org.vamdc.xsams");
            m = jc.createMarshaller();
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );

     rs = con.createStatement().executeQuery("select "+Select+" from vald "+Where);

    ResultSetMetaData rsmd = rs.getMetaData();
    colCount = rsmd.getColumnCount();

 }catch(Exception e){
     System.out.println(e.toString());
}
}


public void build(){

    rt=null;
    root=new XSAMSData();
    procs=new ProcessesType();
    rad=new Radiative();
    atoms=new Atoms();
    sources=new Sources();
    procs.setRadiative(rad);
    states=new StatesType();
    states.setAtoms(atoms);
    root.setStates(states);
    root.setProcesses(procs);
    

    try{
    int nr=0;

      
     while (rs.next()) {

     rt=new RadiativeTransitionType();
      rtp=new RadiativeTransitionProbabilityType();
      rt.getProbabilities().add(rtp);
      atom=new AtomType();

      ist=new IsotopeType();
      atom.getIsotopes().add(ist);
      is=new IonStateType();
      ist.getIonStates().add(is);
      aslow=new AtomicStateType();
      asup=new AtomicStateType();

      aslow.setStateID("Initial_"+nr);
      asup.setStateID("Final_"+nr);

      andtlow=new AtomicNumericalDataType();
      andtup=new AtomicNumericalDataType();
      aslow.setAtomicNumericalData(andtlow);
      asup.setAtomicNumericalData(andtup);
      is.getAtomicStates().add(aslow);
      is.getAtomicStates().add(asup);

      aqnlow=new AtomicQuantumNumbersType();
      aqnup=new AtomicQuantumNumbersType();
      aslow.setAtomicQuantumNumbers(aqnlow);
      asup.setAtomicQuantumNumbers(aqnup);

      aclow=new AtomicCompositionType();
      acup=new AtomicCompositionType();
      aslow.setAtomicComposition(aclow);
      asup.setAtomicComposition(acup);

      acmlow=new AtomicComponentType();
      acmup=new AtomicComponentType();
      conflow=new ConfigurationType();
      acmlow.setConfiguration(conflow);
      confup=new ConfigurationType();
      acmup.setConfiguration(confup);
      aclow.getComponents().add(acmlow);
      acup.getComponents().add(acmup);

      termlow=new TermType();
      termup=new TermType();
      acmlow.setTerm(termlow);
      acmup.setTerm(termup);

      wavelength=((Double)(rs.getObject("wavelength"))).doubleValue();
      code=rs.getObject("code").toString();
      loggf=((Double)(rs.getObject("loggf"))).doubleValue();
      E_low=((Double)(rs.getObject("E_low"))).doubleValue();
      E_up=((Double)(rs.getObject("E_up"))).doubleValue();
      J_low=((Double)(rs.getObject("J_low"))).doubleValue();
      J_up=((Double)(rs.getObject("J_up"))).doubleValue();
      g_low=((Double)(rs.getObject("g_low"))).doubleValue();
      g_up=((Double)(rs.getObject("g_up"))).doubleValue();
      Connection_low=rs.getObject("Connection_low").toString();
      Connection_up=rs.getObject("Connection_up").toString();
      Conf_low=rs.getObject("Conf_low").toString();
      Conf_up=rs.getObject("Conf_up").toString();
      Term_low=rs.getObject("Term_low").toString();
      Term_up=rs.getObject("Term_up").toString();
      Ref=rs.getObject("Ref").toString();
      Comments=rs.getObject("Ref").toString();


      setWavelength(wavelength);
      setElement(code);
      setProbability(loggf);
      setElow(E_low);
      setEup(E_up);
      setglow(g_low);
      setgup(g_up);
      setQNlow(J_low);
      setQNup(J_up);
//      setConnlow(Connection_low);
//      setConnup(Connection_up);
      setConflow(Conf_low);
      setConfup(Conf_up);
      setComments(Comments);

      atoms.getAtoms().add(atom);
      rad.getRadiativeTransitions().add(rt);
      nr++;
    }
    data2xml();
    con.close();
    rs.close();
    }catch(Exception e){
     System.out.println(e.toString());

    }
}

private  void setWavelength(double lam){
        EnergyWavelengthType ewl=new EnergyWavelengthType();
        WavelengthWavenumberType wl=new WavelengthWavenumberType();
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(lam);
        val.setUnits("A");
        dt.setValue(val);
        wl.setRitz(dt);
        ewl.setWavelength(wl);
        rt.setEnergyWavelength(ewl);
}

private  void setProbability(double loggf){
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(loggf);
        val.setUnits("unitless");
        dt.setValue(val);
        rtp.setLog10WeightedOscillatorStregnth(dt);
}

private  void setElement(String code){

         String[] elion = code.split(point);
         int n=Integer.valueOf(elion[0]).intValue();
         ChemicalElementType chel=new ChemicalElementType();
         chel.setElementSymbol(element[n]);
         chel.setNuclearCharge(Integer.valueOf(elion[0]));
         atom.setChemicalElement(chel);
         IsotopeParametersType isp=new IsotopeParametersType();
         //isp.setMassNumber(Integer.valueOf(elion[1]));
         //ist.setIsotopeParameters(isp);
         is.setIonCharge(Integer.valueOf(elion[1]));
}

private  void setElow(double Ep){
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(Ep);
        val.setUnits("cm-1");
        dt.setValue(val);
        andtlow.setStateEnergy(dt);
}

private  void setEup(double Ep){
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(Ep);
        val.setUnits("cm-1");
        dt.setValue(val);
        andtup.setStateEnergy(dt);
}

private  void setglow(double g){
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(g);
        val.setUnits("unitless");
        dt.setValue(val);
        andtlow.setLandeFactor(dt);
}

private  void setgup(double g){
        DataType dt=new DataType();
        ValueType val=new ValueType();
        val.setValue(g);
        val.setUnits("unitless");
        dt.setValue(val);
        andtup.setLandeFactor(dt);
}

private  void setQNlow(double J){
       aqnlow.setTotalAngularMomentum(J);
}

private  void setQNup(double J){
       aqnup.setTotalAngularMomentum(J);
}

private  void setConnlow(String conn){
    if(conn.equals("JJ")){
        JjCouplingType jj=new JjCouplingType();
        termlow.setJj(jj);
    }
    if(conn.equals("LS")){
        LSCouplingType ls=new LSCouplingType();
        termlow.setLS(ls);
    }
}

private  void setConnup(String conn){
    if(conn.equals("JJ")){
        JjCouplingType jj=new JjCouplingType();
        termup.setJj(jj);
    }
    if(conn.equals("LS")){
        LSCouplingType ls=new LSCouplingType();
        termup.setLS(ls);
    }
}

private  void setConflow(String conf){
    conflow.setConfigurationLabel(conf);
    String[] cf=conf.split(point);
    termlow.setTermLabel(cf[0]);
}

private  void setConfup(String conf){
    confup.setConfigurationLabel(conf);
    String[] cf=conf.split(point);
    termup.setTermLabel(cf[0]);
}

private  void setComments(String comments){
    rt.setComments(comments);
}

 private  void data2xml(){

        try {/*
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(rt.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            QName qn=new QName("XSAMS", "XSAMS");

            JAXBElement jel=new JAXBElement(qn, RadiativeType.class, rt);
            StringWriter sw = new StringWriter();
            marshaller.marshal(jel,sw);
            System.out.println(sw.toString());
    //        marshaller.marshal(jel, System.out);
  //          marshaller.marshal(rt, System.out);*/

            sw = new StringWriter();
            m.marshal( root, sw);
            //System.out.println( sw.toString());
        } catch (javax.xml.bind.JAXBException ex) {
            // TODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
}

 public String getXSAMS(){
     return sw.toString();
 }

 public void toFile(String file){
     try{
       PrintStream ps=new PrintStream(new FileOutputStream(file),true);
       ps.print(sw.toString());
     }catch(Exception e){
         System.err.println(e.toString());
     }
 }

}
