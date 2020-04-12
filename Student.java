class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints;


	//TODO constructor

	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}


	//TODO seters & getters


	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		int average=0;
		for(int poeni: labPoints)
		{
			average+=poeni;
		}
		return (double) average/labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		if (labPoints.size()>8)
		{
			return true;
		}
		else
			return false;
	}
}

class Course {
	private List<Student> students;

	public Course()
	{
		students = new ArrayList<>();
	}

	public void addStudent(String index, String firstName, String lastName, ArrayList<Integer> labPoints)
	{
		Student student = new Student(index, firstName, lastName, labPoints);
		students.add(student);
	}

	public void addStudent(Student student)
	{
		students.add(student);
	}

	public void removeStudent(Student student)
	{
		students.remove(student);
	}

	
}