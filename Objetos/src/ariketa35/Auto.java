package ariketa35;

/*
IZENA: Jon Salcedo
DATA: 
ARIKETA: Ariketa 32
Deskribapena:   
*/

public class Auto {
   // atrubutuak definitu
   protected String marka;
   protected String modeloa;
     
   
   //metodoak definitu
   public Auto (){
      this.marka="a";
      this.modeloa="q";
   }
   
   public Auto (String marka, String modeloa) {
      this.marka=marka;
      this.modeloa=modeloa;
   }
   
   public String getMarka (){
      return this.marka;
   }
   
   public void setMarka (String marka){
      this.marka= marka;
   }
   
   public String getModeloa (){
      return this.modeloa;
   }
   
   public void setModeloa (String modeloa){
      this.modeloa=modeloa;
   }
  
   @Override
   public String toString (){
      return "Marka "+this.marka+" modeloa "+this.modeloa;
   }
}


