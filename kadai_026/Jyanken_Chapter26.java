package kadai_026;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String input1;
	public String input2;
	
	Jyanken_Chapter26(){	
		System.out.println("コンストラクタ");
	}
	
	public String getMyChoice() {
	Scanner scanner=new Scanner(System.in);
	
	 this.input1 =scanner.next();
	 scanner.close();
	 return this.input1;
	 

	}	
	
	public String getRandom() {
		
		switch((int)Math.ceil(Math.random()*3) ){
		case 1: this.input2="r";
		case 2: this.input2="s";
		case 3: this.input2="p";
		
		default : break;
		}
		return this.input2;
	}

	public void playGame() {
		if(this.input1==this.input2) {
			System.out.println("あいこです");
			
		}
		else if((this.input1=="r"&&this.input2=="s")||(this.input1=="s"&&this.input2=="p") ||(this.input1=="p"&&this.input2=="r")) {
			System.out.println("勝ちです");
			
		}
		else if((this.input1=="r"&&this.input2=="p")||(this.input1=="s"&&this.input2=="r") ||(this.input1=="p"&&this.input2=="s")) {
			System.out.println("負けです");
			
		}
		
		
	}
	

}
