package system;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor stu=new Doctor();
		Doctor stu2=new Doctor();
		
		stu.Name = "�Ĳ�";
		stu.Sex= "��";
		stu.Age = 22;
		System.out.println("ѧ��������"+stu.Name);
		System.out.println(" �Ա�"+stu.Sex);
		System.out.println(" ���䣺"+stu.Age+"��");
		System.out.println("----------------------");
		Scanner s=new Scanner(System.in);



		try {
			System.out.println("������������н��");		
			int Salary =s.nextInt();
			stu.setSalary(Salary);
			System.out.println("����������ѧ�ѣ�");
			int Tuition =s.nextInt();
			stu.setTuition(Tuition);
			
				System.out.println("�����н" + stu.salary + "     ��ȥѧ��" + stu.Tuition + "      ����" + (stu.salary - stu.Tuition));
				System.out.println("������˰���Ϊ��"+stu.salary*0.03);
		}
			catch(Exception e) {
				System.out.println("�쳣����");
				
			}
		System.out.println("-------------------------------------------");
		stu2.Name = "֮��";
		stu2.Sex= "Ů";
		stu2.Age = 22;
		System.out.println("ѧ��������"+stu2.Name);
		System.out.println(" �Ա�"+stu2.Sex);
		System.out.println(" ���䣺"+stu2.Age+"��");
		System.out.println("----------------------");



		try {
			System.out.println("������������н��");		
			int Salary =s.nextInt();
			stu2.setSalary(Salary);
			System.out.println("����������ѧ�ѣ�");
			int Tuition =s.nextInt();
			stu2.setTuition(Tuition);
			if(Tuition>0) {
				System.out.println("�����н" + stu2.salary + "     ��ȥѧ��" + stu2.Tuition + "      ����" + (stu2.salary - stu2.Tuition));
				System.out.println("������˰���Ϊ��"+stu2.salary*0.03);
				
			}else {System.out.println("��ã������쳣��ѧ�Ѳ��ܵ���0,��������дѧ�ѽ��");}
			
				
		}
			catch(Exception e) {
				System.out.println("�쳣����");
				
			}
		
		}
	}

