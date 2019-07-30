package com.android.mob104.managestoreclothes.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ClothesDAO {
    private SQLiteDatabase db;
    private DataBase dataBase;
    public static final String TABLE_NAME = "QuanAo";
    public static final String SQL_QUAN_AO = "CREATE TABLE QuanAo (maquanao text primary key,tenquanao text, giatien text, ngaynhap text);";
    public static final String TAG = "QuanAoDAO";

    public ClothesDAO(Context context) {
        dataBase = new DataBase(context);
        db = dataBase.getWritableDatabase();
    }

}
