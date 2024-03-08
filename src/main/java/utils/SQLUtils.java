package utils;

public class SQLUtils {
    public  static class PersonSQL{

        // all constant must in uppercase
        public static final String getAllPersonSql= """
            select * from person_tb;
            """;
        public static final String insertNewPerson= """
                INSERT INTO person_tb ("ID","FullName","Age","Email","Address") VALUES(?,?,?,?,?);
                """;

        public  static final String deletePersonById = """
                delete from person_tb where ID = ?
                """;

        public  static final String updatePerson= """
                update person_tb set FullName=?,Age=?,Email=?,Address=?
                where ID = ?
                """;
    }
    public  static class SystemUser{
        // sql string in here !
    }
}
