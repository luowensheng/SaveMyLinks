package com.example.savemylinks.database

import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import java.util.Optional

fun MutableList<String>.add(vararg items: String){
    items.forEach { this.add(it) }
}

class SQLQuery() {

    companion object {
        val db: Optional<SQLiteDatabase> = Optional.empty()
    }
    private var dbquery: MutableList<String> = mutableListOf()
    private var values: MutableList<Any> = mutableListOf()

    fun alterTable(tableName: String): SQLQuery {
        dbquery.add("ALTER TABLE", tableName)
        return this
    }

    fun and(item: String): SQLQuery {
        dbquery.add("AND", item)
        return this
    }

    fun add(item: String): SQLQuery {
        dbquery.add("ADD", item)
        return this
    }

    fun int(): SQLQuery {
        dbquery.add("INT")
        return this
    }

    fun equalTo(value: String): SQLQuery {
        dbquery.add("=", value)
        return this
    }

    fun greaterThan(value: String): SQLQuery {
        dbquery.add(">", value)
        return this
    }

    fun greaterThanOrEqual(value: String): SQLQuery {
        dbquery.add(">=", value)
        return this
    }

    fun lessThan(value: String): SQLQuery {
        dbquery.add("<", value)
        return this
    }

    fun lessThanOrEqual(value: String): SQLQuery {
        dbquery.add("<=", value)
        return this
    }

    fun createTableIfNotExists(tableName: String, getTable: ()-> TableBuilder): SQLQuery {
        dbquery.add("CREATE TABLE IF NOT EXISTS", tableName, getTable().build())
        return this
    }

    fun innerJoin(tableName: String): SQLQuery {
        dbquery.add("INNER JOIN", tableName)
        return this
    }

    fun fullJoin(tableName: String): SQLQuery {
        dbquery.add("FULL JOIN", tableName)
        return this
    }
    fun fullOuterJoin(tableName: String): SQLQuery {
        dbquery.add("FULL OUTER JOIN", tableName)
        return this
    }
    fun set(columnName: String): SQLQuery {
        dbquery.add("SET", columnName)
        return this
    }
    fun aS(vararg items: String): SQLQuery {
        dbquery.add("AS", items.joinToString(", "))
        return this
    }
    fun asSelect(vararg columnNames: String): SQLQuery {
        dbquery.add("AS SELECT", *columnNames)
        return this
    }
    fun between(value: String): SQLQuery {
        dbquery.add("BETWEEN", value)
        return this
    }
    fun truncate(tableName: String): SQLQuery {
        dbquery.add("TRUNCATE", tableName)
        return this
    }
    fun truncateTable(tableName: String): SQLQuery {
        dbquery.add("TRUNCATE TABLE", tableName)
        return this
    }

    fun case(item: String): SQLQuery {
        dbquery.add("CASE", item)
        return this
    }

    fun caseWhen(item: String): SQLQuery {
        dbquery.add("CASE WHEN", item)
        return this
    }

    fun selectCount(value: String): SQLQuery {
        dbquery.add("SELECT COUNT", value)
        return this
    }

    fun asc(): SQLQuery {
        dbquery.add("ASC")
        return this
    }

    fun desc(): SQLQuery {
        dbquery.add("DESC")
        return this
    }

    fun whereNot(columnName: String): SQLQuery {
        dbquery.add("WHERE NOT", columnName)
        return this
    }

    fun createTable(tableName: String, getTable: ()-> TableBuilder): SQLQuery {
        dbquery.add("CREATE TABLE", tableName, getTable().build())
        return this
    }

    fun createDatabase(database: String): SQLQuery {
        dbquery.add("CREATE DATABASE", database)
        return this
    }

    fun createView(viewName: String): SQLQuery {
        dbquery.add("CREATE VIEW", viewName)
        return this
    }

    fun groupBy(columnName: String): SQLQuery {
        dbquery.add("GROUP BY", columnName)
        return this
    }

    fun having(item: String): SQLQuery {
        dbquery.add("HAVING", item)
        return this
    }

    fun havingCount(item: String): SQLQuery {
        dbquery.add("HAVING COUNT", item)
        return this
    }

    fun join(tableName: String): SQLQuery {
        dbquery.add("JOIN", tableName)
        return this
    }

    fun InsertInto(tableName: String, vararg columnNames: String): SQLQuery {
        dbquery.add("INSERT INTO", "$tableName(", columnNames.joinToString(", ") ,")")
        return this
    }

    fun where(columnName: String): SQLQuery {
        dbquery.add("WHERE", columnName)
        return this
    }

    fun isNull(): SQLQuery {
        dbquery.add("IS NULL")
        return this
    }

    fun isNotNull(): SQLQuery {
        dbquery.add("IS NOT NULL")
        return this
    }

    fun like(pattern: String): SQLQuery {
        dbquery.add("LIKE", pattern)
        return this
    }


    fun limit(limit: Integer): SQLQuery {
        dbquery.add("LIMIT $limit")
        return this
    }

    fun selectMax(columnName: String): SQLQuery {
        dbquery.add("SELECT MAX", columnName)
        return this
    }

    fun selectMin(columnName: String): SQLQuery {
        dbquery.add("SELECT MIN", columnName)
        return this
    }

    fun or(columnName: String): SQLQuery {
        dbquery.add("OR", columnName)
        return this
    }

    fun orderBy(columnName: String): SQLQuery {
        dbquery.add("ORDER BY", columnName)
        return this
    }

    fun leftJoin(tableName: String): SQLQuery {
        dbquery.add("LEFT JOIN", tableName)
        return this
    }

    fun selectRound(columnName: String): SQLQuery {
        dbquery.add("SELECT ROUND",columnName)
        return this
    }

    fun select(vararg columnNames: String): SQLQuery {
        dbquery.add("SELECT", columnNames.joinToString(", "))
        return this
    }

    fun selectAll(): SQLQuery {
        dbquery.add("SELECT *")
        return this
    }

    fun selectDistinct(columnName: String): SQLQuery {
        dbquery.add("SELECT DISTINCT", "(",columnName, ")")
        return this
    }

    fun selectSum(columnName: String): SQLQuery {
        dbquery.add("SELECT SUM", columnName)
        return this
    }

    fun selectAvg(columnName: String): SQLQuery {
        dbquery.add("SELECT AVG", columnName)
        return this
    }

    fun update(tableName: String): SQLQuery {
        dbquery.add("UPDATE", tableName)
        return this
    }

    fun on(item: String): SQLQuery {
        dbquery.add("ON", item)
        return this
    }

    fun with(name: String): SQLQuery {
        dbquery.add("WITH", name)
        return this
    }

    fun deleteFrom(tableName: String): SQLQuery {
        dbquery.add("DELETE FROM", tableName)
        return this
    }

    fun from(tableName: String): SQLQuery {
        dbquery.add("FROM", tableName)
        return this
    }

    fun values(vararg values: Any): SQLQuery {

//        var qs []string
//        for _ = range values {
//            qs = append(qs, "?")
//        }
//
//
//        dbquery.add("VALUES", "(", strings.Join(qs, ", "), ")")
//        qb.values = append(qb.values, values...)

        return this
    }

    fun dropColumn(columnName: String): SQLQuery {
        dbquery.add("DROP COLUMN", columnName)
        return this
    }

    fun dropDatabase(databaseName: String): SQLQuery {
        dbquery.add("DROP DATABASE", databaseName)
        return this
    }

    fun dropTable(tableName: String): SQLQuery {
        dbquery.add("DROP TABLE", tableName)
        return this
    }
    fun dropTableIfExists(tableName: String): SQLQuery {
        dbquery.add("DROP TABLE IF EXISTS", tableName)
        return this
    }

    fun iN(vararg values: String): SQLQuery {

        dbquery.add("IN", "(")
        dbquery.add(values.joinToString(", "))
        dbquery.add(")")

        return this
    }

    fun union(): SQLQuery {
        dbquery.add("UNION")
        return this
    }

    fun unionAll(): SQLQuery {
        dbquery.add("UNION ALL")
        return this
    }

    fun exist(): SQLQuery {
        dbquery.add("EXISTS")
        return this
    }


    fun startSubquery(): SQLQuery {
        dbquery.add("(")
        return this
    }

    fun endSubquery(): SQLQuery {
        dbquery.add(")")
        return this
    }

    fun then(value: String): SQLQuery {
        dbquery.add("THEN", value)
        return this
    }

    fun eLse(value: String): SQLQuery {
        dbquery.add("ELSE", value)
        return this
    }

    fun end(): SQLQuery {
        dbquery.add("END")
        return this
    }

    fun wHen(columnName: String): SQLQuery {
        dbquery.add("WHEN", columnName)
        return this
    }


    fun build(): String {
        return dbquery.joinToString(" ") + ";"
    }

    fun execute(): Boolean {
        try {
            db.get().execSQL(this.build())
            return true
        } catch (e: SQLException){
            return false
        }

    }

    fun query() {

//        try {
//            db.get().(this.build())
//            return true
//        } catch (e: SQLException){
//            return false
//        }

//        return  1 as  T

//        query := qb.dbquery.String() + ";"
//
//        qb.dbquery.empty()
//
//        fmt.Println(query)
//
//        data := dbQuery(query, reflection.GetFieldsFunc(item))
//
//        return ModelFromArray(data, item)

    }


    fun empty() {
        values = mutableListOf()
        dbquery = mutableListOf()
    }
}
