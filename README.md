# java4
# Doctor salary system

### 第四次实验
 #### 范文博 2020322103 G计202
## 1.实验内容：
- 1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。
- 2.该博士研究生有双重身份：学生和助教教师。
- 3.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
- 4.设计博士研究生类：实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
- 5.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（工资减去学费的3%为纳税金额）。
- 6.注意学费是不能为0的，不符合标准，系统需要提醒。
- 7.当研究生博士查询成绩如果出错，系统要自动报错，报出异常，提醒研究生博士。
- 8.能通过简单明了的系统就给出结果，方便博士研究生。
## 2.实验要求：
- 1.在博士研究生类中实现各个接口定义的抽象方法;
- 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
- 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
- 4。实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
- 5.根据输入情况，要在程序中做异常处理。
 ## 3.实验过程：
- 1.创建接口，并声明。
   
               public interface StudentSystem{
              	public abstract void setTuition(int Tuition);         //学生学费
	              public abstract void getTuition(int Tuition);}        //查询学生学费
- 2.创建doctor类接入接口，定义类，并实现接口。

              public class Doctor implements StudentSystem,TeacherSystem
                      { String Name;
                     	  String Sex;}
               public void setSalary(int Salary) 
                   {this.salary = Salary;}
- 3.创建测试类，利用Scanner实现运行时输入，也采用一次性赋值。

                  stu.Name = "文波";
		                stu.Sex= "男";
	                	stu.Age = 22;
                  System.out.println("请输入您的年薪：");		
                  int Salary =s.nextInt();
                  stu.setSalary(Salary);
- 4，计算纳税金额，做出程序异常处理。

                     (stu.salary - stu.Tuition)*0.03
		    try  {                      };
                    catch(Exception e) 
		 	{System.out.println("异常数据");	}
## 4.流程图： 
## 5.核心代码：

                    public void setSalary(int Salary);  //声明
                    public void setSalary(int Salary){    }；//实现
                    public class Doctor implements StudentSystem,TeacherSystem{    }；//接入
                    try{         }；   catch(Exception e) {    }；//异常处理
                    if（ ） {        }； else{     }；  //if语句
                    import java.util.Scanner;   //运行输入语句定义
                    Scanner s=new Scanner(System.in);   //运行输入语句
## 6.系统运行结果
https://github.com/fwb623/java4/blob/main/%E7%B3%BB%E7%BB%9F%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png
## 7.实验感想
               
                     
