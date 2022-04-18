package sobrecarga1;

public class matematica {
	int somar(int x,int y) {
		//int z = x + y;
		//return z;
		return x + y;
	}
	
	int somar (int x, int y, int z) {
		return x + y + z;
	}
//doble é igual float, funciona com virgula tambem 
	double somar (double x, double y) {
		return x + y;
	}
}
