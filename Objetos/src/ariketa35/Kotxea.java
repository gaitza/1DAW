package ariketa35;

public class Kotxea extends Auto {
	   private String mota;
	   private int bidaiariKop;
	   private int segurMaila;
	   
	   public Kotxea (){
	      this.marka="marka gabe";
	      this.modeloa="";
	      this.mota="";
	      this.bidaiariKop=0;
	      this.segurMaila=0;   
	   }
	   
	   public Kotxea (String marka, String modeloa, String mota, int bidaiariKop, int segurMaila){
	      this.marka=marka;
	      this.modeloa=modeloa;
	      this.mota=mota;
	      this.bidaiariKop=bidaiariKop;
	      this.segurMaila=segurMaila;
	   }
	   
	   public void setMota (String mota){
	      this.mota=mota;
	   }
	   
	   public String getMota (){
	      return this.mota;
	   }
	   
	   public void setBidaiariKop (int bidaiariKop){
	      this.bidaiariKop=bidaiariKop;
	   }
	   
	   public int getBidaiariKop (){
	      return this.bidaiariKop;
	   }
	   
	   public void setSegurMaila (int segurMaila){
	      this.segurMaila=segurMaila;
	   }
	   public int getSegurMaila(){
	      return this.segurMaila;
	   }
	   
	   @Override
	   public String toString (){
	     return "Marka "+this.marka+" modeloa "+this.modeloa+" mota "+this.mota+" bidaiari kopurua "+ this.bidaiariKop+" segurtasun maila "+this.segurMaila;
	   }
	   
	}
