package com.chahnez.imgapp.controlleurs;

import android.content.Context;

import com.chahnez.imgapp.modules.AccesLocal;
import com.chahnez.imgapp.modules.Profil;
import com.chahnez.imgapp.outils.Serializer;

import java.util.Date;

public class Controle {


    private static Controle instance = null;
    private static Profil profil;
    private static String nomfich = "saveprofil.txt";
    private static AccesLocal accesLocal;

    /**
     * Constructeur
     */
    private Controle(){
        super();
    }

    /**
     * Creation de l ionmstance singleton
     * @return instance du controleur
     */
    public static final Controle getInstance(Context contexte){
        if(Controle.instance==null){
            Controle.instance = new Controle();
            //recupSerialize(contexte);
            accesLocal = new AccesLocal(contexte);
            profil = accesLocal.recupDernier();
        }
        return Controle.instance;
    }

    /**
     * Creation du profil
     * @param poids
     * @param taille en cm
     * @param age
     * @param sexe 1 pour Homme 0 pour Femme
     */
    public void creerProfil(Integer poids, Integer taille,
                            Integer age, Integer sexe, Context contexte){
        this.profil = new Profil(new Date(), poids, taille, age
                , sexe);
        //Serializer.serialize(nomfich, profil, contexte);
        accesLocal.ajout(profil);
    }

    /**
     * Recuperation de IMG depuis profil
     * @return
     */
    public float getImg(){
        return profil.getImg();
    }

    /**
     * Recuperation message de profil
     * @return le message
     */
    public String getMessage(){
        return profil.getMessage();
    }

    private static void recupSerialize(Context contexte){
        profil = (Profil) Serializer.deSerialize( nomfich,
                contexte);
    }

    public Integer getPoids(){
        if(profil==null){
            return null;
        }else{
            return profil.getPoids();
        }
    }

    public Integer getTaille(){
        if(profil==null){
            return null;
        }else{
            return profil.getTaille();
        }
    }

    public Integer getAge(){
        if(profil==null){
            return null;
        }else{
            return profil.getAge();
        }
    }

    public Integer getSexe(){
        if(profil==null){
            return null;
        }else{
            return profil.getSexe();
        }
    }


}
