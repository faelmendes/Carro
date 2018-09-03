public class Carro{

double gasolina;
int passageiro;
double kilometragem;




public double andar(double km){
    if( this.gasolina < (km/10)){
    	return -1;
    }
    this.kilometragem +=km;
    this.gasolina -= (km/10);
    return 10;
    
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

public int embarca(int pass){
  if(pass > 2){
		return -1;
		
	}else if(this.passageiro < 2 && pass <= 2 && this.passageiro + pass < 3){
		    this.passageiro += pass;
		    return 10;

		}
			return -1;
		


	
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


}



