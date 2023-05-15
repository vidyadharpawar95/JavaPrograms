package Practice_java;

public class Encapulation_pro {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Encapulation_pro st= new Encapulation_pro();
		st.setName("Vidya");
		System.out.println(st.getName());
	}

}
