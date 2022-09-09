public class newBook {

    String nameAuthorA;
    String nameAuthorB;
    String nameA;
    String nameB;
    int dataA;
    int dataB;


    public static newBook createBookA (String nameAuthorA, String nameA,int dataA ) {

        newBook bookA = new newBook();
        bookA.nameAuthorA = nameAuthorA;
        bookA.nameA = nameA;
        bookA.dataA = dataA;
        return bookA;
    }

    public static newBook createBookB (String nameAuthorB, String nameB, int dataB) {

        newBook bookB = new newBook();
        bookB.nameAuthorB = nameAuthorB;
        bookB.nameB = nameB;
        bookB.dataB = dataB;
        return bookB;
    }
    public int setData(int dataA ) {
        return dataA;
    }

    public static void main(String[] args) {
        newBook readA = createBookA ("Andrei Smirnov", "МЫ МОЛОДЦЫ!", 2013);
        {
            System.out.println(readA.nameAuthorA + " " + readA.nameA + " " + readA.dataA);
        }
        newBook readB = createBookB ("Vasiliy Kutya", "Новая жизнь!", 2016);
        {
            System.out.println(readB.nameAuthorB + " " + readB.nameB + " " + readB.dataB );

        }




    }
}
