

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Bill {
	int billNo;
	static int qty;
		public static void main(String[] args) {
		
			Tbill();
	}
		public static void Tbill() {
			int choice;
			
			int tea=1;
			int coffie=2;
			int milk=3;
			int ltea=4;
			
			int teacost=8;
			int coffiecost=10;
			int milkcost=10;
			int lteacost=10;
			
			Scanner sc=new Scanner(System.in);
			
			 System.out.println("Oder Please!!!");
			 System.out.println("1, tea");
			 System.out.println("2, coffie");
			 System.out.println("3, milk");
			 System.out.println("4, ltea");
			 
			 choice = sc.nextInt();
			 System.out.println("Choose Quantity");
			 qty=sc.nextInt();
			 System.out.println("        *********TBILL********");
			 Date d1 = new Date(); 
			 System.out.println("Time     "+ d1);
			 Random random = new Random(); 
			 int billNo=random.nextInt(10000);
			 System.out.println("BillNo: "+billNo);
			 System.out.println("-----------------------------------------");
			 System.out.println("Item            Price          Quantity");
			 System.out.println("-----------------------------------------");
			 
			
			 if(choice==1) {
				 choice=teacost;
				 System.out.println("tea             Rs "+ choice+ "\t\t"+ qty);
			 }else if(choice==2) {
				 choice=coffiecost;
				 System.out.println("coffie          Rs"+ choice+ "\t\t"+ qty);
			 }else if(choice==3) {
				 choice=milkcost;
				 System.out.println("milk            Rs"+ choice+ "\t\t"+ qty);
			 }else if(choice==4) {
				 choice=lteacost;
				 System.out.println("ltea            Rs"+ choice+ "\t\t"+ qty);
			 }else if(choice>4||choice<1) {
				 System.out.println("Try Again..");
				 choice=-1;
				 Tbill();
			 }
			 
			 System.out.println("-----------------------------------------");
			 System.out.println("Total Amount                  Rs "+ qty*choice);
			 System.out.println("-----------------------------------------");
            
			 System.out.println("Thanks Visit Again....");
		}

}
