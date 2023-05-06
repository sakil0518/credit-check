
public class Course {

	private String code_course;
	private String title_course;
	private double credit;
	private boolean prerequisite;
	private String title_prerequisite;
	
	public Course() {
		code_course = "unknown";
		title_course = "unknown";
		credit = 0.0;
		prerequisite = false;
		title_prerequisite = "";
	}
	
	public Course(String cc, String tc, double c, boolean p, String tp) {
		code_course = cc;
		title_course = tc;
		credit = c;
		prerequisite = p;
		title_prerequisite = tp;
	}
	
	public String getCodeC() {
		return code_course;
	}
	
	public String getTitleC(){
		return title_course;
	}
	
	public double getCredit() {
		return credit;
	}
	
	public boolean getPreB() {
		return prerequisite;
	}
	
	public String getTitleP() {
		return title_prerequisite;
	}
	
	public void setCodeC(String cc) {
		code_course = cc;
	}
	
	public void setTitleC(String tc) {
		title_course = tc;
	}
	
	public void setCredit(double c) {
		credit = c;
	}
	
	public void setPreB(boolean p) {
		prerequisite = p;
	}
	
	public void setTitleP(String tp) {
		title_prerequisite = tp;
	}
	
	public String toString() {
		return "Course: "+code_course+"\n\tTitle: "+title_course+"\n\tCredit: "+credit;
	}
	
	public String infoPre(Course c) {
		String result;
		if(c.prerequisite)
			result = "Prerequisite information of this class: \n\t"+title_prerequisite;
		else 
			result = "This course does not have prerequisite.";
		return result;
		
	}

}
