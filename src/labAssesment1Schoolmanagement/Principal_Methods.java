package labAssesment1Schoolmanagement;


import java.util.Scanner;

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

}
