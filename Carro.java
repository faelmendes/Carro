public class Carro{

double gasolina;
int passageiro;
double kilometragem;




public String andar(double km){
	 if(this.passageiro != 0){
		 if( this.gasolina < (km/10)){
    	return "  fail: gasolina insuficiente para a viagem";
    }else{
    this.kilometragem +=km;
    this.gasolina -= (km/10);
    return 	"  success";
    }			           	
		                      
  }else{
        return "  fail: nao ha ninguem no carro ";
              }
   
    
}

public String abastece(double gas){
	if(this.gasolina == 10){
		return "  tanque cheio";
	
	}else if(gas > 10){
		this.gasolina = 10;
		return "  success ";
	}else if(this.gasolina + gas > 10 ){
		this.gasolina = 10;
		return "  success ";
	}else {
	 this.gasolina +=gas;
	 return "  success ";
     }
   
}

public String embarca(int pass){
  if(pass > 2){
		return  "  fail: o carro so comporta 2 passageiro ";
		
	}else if(this.passageiro < 2 && pass <= 2 && this.passageiro + pass < 3){
		    this.passageiro += pass;
		    return "  success";

		}
			return "  fail: o carro so comporta 2 passageiro ";
		


	
	}
     
    

public String desembarca(int pass){
	if(this.passageiro == 0){
       return "  fail: nao ha ninguem no carro";
	}else if(this.passageiro - pass < 0 ){
		return "  fail: nao a esse numero de passageiro no carro ";

	}else{
	  this.passageiro-= pass;
	  return "  success ";

	
       }
	


      }

 public void show(){

 	System.out.println("  pass: "+this.passageiro+" gas: "+this.gasolina+" km: "+this.kilometragem);
 }


}



