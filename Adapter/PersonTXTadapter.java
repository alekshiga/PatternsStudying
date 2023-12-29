package Adapter;

public class PersonTXTadapter implements PersonXML {

    private final PersonTXT personTXT;

    public PersonTXTadapter(PersonTXT personTXT) {
        this.personTXT = personTXT;
    }


    @Override
    public String getPersonName() {
        return personTXT.getName();
    }

    @Override
    public int getPersonAge() {
        return personTXT.getAge();
    }
}
