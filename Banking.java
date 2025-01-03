
import java.io.IOException;
import java.util.*;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Double> accBal = new HashMap<>();
    static boolean setStatus = true;
            public static void main(String[] args) {
                if(args.length > 0){
                    developerMode();
                }
                try{
                    do{
                        Thread.sleep(5000);
                        clearConsole();    
                        home();
                    }while(setStatus);
                }catch(Exception e){
                    System.out.println("\nApp under Maintenance!");
                }
            }
        
            public static void home(){
                System.out.println("==================================================================================================================================================================================================================");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tDomnic Banking App");
                System.out.println("==================================================================================================================================================================================================================");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tWelcome!");
                System.out.println("==================================================================================================================================================================================================================");
                System.out.println("\n\n1. Existing Customer \n2. New Customer \n\n(For existing accounts,select '1' then enter your Account No / else select '2')" );
                char existing = sc.next().charAt(0);
                if(existing == '1'){
                    System.out.println("Enter Your Account Number: ");
                    int accNo = sc.nextInt();
                    if(accBal.get(accNo) == null){
                        System.out.println("\nNo account Found! \nDo you need to create a new one? (y/n): ");
                        char choice =  sc.next().charAt(0);
                        if(choice == 'y'){
                            System.out.println("\nNew Account Created! ");
                            //Ensures that No repeated Account Numbers are used
                            accNo = (int)Math.floor(Math.random() * 100000);
                            while(accBal.get(accNo) != null){
                                accNo = (int)Math.floor(Math.random() * 100000);
                            }
                            accBal.put(accNo,0.0);
                            System.out.println("\nYour Account Number : "+accNo);
                            System.out.println("Your account Balance : "+accBal.get(accNo));
                            function(accNo);
                        }
                        else{
                            System.out.println("==================================================================================================================================================================================================================");
                            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tThank You ! Visit Again!");
                        }
                    }
                    else{
                        function(accNo);
                    }
                }
                else if(existing == '+'){
                    developerMode();
                }
                else{
                    System.out.println("\nDo you need to create a new one? (y/n): ");
                    char choice =  sc.next().charAt(0);
                    if(choice == 'y'){
                        System.out.println("\nNew Account Created! ");
                        int accNo = (int)Math.floor(Math.random() * 100000);
                        //Ensures that No repeated Account Numbers are used
                        while(accBal.get(accNo) != null){
                            accNo = (int)Math.floor(Math.random() * 100000);
                        }
                        accBal.put(accNo,0.0);
                        System.out.println("\nYour Account Number : "+accNo);
                        System.out.println("Your account Balance : "+accBal.get(accNo)+"\n");
                        function(accNo);
                    }
                    else{
                        System.out.println("==================================================================================================================================================================================================================");
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tThank You ! Visit Again!");
                    }
                }
            }
            public static void function(int accNo){
                char choice;
                do{
                    System.out.println("\nChoose your Option from below :\n1. Deposit\n2. Withdraw\n3. Balance\n4. Offers\n5. Close Account\n6. Exit");
                    int option = sc.nextInt();
                    double curr = accBal.get(accNo);
                    switch(option){
                        case 1:
                            System.out.println("\nHow much amount Do you need to Deposit: ");
                            double dep = sc.nextDouble();
                            accBal.put(accNo,(curr + dep));
                            System.out.println("\nAmount Deposited Successfully!");
                            System.out.println("Would you Like to continue ? (y/n) : ");
                            choice = sc.next().charAt(0);
                            break;
                        case 2:
                            System.out.println("\nHow much amount Do you need to Withdraw: ");
                            double with = sc.nextDouble();
                            if(with > curr || with < 0){
                                System.out.println("\nInsufficient Balance!");
                            }
                            else{
                                System.out.println("\nWithdrawl Successful!");
                                curr = curr - with;
                                accBal.put(accNo,curr);
                                System.out.println("\nCurrent Balance = "+ curr);
                            }
                            System.out.println("Would you Like to continue ? (y/n) : ");
                            choice = sc.next().charAt(0);
                            break;
                        case 3:
                            System.out.println("\nCurrent Balance = "+ curr);
                            System.out.println("Would you Like to continue ? (y/n) : ");
                            choice = sc.next().charAt(0);
                            break;
                        case 4:
                            System.out.println("\nChoose your Option from below :\n1. Personal Loan\n2. Home Loan\n3. Gold Loan\n4. Agri Loan\n5.Exit");
                            char loan = sc.next().charAt(0);
                            switch(loan){
                                case '1':
                                    System.out.println("\nYou Have Chosen the Loan Offer, Our Executive team will reach you shortly!");
                                    break;
                                case '2':
                                    System.out.println("\nYou Have Chosen the Loan Offer, Our Executive team will reach you shortly!");
                                    break;
                                case '3':
                                    System.out.println("\nYou Have Chosen the Loan Offer, Our Executive team will reach you shortly!");
                                    break;
                                case '4':
                                    System.out.println("\nYou Have Chosen the Loan Offer, Our Executive team will reach you shortly!");
                                    break;
                            }
                            System.out.println("Would you Like to continue ? (y/n) : ");
                            choice = sc.next().charAt(0);
                            break;
                        case 5:
                            System.out.println("Would You like to Close your Account? (y/n)");
                            char isClosing = sc.next().charAt(0);
                            if(isClosing == 'y'){
                                accBal.remove(accNo);
                                System.out.println("Account Closed Successfully!\n Thank You For Banking!");
                                choice = 'n';
                            }
                            else{
                                System.out.println("Would you Like to continue ? (y/n) : ");
                                choice = sc.next().charAt(0);
                            }
                            break;
                       case 6:
                            choice = 'n';
                            break;
                        default:
                            System.out.println("Would you Like to continue ? (y/n) : ");
                            choice = sc.next().charAt(0);
                    }
                    
                }while(choice == 'y');
                System.out.println("==================================================================================================================================================================================================================");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tThank You ! Visit Again!");
            }
            public static void developerMode(){
                System.out.println("System Entering Developer Mode!!!");
                    blinker();
                    System.out.print("\b\b\b\b");
                    blinker();
                    System.out.print("\b\b\b\b");
                    char close;
                    do{
                        System.out.println("What do you need to inspect: \n1. Software Update\n2. Diagnostics\n3. Shut Down");
                        int choice = sc.nextInt();
                        switch(choice){
                            // case 1:
                            //     double totalCash = 0;
                            //     for(int i = 0;i<accBal.size();i++){
                            //         totalCash += accBal.get(i);
                            //     }
                            //     System.out.println("\n Total Cash Present in the bank : "+totalCash);
                            //     break;
                            case 1:
                                    System.out.print("Checking for Updates");
                                    blinker();
                                    int updFound = (int)Math.floor(Math.random()*2);
                                    if(updFound == 1){
                                            System.out.println("Updating...!\nplease do not shut down or restart the App");
                                            blinker();
                                            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                                            System.out.println("System Update Completed!");
                                    }
                                    else{
                                        System.out.println("App is Up to date");
                                    }
                                    break;
                                
                            case 2:
                                    System.out.print("Checking for Issues");
                                    blinker();
                                    int issueFound = (int)Math.floor(Math.random()*2);
                                    if(issueFound == 1){
                                        System.out.println("Issues Found! ");
                                            System.out.print("Diagnosis Under Process");
                                            blinker();
                                            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                                            System.out.println("System Diagnosis Completed!");
                                    }
                                    else{
                                        System.out.println("No Issues Found!");
                                    }
                                    break;
                            case 3:
                                try{
                                    System.out.println("Exiting Developer Mode");
                                    Thread.sleep(3000);
                                    System.out.println("Shutting Down");
                                    blinker();
                                    Thread.sleep(3000);
                                    setStatus = false;
                                    clearConsole();
                                    System.exit(1);
                                }
                                catch(Exception e){
                                    System.out.print("System crashed!!!\n"+e);
                                }
                            }
                            System.out.println("would you like to exit Developer Mode?");
                            close = sc.next().charAt(0);
                            }while (close == 'n');
            }
            public static void blinker(){
                try{
                    Thread.sleep(100);
                                            System.out.print(".");
                                            Thread.sleep(100);
                                            System.out.print(".");
                                            Thread.sleep(100);
                                            System.out.print(".");
                                            Thread.sleep(100);
                                            System.out.print("\b\b\b");
                                            System.out.print(".");
                                            Thread.sleep(100);
                                            System.out.print(".");
                                            Thread.sleep(100);
                                            System.out.print(".\n");
                }
                catch(Exception e){
                    System.out.println("System Crashed!");
                }
            }
            public static void clearConsole(){
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }          
                }
                 
                catch(Exception e){
                    System.out.println("\nApp under Maintenance!");
                }
            }
}
