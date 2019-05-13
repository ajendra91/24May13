package DI;
public class MarutiWheel {

	private int id;
	private String nameOfTheWheel;

	public MarutiWheel(int id, String nameOfTheWheel) {
		this.id = id;
		this.nameOfTheWheel = nameOfTheWheel;
	}

	public MarutiWheel() {
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
		return "MarutiWheel [id=" + id + ", nameOfTheWheel=" + nameOfTheWheel + "]";
	}

}
