public class Project {
	private String name;
	private String desc;
	public Project() {}
	public Project(String name) {
		this.name = name;
	}
	public Project(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String elevatorPitch() {
		return String.format("%s : %s", this.name, this.desc);
	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class ProjectTest {
	public static void main(String[] args) {
		Project one = new Project();
		one.setName("Farm");
		System.out.println(one.getName());
		Project two = new Project("Wood Shop");
		two.setDesc("We make cuboards");
		System.out.println(two.getDesc());
		Project three = new Project("Vegetable store", "To sell vegetables!");
		System.out.println(three.elevatorPitch());

	}
}