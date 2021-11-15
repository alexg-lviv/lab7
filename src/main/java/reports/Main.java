package reports;

import analytics.Authorisation;
import analytics.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation auth = new Authorisation();
        if (auth.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
