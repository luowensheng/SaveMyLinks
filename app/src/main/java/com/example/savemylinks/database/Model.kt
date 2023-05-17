package com.example.savemylinks.database

interface Collection {}



object Database {

    open inline fun <reified T:Collection> selectAll(): String  {
        val table = T::class.java
        val query = SQLQuery().selectAll().from(table.name).query()
        return "select * from ${table.name};"
    }
    inline fun <reified T:Collection> getById(id: String): String  {
        val table = T::class.java
        val query = SQLQuery().selectAll().iN(table.name).where("id").equals(id)
        return "select * in ${table.name} where id = $id;"
    }
//    inline fun <reified T:Collection> getBy(columnName: String, operation:Operation, value: String): String {
//        val table = T::class.java
//        try {
//            table.getField("columnName")
//        }catch(e: NoSuchFieldException){
//
//        }
//        val query = SQLQuery().selectAll().iN(table.name).where(co).equals(id)
//        return "select * in ${table.name} where $columnName $operation $value;"
//    }
    inline fun <reified T:Collection> updateById(id: String, columnName: String, value: String): String {
        val table = T::class.java
        return "Update ${table.name} set $columnName = $value where id = $id;"
    }
    inline fun <reified T:Collection> deleteById(id: String): String  {
        val table = T::class.java
        return "delete from ${table.name} where $id = id;"
    }
    inline fun <reified T:Collection> add(item: T): String  {
        val table = T::class.java
        var columns = mutableListOf<String>()
        var values = mutableListOf<String>()
        table.declaredFields.forEach {
            if (!it.isAccessible) return@forEach
            columns.add(it.name)
            values.add(it.get(item).toString())
        }
        return "insert into ${table.name} (${columns.joinToString(", ")}) values (${values.joinToString(", ")});"
    }

}
//
//class ViewModel<T: Model> {
//    companion object {
//
//    }
//}
