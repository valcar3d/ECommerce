package com.dimensiva.ecommerce.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


object SharedPreferencesUtil {
    fun setArrayPrefs(nameToSave: String, array: MutableList<String>, mContext: Context) {
        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(mContext)
        val editor: SharedPreferences.Editor = sharedPrefs.edit()
        val gson = Gson()

        val json = gson.toJson(array)
        editor.putString(nameToSave, json)

        editor.apply()
    }

    fun getArrayPrefs(nameToGet: String, mContext: Context): ArrayList<String?> {

        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(mContext)
        val gson = Gson()
        val json = sharedPrefs.getString(nameToGet, "")
        val type: Type = object : TypeToken<List<String?>?>() {}.type

        return gson.fromJson(json, type)


    }
}