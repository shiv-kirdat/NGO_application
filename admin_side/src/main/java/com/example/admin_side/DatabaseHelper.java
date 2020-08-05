package com.example.admin_side;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper( Context context) {
        super(context, "Firstdatabase.db",null,1 );
        SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table
        db.execSQL("create table event(name text,city text,rollno integer primary key)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists event");

    }
    //insert values
    public boolean insertevent(String s1, String s2,Integer I1)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",s1);
        contentValues.put("city",s2);
        contentValues.put("rollno",I1);
        long result = db.insert("event",null,contentValues);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }
    }

}
