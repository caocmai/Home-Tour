package fixtures;

public abstract class Fixture {
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	

//	@Override
//	public String toString() {
//		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
//				+ longDescription + "]";
//	}
//	
	
	
}
