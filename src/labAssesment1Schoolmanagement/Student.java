package labAssesment1Schoolmanagement;


import java.util.Objects;
import java.util.Scanner;

    public class Student {
        private String name;
        private String rollNo;
        private String fatherName;

        public class Principal_Methods {
            public Class[] classes;
            Principal_Methods()
            {
                classes = new Class[10];
                int x = 1;
                for (int i = 0 ; i < classes.length ; i++ )
                {
                    classes[i] = new Class(x);
                    x++;

                }
            }
            public void add()
            {
                System.out.println("IN WHICH CLASS DO YOU WANT TO ADD STUDENT : ");
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                for (int i = 0 ; i < classes.length; i++)
                {
                    if(classes[i].getGrade() == x)
                    {
                        classes[i].addStudent();
                    }
                }
            }
            public void view()
            {
                System.out.println("WHICH CLASS DO U WANT TO VIEW : ");
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                for (int i = 0 ; i < classes.length; i++)
                {
                    if(classes[i].getGrade() == x)
                    {
                        classes[i].show();
                    }
                }

            }



        }

        private int grade;
        private String iD;


        public String getiD() {
            return iD;
        }

        public void setiD(String iD) {
            this.iD = iD;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
        public void view(String i){
            if(Objects.equals(i,iD))
            {
                System.out.println("Name : "+name);
                System.out.println("Fathers name : "+fatherName);
                System.out.println("ROLL NUMBER : "+rollNo);
                System.out.println("Grade : "+grade);
                System.out.println("ID : "+iD);
            }
            else
            {
                System.out.println("Student of this ID doesnt exist!!!");
            }
        }

    }


