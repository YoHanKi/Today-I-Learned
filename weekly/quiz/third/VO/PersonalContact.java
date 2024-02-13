package Weekly.quiz.third.VO;

public class PersonalContact<T> extends Contact {
    private T relationship;

    public PersonalContact(T name, T phoneNumber, T relationship) {
        super(name,phoneNumber);
        this.relationship = relationship;
    }

    public T getRelationship() {
        return relationship;
    }

    public void setRelationship(T relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name=" + this.getName() +
                ", phoneNumber=" + this.getPhoneNumber() +
                "relationship=" + relationship +
                '}';
    }
}
