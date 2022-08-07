class naveen_Family{
	public void name() {
		System.out.println("Family Name is Gittapata");
		
	}
}


class Srinivas_Family extends naveen_Family {
	
}

public class Polymorphism {

	public static void main(String[] args) {
		Srinivas_Family b = new Srinivas_Family();
		b.name();

	}

}
