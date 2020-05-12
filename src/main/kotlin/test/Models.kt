package test


class Student(var studentId: Int = 0, var studentName: String ="") {
    var id: Int
    var name : String

    init {
        id = studentId
        name = studentName
    }

    override fun toString(): String = "$id : $name"
}