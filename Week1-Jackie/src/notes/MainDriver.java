package notes;

public class MainDriver {

	public static void main(String[] args) {
		try{
			ExceptionThrower("String");
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}finally {}
		

	}
	
	public static void ExceptionThrower(String word) throws CustomException{
		int length = word.length();
		for(int i = 0; i < length; i++) {
			String str = word.charAt(i) + "";
			String str2 = str.toLowerCase();
			if(str2.equals("s")) {
				throw new CustomException("Do not use an S. Looks like a snake.");
			}
			else {
				System.out.println("No S here.");
			}
			
		}
	}

}
