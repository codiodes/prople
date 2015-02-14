package com.codiodes.prople.Helper;

import java.lang.reflect.Array;

/**
 * Created by Salman on 2/7/2015.
 */
public class Constants {
    // Preference Name
    public static String PROP_PREFS = "Prople Preferences";

    public static String PREF_LOGGED_IN_KEY = "Logged In";

    public static  String PREF_USERNAME = "Prople Username Key";

    public static String PREF_PASSWORD = "Prople Password Key";

    public static enum AppMenuTabs{
        SALE,
        RENT,
        AUCTION,
        PRE_LEASED,
        RESIDENTIAL,
        COMMERCIAL,
        ADD_PROPERTY
    }

    public static String[] tabNames = {"Sale", "Rent", "Auction", "Pre Leased", "Residential", "Commercial", "Add Property"};

    public static int NO_OF_TABS = 7;
}
