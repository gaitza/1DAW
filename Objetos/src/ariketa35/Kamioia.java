package ariketa35;

public class Kamioia extends Auto {
	   private String kargaMota;
	   private int pisuMax;
	   private int bolumena;
	   
	   public Kamioia (){
	      this.marka="";
	      this.modeloa="";
	      this.kargaMota="";
	      this.pisuMax=0;
	      this.bolumena=0;
	   }
	   
	   public Kamioia (String marka, String modeloa, String kargaMota, int pisuMax, int bolumena){
	      this.marka= marka;
	      this.modeloa=modeloa;
	      this.kargaMota=kargaMota;
	      this.pisuMax=pisuMax;
	      this.bolumena=bolumena;
	   }
	   
	   public void setKargaMota (String kargaMota){
	      this.kargaMota=kargaMota;
	   }
	   
	   public String getKargaMota (){
	      return this.kargaMota;
	   }
	   
	   public void setPisuMax (int pisuMax){
	      this.pisuMax=pisuMax;
	   }
	   public int getPisuMax (){
	      return this.pisuMax;
	   }
	   public void setBolumena (int bolumne){
	      this.bolumena=bolumena;
	   }
	   
	   public int getBolumena(){
	      return this.bolumena;
	   }
	   

	   
	}