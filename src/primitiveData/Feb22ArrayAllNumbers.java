package primitiveData;

public class Feb22ArrayAllNumbers {

	public static void main(String[] args) {
        int a[] = {20,30,50,10};
        System.out.println(a[2]);
        int i;
        for(i=0;i<=3;i++){ 
        System.out.println(a[i] + ",");
        }
        
        int x[]= {2,3,8,9,5,7,6};
        for(int j=0;j<6;j++) {
        	if(x[j] == 8) {
        		System.out.println("index of 2 value is "  + x[j]);
        	}
        }
       
	}

}
