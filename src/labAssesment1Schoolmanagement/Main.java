package labAssesment1Schoolmanagement;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Principal P = new Principal();
            boolean x = P.signIN();
            Principal_Methods p1 = new Principal_Methods();
            System.out.println("Press 1 to add student and 2 to view a Class");
            Scanner sc = new Scanner(System.in);
            int z = 0;
            z = sc.nextInt();
            do {

                if (z == 1)
                {
                    p1.add();
                    System.out.println("Press 1 to add student and 2 to view a Class and 3 to exit");
                    z = sc.nextInt();
                    if (z == 1)
                    {

                    }
                    else if (z == 2)
                    {

                    }
                    else if (z == 3)
                    {
                        System.out.println("Exiting program***********");
                        break;
                    }

                }
                else if (z == 2)
                {
                    p1.view();
                    System.out.println("Press 1 to add student and 2 to view a Class and 3 to exit");
                    z = sc.nextInt();
                    if (z == 1)
                    {

                    }
                    else if (z == 2)
                    {

                    }
                    else if (z == 3)
                    {
                        System.out.println("Exiting program***********");
                        break;
                    }

                }
            }while (z != 3);

        }

    }


