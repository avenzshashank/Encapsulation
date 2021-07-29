import java.util.Scanner;

public class Studentrec {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StuBean st = new StuBean();
		
		System.out.println("Enter Student Id :");
		int x = sc.nextInt();
		st.setStuID(x);
		sc.nextLine();
		
		//Name
		System.out.println("Enter Student's Name :");
		st.setStuName(sc.nextLine());
		
		//Roll No.
		System.out.println("Enter Roll No.");
		st.setStuRollNo(sc.nextInt());
		sc.nextLine();
		
		//School Name
		System.out.println("Enter School Name :");
		st.setSchoolName(sc.nextLine());
		
		// Marks
		
		System.out.println("Enter Hindi Marks :");
		st.setHindiMarks(sc.nextInt());
		
		System.out.println("Enter English Marks :");
		st.setEnglishMarks(sc.nextInt());
		
		System.out.println("Enter Mathematics Marks :");
		st.setMathematicsMarks(sc.nextInt());
		
		System.out.println("Enter Science Marks :");
		st.setScienceMarks(sc.nextInt());
		
		System.out.println("Enter Computer Marks :");
		st.setComputerMarks(sc.nextInt());
		
		

		System.out.println("\n***** Student Details ***** \n");
		
		System.out.println("Stu ID :" +st.getStuID());
		System.out.println("Stu Name :" +st.getStuName());
		System.out.println("Stu Roll No. :" +st.getStuRollNo());
		System.out.println("School Name :" +st.getSchoolName());
		System.out.println("Hindi Marks :" +st.getHindiMarks());
		System.out.println("English Marks :" +st.getEnglishMarks());
		System.out.println("Mathematics Marks :" +st.getMathematicsMarks());
		System.out.println("Science Marks :" +st.getScienceMarks());
		System.out.println("Computer Marks :" +st.getComputerMarks());
		System.out.println("Total Marks :" +st.TotalMarks());
		System.out.println("Percentage :" +st.Percentage());
		System.out.println("You got"+st.getDivision());
	}

}
