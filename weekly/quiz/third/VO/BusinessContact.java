package Weekly.quiz.third.VO;

public class BusinessContact<T> extends Contact {
    private T company;

    public BusinessContact(T name, T phoneNumber, T company) {
        super(name,phoneNumber);
        this.company = company;
    }

    public T getCompany() {
        return company;
    }

    public void setCompany(T company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name=" + this.getName() +
                ", phoneNumber=" + this.getPhoneNumber() +
                "company=" + company +
                '}';
    }
}
