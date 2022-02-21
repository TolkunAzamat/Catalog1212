package com.example.catalog1212.services

import android.content.Context
import android.content.SharedPreferences

class SharedPreference (context: Context) {
    private val APP_NAME="SharedPreference"
    private var pref: SharedPreferences
    // private var editor:SharedPreferences.Editor
    init{
        pref=context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE)

    }
    var login:String?
        get()=pref.getString("login",null)
        set(value)=pref.edit().putString("login",value).apply ()
    var password:String?
        get()=pref.getString("password",null)
        set(value)=pref.edit().putString("password",value).apply ()
}
