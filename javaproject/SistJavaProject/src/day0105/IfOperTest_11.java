package day0105;

public class IfOperTest_11 {

	public static void main(String[] args) {

		int score=70;
		char grade;


		/*if(score>=90)
		grade="A";
	else if(score>=80)
		grade="B";
	else if(score>=70)
		grade="C";
	else if(score>=60)
		grade="D";
	else
		grade="F";*/

		//삼항연산자
		/*grade=score>=90?"A":
		score>=80?"B":
		score>=70?"C":
		score>=60?"D":"F";*/

		//switch
		switch(score/10)
		{
		case 10:case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;	
		case 7:
			grade='C';
			break;	
		case 6:
			grade='D';
			break;
		case 5:
			grade='F';
			break;	
		default:
			grade='F';
			break;

		}

		System.out.println("학점은"+grade+"입니다.");


	}

}
