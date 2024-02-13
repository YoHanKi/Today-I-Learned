package Weekly.quiz.third;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        AddressBook address = new AddressBook();
        Scanner scn = new Scanner(System.in);
        boolean end = true;

        while (end) {
            address.mainMenu();
            int N = scn.nextInt();
            switch (N) {
                case 1,2 :
                    address.addContact(N);
                    continue;
                case 3 :
                    address.displayContacts();
                    continue;
                case 4 :
                    address.searchContact();
                    continue;
                case 5 :
                    end = false;
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. 메인메뉴로 돌아갑니다.");
            }
        }
    }
}
