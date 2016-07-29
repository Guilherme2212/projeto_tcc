package com.example.android.imagebutton.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.imagebutton.datamodel.DataModel;

/**
 * Created by Guilherme Caetano on 27/07/2016.
 */
public class DataSource extends SQLiteOpenHelper {

    SQLiteDatabase sqLiteDatabase;
//----
    // Construtor da classe DataSource
    public DataSource(Context context) {
        super(context, DataModel.getDbName(), null, DataModel.getVERSION());

        sqLiteDatabase = this.getReadableDatabase();
    }
//----
    // Na primeira execusão cria o BD
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DataModel.criarTabelaCarro());
        db.execSQL(DataModel.criarTabelaManutencoes());
        db.execSQL(DataModel.criarTabelaMeusCarros());
        // acrescentar os inserts iniciais
    }
//----
    // Caso a versão seja alterada, executa o método onUpdate
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
//----
    public void persist(ContentValues contentValues, String tabela){
        if(contentValues.containsKey("_id") && contentValues.getAsInteger("_id") != null
                && contentValues.getAsInteger("_id") !=0){
            //--
            Integer id = contentValues.getAsInteger("_id");
            sqLiteDatabase.update(tabela,contentValues,"_id= "+id, null);
        }
    }
//----
}
