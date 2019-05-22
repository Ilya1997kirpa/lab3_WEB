package khai.data.lab7.entities

abstract class Master(val speciality: String) {

    abstract fun learn()

    open fun learn_now(discipline: String) {
        println("Learning new discipline: $discipline...")
    }

}