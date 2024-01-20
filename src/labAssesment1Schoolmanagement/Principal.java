package labAssesment1Schoolmanagement;


import java.util.Objects;
import java.util.Scanner;

    public class Principal {
        private final String username = "Principal";
        private final String password = "123";


        public boolean signIN()
        {
            System.out.println("Enter your Username : ");
            Scanner sc = new Scanner(System.in);
            String u = sc.nextLine();
            System.out.println("Enter Password : ");
            String p = sc.nextLine();
            if(Objects.equals(u,username) && Objects.equals(p,password))
            {
                return true;
            }
            else {
                return false;
            }


        }

    }


