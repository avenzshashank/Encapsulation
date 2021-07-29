

public class StuBean {
	
	private int  stuID;
	private String stuName;
	private int stuRollNo ;
	private String schoolName;
	
	private double hindiMarks;
	private double englishMarks;
	private double mathematicsMarks;
	private double scienceMarks;
	private double computerMarks;
	private double totalMarks;
	private double percentage;
	private String division;
	

	public int getStuID() {
		return stuID;
	}


	public void setStuID(int stuID) {
		this.stuID = stuID;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public int getStuRollNo() {
		return stuRollNo;
	}


	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public double getHindiMarks() {
		return hindiMarks;
	}


	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}


	public double getEnglishMarks() {
		return englishMarks;
	}


	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}


	public double getMathematicsMarks() {
		return mathematicsMarks;
	}


	public void setMathematicsMarks(int mathematicsMarks) {
		this.mathematicsMarks = mathematicsMarks;
	}


	public double getScienceMarks() {
		return scienceMarks;
	}


	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}


	public double getComputerMarks() {
		return computerMarks;
	}


	public void setComputerMarks(int computerMarks) {
		this.computerMarks = computerMarks;
	}

	public double TotalMarks() {
		return this.totalMarks = (hindiMarks + englishMarks + mathematicsMarks + scienceMarks + computerMarks);
	}


	


	public double Percentage() {
		return TotalMarks()/5;
	}


	public String getDivision() {
		
		String s = " ";
		if(Percentage() >= 60)
			s = "! You Are First Division.....";
			else if(Percentage() >= 40 && Percentage() < 60)
				s = "! You Are Second Division.....";
			else if(Percentage() >= 30 && Percentage() < 40)
				s = "! You Are Second Divison.....";
			else
			s = "! Oops You Are Fail..... * Better Next Time..";
			return s;
	}


	public String Division(String division) {
		return this.division = division;
	}


	@Override
	public String toString() {
		return "StuBean [stuID=" + stuID + ", stuName=" + stuName + ", stuRollNo=" + stuRollNo + ", schoolName="
				+ schoolName + ", hindiMarks=" + hindiMarks + ", englishMarks=" + englishMarks + ", mathematicsMarks="
				+ mathematicsMarks + ", scienceMarks=" + scienceMarks + ", computerMarks=" + computerMarks
				+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", division=" + division + "]";
	}
	
	

}
