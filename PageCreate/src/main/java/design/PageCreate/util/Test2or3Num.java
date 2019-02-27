package design.PageCreate.util;

public class Test2or3Num {

	public static void main(String[] args) {
		for (int i = 700; i < 1300; i++) {
			int flag2 = 0;
			int flag3 = 0;
			int temp = i;
			while(temp % 2 == 0){
				temp = temp/2;
				flag2++;
			}
			while(temp % 3 == 0){
				temp = temp/3;
				flag3++;
			}
			
			if(flag2 > 2 && flag3 > 1){
				double sum = 0;
				double incrNum2 = 0.8;
				double incrNum3 = 0.5;
				for (int j = 0; j < flag2 - 1; j++) {
					sum = sum + 1 * Math.pow(incrNum2, j);
				}
				for (int j = 0; j < flag3 - 1; j++) {
					sum = sum + 1 * Math.pow(incrNum3, j);
				}
				System.out.println(i + "\t" + flag2 + "\t" + flag3 + "\t" + sum);
			}
		}
	}

}
