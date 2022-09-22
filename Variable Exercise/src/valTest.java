
public class valTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		int getUni = (int)ch;
		
		System.out.println(getUni);		//char값 Uni코드로 출력
		
		ch = 'a';
		getUni = (int)ch;
		System.out.println(getUni);
		
		char tab = '\t';
		System.out.println(tab + "" + getUni);	//특수문자 출력
		
		String tabString = "\t";
		System.out.println(tabString + getUni);
		System.out.println("\t\\t\"1234\b\b5678");
		
		System.out.println("abc\t123\b456");	//3이 안지워짐.. 왜?
	}

}
