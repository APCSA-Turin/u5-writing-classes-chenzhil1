import java.util.Scanner;
public class EquationSolver {
    private int choice = 0;
    private boolean linear = false;
    private boolean quadratic = false;
    Scanner scan = new Scanner(System.in);
    ZeroSolver linearEQ;
    ZeroSolver quadraticEQ;
    public EquationSolver() {}

    public void start(Scanner scan) {
        System.out.println("Welcome to the Equation Solver, ");
        System.out.println("dedicated to help you find the zero of a function.");
        System.out.println("Let's start by creating a function");
        while(choice != 1 && choice != 2) {
            System.out.println("1. Create a linear function");
            System.out.println("2. Create a quadratic function");
            choice = scan.nextInt();
            scan.nextLine();
        }
        
        if(choice == 1) {
            createLinear(scan);
            linear = true;
            choice = 0;
            while(choice != 1 && choice != 2) {
                System.out.println("Would you like to make a quadratic function as well?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = scan.nextInt();
                scan.nextLine();

            }
            if (choice == 1) {
                createQuadratic(scan);
                quadratic = true;
                choice = 0;

            }
            choice = 0;

            
        }
        else {
            createQuadratic(scan);
            quadratic = true;
            choice = 0;

            while(choice != 1 && choice != 2) {
                System.out.println("Would you like to make a linear function as well?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = scan.nextInt();
                scan.nextLine();

            }
            if (choice == 1) {
                createLinear(scan);
                linear = true;
                choice = 0;

            }
            choice = 0;
        }
        while(choice < 1 || choice > 4) {
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("1. Find linear zero");
            System.out.println("2. Find quadratic zero");
            System.out.println("3. Compare the zeros");
            System.out.println("4. Exit");
            choice = scan.nextInt();
            scan.nextLine();
            if(choice == 1) {
                if(!linear) {
                    choice = 0;
                    while(choice != 1 && choice!= 2) {
                        System.out.println("Linear function not created, create one now?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        choice = scan.nextInt();
                        scan.nextLine();
                        if(choice == 1) {
                            createLinear(scan);
                            linear = true;
                            choice = 0;

                        }
                        else {
                            System.out.println(linearEQ.getLinearZero());
                        }
                    }
            }
            else if(choice == 2) {
                if(!quadratic) {
                    choice = 0;
                    while(choice != 1 && choice!= 2) {
                        System.out.println("Quadratic function not created, create one now?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        choice = scan.nextInt();
                        scan.nextLine();
                        if(choice == 1) {
                            createLinear(scan);
                            quadratic = true;
                            choice = 0;

                        }
                        else {
                            System.out.println(quadraticEQ.getQuadraticZero());
                            choice = 0;
                        }
                    }

            }
            else if (choice == 3) {
                if(!linear) {
                    choice = 0;
                    while(choice != 1 && choice!= 2) {
                        System.out.println("Linear function not created, create one now?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        choice = scan.nextInt();
                        scan.nextLine();
                        if(choice == 1) {
                            createLinear(scan);
                            linear = true;
                            choice = 0;

                        }
                        choice = 0;
                    }
                }
                if(!quadratic) {
                    choice = 0;
                    while(choice != 1 && choice!= 2) {
                        System.out.println("Quadratic function not created, create one now?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        choice = scan.nextInt();
                        scan.nextLine();
                        if(choice == 1) {
                            createLinear(scan);
                            quadratic = true;
                            choice = 0;

                        }
                        choice = 0;
                    }
                }
                else{
                    linearEQ.compareZero(quadraticEQ);
                    choice = 0;
                }
            }
            else if(choice == 4) {
                break;
            }
            else {

            }
        }
    }
    }



    }

    private void createLinear(Scanner scan) {
        double m = 0;
        double b = 0;
        System.out.print("Please enter the slope of the function: ");
        m = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter the constant of the function: ");
        b = scan.nextDouble();
        scan.nextLine();
        linearEQ = new ZeroSolver(m,b);

    }

    private void createQuadratic(Scanner scan) {
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.print("Please enter the 2nd power value: ");
        a = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter the 1st power value: ");
        b = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter the constant value: ");
        c = scan.nextDouble();
        scan.nextLine();
        quadraticEQ = new ZeroSolver(a, b, c);

    }
}
