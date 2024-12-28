package com.chahnez.imgapp.outils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySqlLiteOpenHelper extends SQLiteOpenHelper {

    // proprietes
    private String creation
            =
            "CREATE TABLE T_Profil("
                    +"dateMesure TEXT PRIMARY KEY,"
                    +"Poids INTEGER NOT NULL,"
                    +"Taille INTEGER NOT NULL,"
                    +"Age INTEGER NOT NULL,"
                    +"Sexe INTEGER NOT NULL);";

    /**
     *
     * @param context
     * @param name
     * @param factory
     * @param version
     */

    public MySqlLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * si changement de BD
     * @param sqLiteDatabase
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(creation);
    }

    /**
     * si changement de version
     * @param sqLiteDatabase
     * @param i
     * @param i1
     */
    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i , int i1) {

    }
}
