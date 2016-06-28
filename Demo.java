package Demo;

public class Demo {
	public static void main(String[] args) {
		Grade grade=new Grade();
		Student s1=new Student("11","a",11);
		Student s2=new Student("22","a",11);
		Student s3=new Student("11","a",11);
		try{
			grade.add(s1);
			grade.add(s2);
			grade.add(s3);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(grade.showInfo());
	}
}
