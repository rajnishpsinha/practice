package core_java;

public class Me extends Player {
byte height;
	
	Me(int i, String str, byte b) {
		super(i, str);
		this.height =b;
		// TODO Auto-generated constructor stub
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Me rajnish = new Me(39, "Miku",(byte)6);
System.out.println(rajnish.gamePlays());

	}

	@Override
	String gamePlays() {
		// TODO Auto-generated method stub
		return "football";
	}

	

}
