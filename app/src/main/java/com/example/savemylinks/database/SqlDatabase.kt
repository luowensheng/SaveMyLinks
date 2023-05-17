package com.example.savemylinks.database

import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
interface Table {

}

class SqlDatabase(databaseName:String, context: Context, version: Int=VERSION): SQLiteOpenHelper(context, databaseName, null, version) {

    companion object {
        private val VERSION = 1
    }
    private var commands: MutableList<SQLQuery> = mutableListOf()

    lateinit var sqlDb: SQLiteDatabase

    override fun onCreate(db: SQLiteDatabase?) {
        this.sqlDb = db!!
        sqlDb.execSQL(
            SQLQuery().createTableIfNotExists("") {
            TableBuilder()
                .column("id").primaryKey().autoIncrement()
                .column("").text()
                .column("").text()
        }.build()
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL( SQLQuery().dropTableIfExists("").build() )
        onCreate(db)
    }

    fun exec(query: SQLQuery){
        try {  sqlDb.execSQL(query.build())  }
        catch (e: SQLException){  }
//            this.writableDatabase.
    }

}