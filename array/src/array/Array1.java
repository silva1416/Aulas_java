package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int x1 = 3;
//			int y1 = 5;
//			int z1 = 7;
//			
//			System.out.println(x1);
//			System.out.println(y1);
//			System.out.println(z1);
//			System.out.println();
//			
//			double x[] = {3, 5, 3, 5};
//			
//			for (int aux = 0; aux <x.length; aux++) {//aux comeca em zero,aux for menor que o tamanho que esta em length(tamanho) então adciona
//			}
//				String aux;
//				System.out.println("Valor do índice" + aux + "=" + x[aux]);//mostra
//			}
//			System.out.println();
//			
//			String nome[] = {"Luana", "Esmeralda", "Aurora"}
//			
//			for (int aux1 = 0; aux1 < nome.length; aux1++) {//para varrera ate achar o valo de esmeralda
//				System.out.println(nome[aux1]);
//				if (nome[aux1] == "Esmeralda") {
//					System.out.println("O índice de Esmeralda é = " + aux1);//mostra
//					
//			Object[] arrayOBJECT = new Object[4];
//			
//			arrayObject[0] = 12;
//			arrayObject[1] = "Rafael";
//			arrayObject[2] = 13.8;
//			arrayObject[3] = true;
//			arrayObject[4] =  arrayInt;
//			
//			for (int aux2 = 0; aux 2 < arrayObject.length; aux2++) {
//				System.out.println("Indicie " + aux2 + "=" + arrayObject[aux2]);
//			}
			int[][] arrayBidirecional = new int [3][3];//3 colunas e 3 linhas
			
			arrayBidirecional[0][0] = 8;//preenchendo o 0,0
			arrayBidirecional[2][1]= 8;//preenchendo 2,1
			
			for (int linha = 0; linha< arrayBidirecional.length; linha++) {//um for para linha
				for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {//um for para coluna
					System.out.print("Indicie [" + linha + "][" + coluna + "] = " +//print para fazer coluna
				arrayBidirecional[linha][coluna] + "");
					
					
				}
				System.out.println();
			}
				}
			}

