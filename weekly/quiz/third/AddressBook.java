package Weekly.quiz.third;

import Weekly.quiz.third.VO.BusinessContact;
import Weekly.quiz.third.VO.Contact;
import Weekly.quiz.third.VO.PersonalContact;

import java.util.*;

public class AddressBook {
    Scanner scn = new Scanner(System.in);
    List<Contact<String>> list = new ArrayList<>();

    public void mainMenu() {
        System.out.println("-----------------메인메뉴-----------------");
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.println("-----------------------------------------");
        System.out.print("메뉴를 선택해주세요: ");

    }

    public void addContact(int N) {
        System.out.print("이름을 입력하세요: ");
        String name = scn.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scn.nextLine();
        if( N == 1) {
            System.out.print("회사명을 입력하세요: ");
            String company = scn.nextLine();

            list.add(new BusinessContact(name, phoneNumber, company));
        } else {
            System.out.print("관계를 입력하세요: ");
            String relationship = scn.nextLine();

            list.add(new PersonalContact(name, phoneNumber, relationship));
        }
    }

    public void displayContacts() {
        if(list.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        System.out.println("-----------------------------------------");
        System.out.printf("저장된 총 연락처 수 : %d\n", list.size());
        for(Contact contact : list) {
            markOffList(contact);
        }
        System.out.println("-----------------------------------------");
    }

    public void searchContact() {
        if(list.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        System.out.print("검색할 이름을 입력하세요: ");
        String name = scn.nextLine();
        boolean done = false;

        for(Contact contact : list) {
        if (contact.getName().equals(name)) {
            System.out.println("-----------------------------------------");
            markOffList(contact);
            done = true;
        }
    }
        if(!done) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
            System.out.println("-----------------------------------------");
    }

    public void markOffList(Contact contact) {
        if (contact instanceof BusinessContact) {
            BusinessContact business = (BusinessContact)contact;
            System.out.printf("이름 : %s, 전화번호 : %s, 회사명 : %s\n"
                    , business.getName()
                    , business.getPhoneNumber()
                    , business.getCompany());
        } else if(contact instanceof PersonalContact) {
            PersonalContact personal = (PersonalContact)contact;
            System.out.printf("이름 : %s, 전화번호 : %s, 관계 : %s\n"
                    , personal.getName()
                    , personal.getPhoneNumber()
                    , personal.getRelationship());
        }
    }
}
