package com.chahnez.imgapp.modules;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.chahnez.imgapp.outils.MySqlLiteOpenHelper;

import java.util.Date;

public class AccesLocal {

    // proprietes
    private String nomBase = "BDCoach.sqlite";
    private Integer versionBase = 1;
    private MySqlLiteOpenHelper accesBD;
    private SQLiteDatabase bd;

    public AccesLocal(Context contexte) {
        accesBD = new MySqlLiteOpenHelper(contexte, nomBase,null, versionBase);
    }

    public void ajout (Profil profile){
        bd = accesBD.getWritableDatabase();
        String req
                =
                "INSERT INTO T_Profil(dateMesure, Poids,\n" +
                        "Taille, Age, Sexe) VALUES";
        req += "(\""+profile.getDateMesure()+"\","+profile.getPoids()+
                ","+profile.getTaille()+","+profile.getAge()+
                ","+ profile.getSexe()+")";

        bd.execSQL(req);
    }

    public Profil recupDernier(){
        bd = accesBD.getReadableDatabase();
        Profil profil = null;
        String req
                =
                "SELECT * FROM T_Profil";
        Cursor curseur = bd.rawQuery(req, null);
        curseur.moveToLast();
        if(!curseur.isAfterLast()){
            Date date
                    =
                    new Date();
            Integer poids = curseur.getInt(1);
            Integer taille = curseur.getInt(2);
            Integer age = curseur.getInt(3);
            Integer sexe = curseur.getInt(4);
            profil = new Profil(date, poids, taille, age, sexe
            );
        }
        curseur.close();
        return profil;
    }
}
