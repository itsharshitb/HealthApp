package com.example.meanttohealth;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;

import androidx.annotation.Nullable;


public class database extends SQLiteOpenHelper {

     private static final String dbname="signup.db";
     public static final String TABLE_NAME= "User";


    public database(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
     String q="create table TABLE_NAME(_id integer primary key autoincrement, name text, Email text, username text ,password text)";
        sqLiteDatabase.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insert_data(String name,String Email, String username,String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("name",name);
        c.put("Email",Email);
        c.put("username",username);
        c.put("password",password);

        long r= db.insert("User",null,c);
        if(r==-1)
            return false;
        else
            return true;
    }

     public boolean checkusername(String username) {
         SQLiteDatabase mydb = this.getWritableDatabase();
         Cursor cursor = mydb.rawQuery("select * from User where username=?", new String[]{username});
         if(cursor.getCount()>0)
             return true;
         else
             return false;
     }

     public boolean checkusernamepassword(String username,String password){
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor =mydb.rawQuery("select * from User where username=? and password=?",new String[]{username, password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

   public  Cursor readData(String username){
        SQLiteDatabase db=this.getReadableDatabase();
       return db.query(TABLE_NAME,null,"username=?",new String[]{username},null,null,null,null);
   }

}
