package labAssesment1Schoolmanagement;



import java.util.Scanner;

    public class Class {
        private Student[] students;
        private int grade;

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        Class(int grade)
        {
            this.grade = grade;
            students = new Student[15];
            for(int i = 0 ; i < students.length ; i++ )
            {
                students[i] = new Student();
            }
        }

        public void show() {
            for (int i = 0; i < students.length; i++)
            {
                if (students[i].getiD() != null)
                {
                    students[i].view(students[i].getiD());
                }
            }

        }
        public void addStudent ()
        {
            System.out.println("Enter details : ");
            System.out.println("Name : ");
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            System.out.println("Father name");
            String f = sc.nextLine();
            System.out.println("ID : ");
            String q = sc.nextLine();
            System.out.println("Roll Number : ");
            String r = sc.nextLine();
            System.out.println("Grade : ");
            int g = sc.nextInt();
            for (int i = 0; i < students.length; i++) {
                if (students[i].getiD() == null)
                {
                    students[i].setName(n);
                    students[i].setFatherName(f);
                    students[i].setiD(q);
                    students[i].setGrade(g);
                    students[i].setRollNo(r);
                    break;
                }
            }

        }
    }



