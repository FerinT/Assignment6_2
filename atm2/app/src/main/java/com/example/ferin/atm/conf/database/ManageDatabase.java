package com.example.ferin.atm.conf.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ferin on 2016-04-24.
 */

/* Ensures database is created with all tables */

public class ManageDatabase extends SQLiteOpenHelper {



    public static final String TABLE_NAME = "business";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_IDNUMBER = "idNumber";
    public static final String COLUMN_EMAIL = "email";

    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT  NOT NULL , "
            + COLUMN_IDNUMBER + " TEXT  NOT NULL , "
            + COLUMN_EMAIL + " TEXT  NOT NULL );";


    public ManageDatabase(Context context)
    {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public ManageDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, SQLiteDatabase db) {
        super(context, name, factory, version);
        this.db = db;
    }

    public ManageDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler, SQLiteDatabase db) {
        super(context, name, factory, version, errorHandler);
        this.db = db;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
        //db.execSQL(DATABASE_CREATE1);
    }

    public void deleteTable(String tablename){
        db.execSQL("DROP TABLE IF EXISTS "+tablename+";");
    }

    public boolean deleteDatabase(Context context) {
        return context.deleteDatabase(DBConstants.DATABASE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
