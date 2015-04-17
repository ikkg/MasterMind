/**
 * 
 */
package mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author flipas
 *
 */
class MasterMind {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String numStr,numAd,aux,jugar;
		int num,numDig,cont;
		boolean control;
		jugar = "empezar";
		
		while(jugar=="empezar"){
			try{
				
				System.out.println("Dime el numero de digitos:");
				numDig = Integer.parseInt(b.readLine());
				
				num = (int) (Math.random()*(Math.pow(10, numDig)));
				numStr = String.valueOf(num);
				
				control = false;
				
				if (numStr.length()<numDig){
					
					aux="";
					
					for(int i = 0;i<(numDig-numStr.length());i++){
						
						aux = aux.concat("0");
						System.out.println(aux);
			
						
					}
					
					aux = aux.concat(numStr);
					numStr = aux;
					
				}
				while(control==false){
					
					System.out.println("Dime que numero crees que es:");
					numAd = b.readLine();
					
					if(numAd.length()!=numDig){
						
						System.out.println("La cantidad de digitos era otra.");
						
					}
					else{
						if(Integer.parseInt(numAd)==Integer.parseInt(numStr)){
							
							System.out.println("Felicidades has adivinado el numero.");
							System.out.println("El numero es "+numStr);
							System.out.println("");
							System.out.println("Escribe empezar si quieres volver a jugar.");
							jugar = b.readLine();
							control=true;
						}
						else{
							
							cont = 0;
							for(int i = 0;i<numDig;i++){
								
								if(numAd.charAt(i)==numStr.charAt(i)){
									
									cont++;
									
								}
								
							}
							
							System.out.println("Con "+numAd+" has adivinado "+cont+" valores.");
							System.out.println("Intentalo de nuevo.");
							
						}
						
					}
					
				}
				
			}
			catch(Exception e){
				
				e.printStackTrace();
				
			}
	
		}
	}

}
