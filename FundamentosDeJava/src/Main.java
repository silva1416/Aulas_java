
public class Main {

	public static void main(String[] args) {
		
//Explicando o que � casting		
//		int x = 100;
//		double y = 200.3;
//		int a = 0;
//		double b = 0;
//		short z = (short) 10000;
//
//	//casting explicito,assume a responsabilidade de perda de conteudo como neste caso(s� descomentar para ver)
//	      a = y;
//	//converteu o y para int e s� depois guardou em a.Perdendo o conteudo ap�s a virgula
//	       a = (int) y;
//	// casting implicito, deixa converter a informa��o, no caso de querer colocar informa��o aonde cabe
//		b = x;
//	
//		System.out.println(a);
//		System.out.println(b);
//	    System.out.println(z);
//		
////pula linha 
//		System.out.println("");
//		

//Ex de IF E ELSE
		
//		a = (int)y;
//		b = x;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		int IdadePessoa = 70;
//		
//		if (IdadePessoa < 18 ) {
//			System.out.println("Voc� n�o pode beber!");
//		}
//		else if(IdadePessoa < 60) {
//			System.out.println("Bora Tomar Uma");
//		}else{
//			System.out.println("Volta pro asilo");
//		}
//		//Vai aparecer em qualquer dos casos
//		System.out.println("Voc� tem " + IdadePessoa + " Anos");
		
		

//Explicando Switch case- Escolha caso
//		int num = 3;
//		
//   	   switch (num) {
//	    // caso o num seja igual a 1 entao fa�a o que � declarado abaixo
//		  case 1:
//			  System.out.println("Seu numero � 1 ");
//		      break ;
//		  case 2:
//			  System.out.println("Seu numero � 2 ");
//		      break ;
//		  case 3:
//			  System.out.println("Seu numero � 3");
//		      break ;
//		 case 4:
//			  System.out.println("Seu numero � 4");
//		      break ;
//		  case 5:
//			 System.out.println("Seu numero � 5");
//			  // Termina o caso igual ao fimcaso entao tem que colocar um para cada caso
//		       break ;
//   	   }
	
	
//Ex 2
//		int num = 8;
//		
//	   	  switch (num) {
//		    // caso o num seja igual a 1 entao fa�a o que � declarado abaixo
//			 case 1:
//				  System.out.println("Domingo ");
//			     break ;
//			 case 2:
//				 System.out.println("Segunda ");
//			     break ;
//			 case 3:
//				 System.out.println("Ter�a");
//			     break ;
//			 case 4:
//				 System.out.println("Quarta");
//			     break ;
//			 case 5:
//				 System.out.println("Quinta");
//				 break;
//			 case 6:
//				 System.out.println("Sexta");
//				 break;
//			 case 7:
//				 System.out.println("Sabado");
//				   //Termina o caso igual ao fimcaso entao tem que colocar um para cada caso
//			     break ;
//			   //Se Nenhum dos casos forem encontrados
//			 default:
//			    	System.out.println("Esse n�mero n�o representa um dia da semana");
//			}
		
		
//Ex com caractere
//		char caractere = 'z';
//		
//		switch(caractere) {
//		 case 'a':
//			 System.out.println("Seu caractere � a");
//			 break;
//		 case 'b':
//			 System.out.println("Seu caractere � b");
//			 break;
//		default:
//			System.out.println("Valor inv�lido");
//		}
		
//Ex farol
//		String Farol = "vermelho";
//		System.out.println(Farol);
//		
//		switch (Farol) {
//		case "verde":
//			System.out.println("Siga!");
//			break;
//		case "amarelo":
//			System.out.println("Aten��o!");
//			break;
//		case "vermelho":
//			System.out.println("Pare!");
//			break;
//	    default:
//	    	System.out.println("Valor inv�lido");
//		}
	
//while-Enquanto-Repete-quantidade de vezes n�o fixa
		
//		int x = 0;
//		//teste condicional= toda resposta de um teste condicional � verdadeiro ou falso
//		//enquanto for
//		while(x<10) {
//			//Vai motrar Tudo que � menor que X, no caso tudo que � menor que 10
//			System.out.println(x);
//			x = x + 1;
//		}
//		
//// do while se for verdadeiro ele repete o while de cima, sen�o ele termina
//		x = 0;
//		do {
//			System.out.println(x);
//			x=x+1;
//		}while(x<10);
//		System.out.println("Teste: " + x);
		
//For- Para-quantidade de vezes fixa
		//Se uma variavel for criada dentro dp for ela so vai existir dentro do for, como no exemplo
		//1-Cria��o da variavel, 2- valor que ela vai come�ar, 3-(x++)pega o valor adc 1 e guarda nele mesmo agora se eu quiser adc 2 ou qualquer outra quantidade coloco x+=2
		//pra multiplicar x*=2
		//menos � x--
//		for(int x = 0; x<10; x++) {
//			System.out.println(x);
//		}
		
//tabuada 
		for (int x=0; x<=10; x++) {
			System.out.println("2x" + x + "=" + x*2);
			
		}
		
	
		
	
	
	}
	
	
	}





