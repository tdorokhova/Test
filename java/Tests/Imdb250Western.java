package Tests;

import org.testng.annotations.Test;

public class Imdb250Western extends BaseTest {

    @Test
    public void sortWesternTop() throws Exception {

        // Opening the top Western page
        met.getNavigation().openMainPage("Western");
        // find movie on main page before sorting
        met.getNavigation().findMovie("", "Western");

        // check sort
        met.getNavigation().checkSort("Popularity", "", "Western");
        met.getNavigation().checkSort("Popularity\u25b2", "", "Western");
        met.getNavigation().checkSort("A-Z", "", "Western");
        met.getNavigation().checkSort("A-Z\u25b2", "", "Western");
        met.getNavigation().checkSort("User Rating", "", "Western");
        met.getNavigation().checkSort("User Rating\u25bc", "", "Western");
        met.getNavigation().checkSort("Num Votes", "", "Western");
        met.getNavigation().checkSort("Num Votes\u25bc", "", "Western");
        met.getNavigation().checkSort("US Box Office", "", "Western");
        met.getNavigation().checkSort("US Box Office\u25bc", "", "Western");
        met.getNavigation().checkSort("Runtime", "", "Western");
        met.getNavigation().checkSort("Runtime\u25b2", "", "Western");
        met.getNavigation().checkSort("Year", "", "Western");
        met.getNavigation().checkSort("Year\u25b2", "", "Western");
        met.getNavigation().checkSort("US Release Date", "", "Western");
        met.getNavigation().checkSort("US Release Date\u25b2", "", "Western");
    }

}