Common description

1. Open main page, check for assessibility (with / without login). 
The direct link http://www.imdb.com/chart/top or through the selection menu.
2. Find the line. It should be in a table <table class="chart full-width" data-caller-name="chart-top250movie">. 
If the row exists, then it has classes posterColumn, titleColumn, and others, it is possible to determine the string with those classes.
However, lines can be in the table but they are hidden (for example, login -> mark all the films as seen -> mark checkbox Hide titles I've seen).
Therefore, additionally, you can check that the string does not have the tag <tr style="display: none;">.
4. It seems to me that it is possible to search the string by the presence of the rating, because both of these pages display the most rated movies, so rate is necessary to show row in this table.
5. You can do check that row contains exactly the movie (not songs or pictures, for example). Maybe to pass through some link with title and search form elements inherent in the movie-file.
6. Link to the Western page must be distinguished from the Western genre.
7. Page Western is different from Top250. 
In particular, filters can also have the order (asc or desc), it is necessary to check that any filter will be displayed at least one film. Xpath to line with a movie is also different. It's better to use xpath at this page to find anything, because link name can match the name with the movie titles or other page elements names.
8. Checks have to do with different language settings (Site Settings). Probably, changing the settings may result in the replacement not only the names and descriptions of the films, but names of links.
9. Use different browsers.

10. In my tests, the data must be placed a separate list and refer to it when running tests.
