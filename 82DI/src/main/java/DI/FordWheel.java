package DI;

public class FordWheel {

	private int id;
	private String nameOfTheWheel;

	public FordWheel(int id, String nameOfTheWheel) {
		this.id = id;
		this.nameOfTheWheel = nameOfTheWheel;
	}

	public FordWheel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int idd) {
		id = idd;
	}

	public String getNameOfTheWheel() {
		return nameOfTheWheel;
	}

	public void setNameOfTheWheel(String nameOfTheWheel) {
		this.nameOfTheWheel = nameOfTheWheel;
	}

	@Override
	public String toString() {
		return "FordWheel [id=" + id + ", nameOfTheWheel=" + nameOfTheWheel + "]";
	}

}
