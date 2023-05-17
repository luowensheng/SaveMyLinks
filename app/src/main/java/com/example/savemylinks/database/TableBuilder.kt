package com.example.savemylinks.database

class TableBuilder {

    private var queryString: MutableList<String>
    private var isFirstInput: Boolean

    constructor(){
        this.isFirstInput = true
        this.queryString= mutableListOf()
    }

    private fun addSeparator() {
        if (!isFirstInput) {
            queryString.add(",")
        }
        isFirstInput = false
    }

    fun column(name: String): TableBuilder {
        addSeparator()
        queryString.add(name)
        return this
    }

    fun int(): TableBuilder {
        queryString.add("INT")
        return this
    }

    fun integer(): TableBuilder {
        queryString.add("INTEGER")
        return this
    }

    fun primaryKey(): TableBuilder {
        queryString.add("PRIMARY KEY")
        return this
    }

    fun varchar(length: Integer): TableBuilder {
        queryString.add("VARCHAR $length")
        return this
    }

    fun real(): TableBuilder {
        queryString.add("REAL")
        return this
    }

    fun blob(): TableBuilder {
        queryString.add("BLOB")
        return this
    }


    fun isNull(): TableBuilder {
        queryString.add("NULL")
        return this
    }

    fun unique(): TableBuilder {
        queryString.add("UNIQUE")
        return this
    }

    fun notNull(): TableBuilder {
        queryString.add("NOT NULL")
        return this
    }

    fun autoIncrement(): TableBuilder {
        queryString.add("AUTOINCREMENT")
        return this
    }

    fun date(): TableBuilder {
        queryString.add("DATE")
        return this
    }

    fun timestamp(): TableBuilder {
        queryString.add("TIMESTAMP")
        return this
    }

    fun default(): TableBuilder {
        queryString.add("DEFAULT")
        return this
    }

    fun currentTimestamp(): TableBuilder {
        queryString.add("CURRENT TIMESTAMP")
        return this
    }

    fun fAlse(): TableBuilder {
        queryString.add("FALSE")
        return this
    }

    fun boolean(): TableBuilder {
        queryString.add("BOOLEAN")
        return this
    }

    fun foreignKey(): TableBuilder {
        queryString.add("FOREIGN KEY")
        return this
    }

    fun references(): TableBuilder {
        queryString.add("REFERENCES")
        return this
    }

    fun onUpdate(): TableBuilder {
        queryString.add("ON UPDATE")
        return this
    }

    fun onDelete(): TableBuilder {
        queryString.add("ON DELETE")
        return this
    }

    fun cascade(): TableBuilder {
        queryString.add("CASCADE")
        return this
    }

    fun text(): TableBuilder {
        queryString.add("TEXT")
        return this
    }

    fun datetime(): TableBuilder {
        queryString.add("DATETIME")
        return this
    }

    fun double(): TableBuilder {
        queryString.add("DOUBLE")
        return this
    }

    fun bigInt(): TableBuilder {
        queryString.add("BIGINT")
        return this
    }

    fun build(): String {
        return "(  ${queryString.joinToString(" ") } )"
    }

}