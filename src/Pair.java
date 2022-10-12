public class Pair {
    private final String bookName;
    private final String surname;
    private final String name;
    private final String patronymic;

    public String getBookName() {
        return bookName;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "\"" + bookName + "\"" + " "+
                 name +  " " + patronymic +".";
    }

    public Pair(String bookName, String surname, String name, String patronymic) {
        this.bookName = bookName;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

    }
}



