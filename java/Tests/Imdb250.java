package Tests;

import org.testng.annotations.Test;

public class Imdb250 extends BaseTest {

    @Test
    public void sortingTop250() throws Exception {

        // opening the top250 page
        met.getNavigation().openMainPage("");
        // find movie on main page before sorting
        met.getNavigation().findMovie("", "");

        // check sort
        met.getNavigation().checkSort("IMDb Rating", "\"ir:descending\"", "");
        met.getNavigation().checkSort("Release Date", "\"us:descending\"", "");
        met.getNavigation().checkSort("Number of Ratings", "\"nv:descending\"", "");
        met.getNavigation().checkSort("Your Rating", "\"ur:descending\"", "");
        met.getNavigation().checkSort("Ranking", "\"rk:ascending\"", "");
    }

}
