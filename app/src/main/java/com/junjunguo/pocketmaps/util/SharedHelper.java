package com.junjunguo.pocketmaps.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedHelper {
    static SharedPreferences pref, ride_pref;
    static SharedPreferences.Editor editor, ride_editor;
    public static SharedPreferences sharedPreferences;

    public static void putStripelink(Context context, String Key, String Stripelink) {
        pref = context.getSharedPreferences("stripelink", Context.MODE_PRIVATE);
        editor = pref.edit();
        editor.putString(Key, Stripelink);
        editor.apply();
    }

    public static String getstripelink(Context contextGetKey, String Stripelink) {
        pref = contextGetKey.getSharedPreferences("stripelink", Context.MODE_PRIVATE);
        String stripe = pref.getString(Stripelink, "");
        return stripe;
    }


    public static void putKey(Context context, String Key, String Value) {
        pref = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        editor = pref.edit();
        editor.putString(Key, Value);
        editor.apply();

    }

    public static String getKey(Context contextGetKey, String Key) {
        pref = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        String Value = pref.getString(Key, "");
        return Value;

    }

    public static void putValue(Context context, String key, String value) {
        pref = context.getSharedPreferences("cache", Context.MODE_PRIVATE);
        editor = pref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getValue(Context context, String key) {
        pref = context.getSharedPreferences("cache", Context.MODE_PRIVATE);
        return pref.getString(key, "");
    }

    public static void putDeviceID(Context context, String key, String value) {
        pref = context.getSharedPreferences("device", Context.MODE_PRIVATE);
        editor = pref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getDeviceID(Context context, String key) {
        pref = context.getSharedPreferences("device", Context.MODE_PRIVATE);
        return pref.getString(key, "");
    }

    public static void clearSharedPreferences(Context context) {
        pref = context.getSharedPreferences("cache", Context.MODE_PRIVATE);
        pref.edit().clear().apply();
    }


    ///////  Post Ride Local Data  //////
    public static void putpostRideVlue(Context context, String key, String value) {
        ride_pref = context.getSharedPreferences("post_ride", Context.MODE_PRIVATE);
        ride_editor = ride_pref.edit();
        ride_editor.putString(key, value);
        ride_editor.apply();
    }

    public static String getpostRideVlue(Context context, String key) {
        ride_pref = context.getSharedPreferences("post_ride", Context.MODE_PRIVATE);
        return ride_pref.getString(key, "");
    }

    public static void clearpostRideVlue(Context context) {
        ride_pref = context.getSharedPreferences("post_ride", Context.MODE_PRIVATE);
        ride_pref.edit().clear().apply();
    }

    public static String getToken(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Token", Context.MODE_PRIVATE);
        String Value = sharedPreferences.getString(Key, "");
        return Value;

    }

    public static void putToken(Context context, String Key, String Value) {
        sharedPreferences = context.getSharedPreferences("Token", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(Key, Value);
        editor.commit();

    }

}
