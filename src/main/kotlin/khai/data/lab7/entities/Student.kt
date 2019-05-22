package khai.data.lab7.entities

import javax.persistence.*

@Entity
@Table(name = "students")
data class Student(

        @Id
        @GeneratedValue
        val id_student: Int = 0,
        val name: String,
        val speciality: String,
        val study: String,
                val ECTS: Int,
        val mark: String,
        var pass: Boolean,
        val drink_something: String) {

        private constructor() : this(0, "","", "", 0, "", false,"")

}


