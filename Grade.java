package Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Grade {
	
	private List<Student> list=new LinkedList<Student>();
	
	public void add(Student stu) throws Exception{
		Iterator<Student> it=list.iterator();
		while(it.hasNext()){
			it.next().equals(stu);
			throw new Exception("学号重复");
		}
		list.add(stu);
		
	}
	public StringBuffer showInfo(){
		StringBuffer sb=new StringBuffer();
		Iterator<Student> it=list.iterator();
		while(it.hasNext()){
			sb.append(it.next());
			sb.append("\r\n");
		}
		return sb;
	}
}
