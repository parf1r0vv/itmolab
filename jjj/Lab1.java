import static java.lang.Math.*;

public class Lab1{
	public static double calc_arr(long bi, double xj){
		switch(bi){
			case 20L: 
				return exp(pow(pow(xj/0.5, 3.0)/3.0/4.0, log(abs(xj))));
			case 8L, 10L, 16L, 18L: 
				return atan(1.0/(exp(sqrt(pow(cos(xj), 2.0)))));
			default:
				return atan(pow(exp(cbrt(-abs(xj)*(abs(xj)+1))),2.0));
		}
	}
	
	public static void disp(double[][] a){
		for(double[] i: a){
			for(double j: i){
				System.out.printf("%.3f ", j);
			}
			System.out.println();
		}
	}
	
    public static void main(String[] args){
		long[] b = new long[8];
		for(int i=0; i<8; i++){
			b[i] = 20-i*2;
		}
		System.out.print("b = ");
		for(int i=0; i<8; i++){
			System.out.print(b[i] + " ");
		}       
		System.out.println();

		double[] x = new double[13];
		for(int i=0; i<13; i++){
			x[i] = random() * 16 - 14;
		}    
		System.out.print("x = ");
		for(int i=0; i<13; i++){
			System.out.printf("%.3f ", x[i]);
		}
		System.out.print("\n\n");
		
		double[][] c = new double[8][13];
		for(int i=0; i<8; i++){
			for(int j=0; j<13; j++){
				c[i][j] = calc_arr(b[i], x[j]);
			}
		}
		
		disp(c);
    }
}