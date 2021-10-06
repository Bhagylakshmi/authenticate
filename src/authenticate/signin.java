//public class signin {
//}
package authenticate;

import java.util.ArrayList;
import java.util.Scanner;

public class signin {

    public void asignin(ArrayList<user> users){
        Scanner input=new Scanner(System.in);
        System.out.println("signin");
        System.out.println("Enter username");
        String username=input.next();
        boolean flag=true,endflag=true;
        for (authenticate.user user : users) {
            if (username.equals(user.getUsername())) {
                flag = false;
                System.out.println("Enter password");
                String password = input.next();
                if (password.equals(user.getPassword())) {
                    System.out.println("data is ==>" + user.getData());
                    while (endflag) {
                        System.out.println("1)change username2)change password 3)change data 4)logout");
                        int option = input.nextInt();
                        switch (option) {
                            case 1 -> {
                                System.out.println("enter new username");
                                String currentuser = user.getUsername();
                                String newuser = input.next();
                                user.setUsername(newuser);
                                System.out.println("username changed from " + currentuser + " to " + newuser);
                            }
                            case 2 -> {
                                System.out.println("enter new password");
                                String currentpassword = user.getPassword();
                                String newpasword = input.next();
                                user.setUsername(newpasword);
                                System.out.println("password changed from " + currentpassword + " to " + newpasword);
                            }
                            case 3 -> {
                                System.out.println("enter 1) to remove data 2) to add new data");
                                option = input.nextInt();
                                if (option == 1) {
                                    String currentdata = user.getData();
                                    user.setData("");
                                    System.out.println("current data\n" + currentdata + " is data removed");
                                } else if (option == 2) {
                                    String currentdata = user.getData();
                                    System.out.println("enter data");
                                    String data = input.next();
                                    currentdata += data;
                                    System.out.println("data updated to " + currentdata);

                                } else {
                                    System.out.println("invlaid input");
                                }
                            }
                            case 4 -> {
                                System.out.println("loggedout");
                                endflag = false;
                            }
                            default -> System.out.println("invalid input");
                        }
                    }


                } else {
                    System.out.println("Wrong password");
                }
            }
        }
        if(flag){
            System.out.println("user not found");
        }

    }
}
