package javaexam;

public class Ex_twodimarray {

	public static void main(String[] args) {
		//declare two dim array/
		int[][]num=new int[2][2]; //2row 2column//
        num[0][0]=1;
        num[0][1]=2;
        num[1][0]=3;
        num[1][1]=4;
        //print array need two loop//
        
        System.out.println(num.length);
        for(int i=0;i<num.length;i++){
        for(int j=0;j<num.length;j++){
        System.out.print("" +num[i][j]);
        }
        System.out.println();
        }
        }
	}
