import java.util.Scanner;
public class Principal{
public static Scanner sc = new Scanner(System.in);
public static void main(String args[]){
Carro ferrari = new Carro();
ferrari.gasolina = 0;
ferrari.kilometragem= 0;
ferrari.passageiro= 0;
String comando;
String help = "\t============= help =====================\n"+
					  "\tdrive _numero :dirigir kilometros\n"+
					  "\tfuel _numero :abastece gasolina\n"+
					  "\tin _numero :embarcar pessageiro\n"+
					  "\tout  _numero :desembarcar pessageiro\n"+
					  "\tshow: pessageiro_gasolina_kilometragem\n"+
					  "\tend: sai do programa\n"+
					  "\t========================================\n";

while(true){

System.out.print("Digite um comando (help para ver os comandos) ");
comando = sc.nextLine();

         if(comando.equals("help")){
				System.out.println(help);
				
			 
        }else if(comando.equals("end")){
				System.out.println("  guardando carro na garagem Até a próxima :)");
				break;
			}else{ 
		 

        String c[] = comando.split(" ");
        // comando = "soma 5 235"
		// c = ["soma", "5", "235"];
        double p;
        int pass;
        switch(c[0]){
					case "fuel":

						        p = Double.parseDouble(c[1]);
						        System.out.println(ferrari.abastece(p));
						        
						     
						break;
					case "drive":
					           if(ferrari.passageiro != 0){
		                         p = Double.parseDouble(c[1]);
					           
								if(ferrari.andar(p) == -1){
									System.out.println("  fail: gasolina insuficiente ");
									
								}else{
									System.out.println("  success ");
								}
							
                               }else{
                               	  System.out.println("  fail: nao ha ninguem no carro ");
                               }
						break;
					case "out":
					            pass = Integer.parseInt(c[1]);
					            System.out.println(ferrari.desembarca(pass));

						
						break;
					case "in":
                             
		                      pass = Integer.parseInt(c[1]);
		                     if(ferrari.embarca(pass) == -1){
                                  System.out.println("  fail: o carro so comporta 2 passageiro ");

		                     }else{
		                     	  System.out.println("  success ");
		                     }
						
						break;
					case "show":
                            System.out.println("  pass: "+ferrari.passageiro+" gas: "+ferrari.gasolina+" km: "+ferrari.kilometragem);
						
						break;
					default:
						
						System.out.println("  Comando inválido.");

					}
				}


}


















}
}



	    