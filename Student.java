package Demo;

public class Student {
	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//和别人的对比检查一下有没有错误
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj instanceof Student){
			Student stu=(Student) obj;
			if(id.equals(stu.getId())){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
