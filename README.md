# HelloMoon

I used this app to learn how the Android OS handles localization.

## How Localization is Handled

For localization of text, the Android OS makes this very easy. Strings are saved into `string.xml` files in locations like:

    /app/main/res/values/
    /app/main/res/values-land/

If you want to support a language, the Android OS will try to find resources that match the language settings of the device. So, to add French text,  you would just build parallel `string.xml` files and throw them in directories with the two-digit language code added:

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
