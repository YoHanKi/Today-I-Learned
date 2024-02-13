package Weekly.quiz.third.VO;

public class Contact<T> {
    private T name;
    private T phoneNumber;

    Contact(T name, T phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(T phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
