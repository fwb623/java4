package system;


	public class Doctor implements StudentSystem,TeacherSystem{
	String Name;
	String Sex;
	 int Age;
	 int Tuition;
	 int salary;
	
	
	String getName()
	{ return Name; }
	public void setName(String Name)
	{this.Name = Name; }
	String getSex()
	{ return Sex; }
	public void setSex(String Sex)
	{this.Sex = Sex; }
	int getAge()
	{ return Age; }
	public void setAge(int Age)
	{this.Age = Age; }

	@Override
	public void setSalary(int Salary) {
		// TODO Auto-generated method stub
		this.salary = Salary;
		System.out.println("����������ǣ�"+this.salary);
		
	}
	@Override
	public void getSalary(int Salary) {
		// TODO Auto-generated method stub
		this.salary = Salary;
		System.out.println("�Ѳ�ѯ������������ǣ�"+this.salary);
	}
	@Override

	public void setTuition(int Tuition) {
		// TODO Auto-generated method stub
		this.Tuition = Tuition;
		System.out.println("���ѧ���ǣ�"+this.Tuition);
	}
	@Override
	public void getTuition(int Tuition) {
		// TODO Auto-generated method stub
		this.Tuition = Tuition;
		System.out.println("�Ѳ�ѯ�����ѧ���ǣ�"+this.Tuition);
	}
	}


