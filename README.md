# HelloMoon

This app is a simple example of how Android handles localization.

## How Localization is Handled

The Android OS makes the localization of text very easy. Your strings should already be saved as resources into files like:

    /app/main/res/values/string.xml
    /app/main/res/values-land/string.xml

When an Android program is run, the OS will hunt through the all of the available resource directories and try to find a version that matches the languages settings of the local device. To add French text to your app, you would simply build paralllel `string.xml` files in folders with names that include the two-digit language code. For French, you might use:

    /app/main/res/values-fr/
    /app/main/res/values-fr-land/

For a complete listing of Android-supported language codes, look at the [ISO 639-2 webpage]( http://loc.gov/standards/iso639-2/php/code_list.php).

## What Languages to Localize Too

This is a big question for app developers out there. And a potential risk for the independent app developer. I've done some research on the matter and here are some of the more interesting results.

#### Languages by Game Revenue (2013)

[LocalizeDirect](http://localizedirect.com/posts/which-languages/)

1. Japanese
2. Korean
3. English
4. French
5. German
6. Russian
7. Chinese

#### Languages by Game Downloads (2013)

[LocalizeDirect](http://localizedirect.com/posts/which-languages/)

1. English
2. Korean
3. Russian
4. German
5. Brazilian
6. Chinese
7. Spanish

#### Languages by Android Users (2013)

[Tethras Blog](http://blog.tethras.com/into-which-languages-should-i-localize-my-mobile-app/)

1. English
2. Korean
3. Spanish
4. Russian
5. German
6. Japanese
7. French
8. Portugese
9. Italian

#### World Languages by Population (Time Independent)

[David Brown Blog](http://www.davidpbrown.co.uk/help/top-100-languages-by-population.html)

1. Chinese, Mandarin
2. Spanish
3. English
4. Bengali
5. Hindi
6. Portuguese
7. Russian
8. Japanese
9. German
10. Chinese, Wu
11. Javanese
12. Korea
13. French

#### Top Languages by Internet Usage (2013)

[Internet World Stats](http://www.internetworldstats.com/stats7.htm)

1. English
2. Chinese
3. Spanish
4. Arabic
5. Portugese
6. Japanese
7. Russian
8. German
9. French
10. Malasia

## App Reference

A big thanks to the kids over at the [Big Nerd Ranch](https://www.bignerdranch.com/).
