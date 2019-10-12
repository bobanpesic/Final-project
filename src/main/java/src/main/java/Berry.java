package src.main.java;

public class Berry {

	String name;
	int size;
	int growthTime;

	public Berry(String name, int size, int growthTime) {
		super();
		this.name = name;
		this.size = size;
		this.growthTime = growthTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getGrowthTime() {
		return growthTime;
	}

	public void setGrowthTime(int growthTime) {
		this.growthTime = growthTime;
	}

}
