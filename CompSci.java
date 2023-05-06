
public class CompSci {

	
	private static Course COMP232 = new Course("COMP232", "Mathematics for Computer Science", 3.0, true, "MATH 203, MATH 204");
	private static Course COMP248 = new Course("COMP248", "Object Oriented Programming I", 3.5, true, "MATH 203");
	private static Course COMP228 = new Course("COMP228", "System Hardware", 3.0, true, "COMP 248, MATH 203");
	private static Course COMP233 = new Course("COMP233", "Probability and Statistics for Computer Science", 3.0, true, "MATH 203");
	private static Course COMP249 = new Course("COMP249", "Object Oriented Programming II", 3.5, true, "COMP 248. MATH 203, MATH 205");
	private static Course ENCS282 = new Course("ENCS282", "Technical Writing and Communication", 3.0, true, "Students must pass the Engineering Writing Test (EWT), or pass ENCS 272 with a grade of C- or higher");
	private static Course COMP348 = new Course("COMP348", "Principles of Programming Languages", 3.0, true, "COMP 249");
	private static Course COMP352 = new Course("COMP352", "Data Structures and Algorithms", 3.0, true, "COMP 232, COMP 249");
	private static Course COMP346 = new Course("COMP346", "Operating Systems", 4.0, true, "COMP 228 or SOEN 228, COMP 352");
	private static Course COMP335 = new Course("COMP335", "Introduction to Theoretical Computer Science", 3.0, true, "COMP 232 or COMP 231, COMP 249 or COEN 244");
	private static Course COMP354 = new Course("COMP354", "Introduction to Software Engineering", 4.0, true, "COMP 352, ENCS 282");
	private static Course ENCS393 = new Course("ENCS393", "Social and Ethical Dimensions of Information and Communication Technologies", 3.0, true, "ENCS 282; 40 credits in BCompSc program");
	
	private static Course [] CourseList = {COMP232, COMP248, COMP228, COMP233, COMP249, ENCS282, COMP348, COMP352, COMP346, COMP335, COMP354, ENCS393};
	private static Course [] CompSciCore = {COMP228, COMP232, COMP233, COMP248, COMP249, COMP335, COMP346, COMP348, COMP352, COMP354};
	private static Course [] ComplementaryCore = {ENCS282, ENCS393};
	
	public static Course[] getCourseList() {
		Course [] temp = new Course [CourseList.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = CourseList[i];
		}
		return temp;
	}
	
	public static Course[] getCompSciCore() {
		Course [] temp = new Course [CompSciCore.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = CompSciCore[i];
		}
		return temp;
	}
	
	public static Course[] getComplementaryCore() {
		Course [] temp = new Course[ComplementaryCore.length];
		for (int i = 0; i < temp.length; i ++) {
			temp[i] = ComplementaryCore[i];
		}
		return temp;
	}
}
