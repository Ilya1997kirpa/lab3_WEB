package khai.data.lab7.controllers

import khai.data.lab7.entities.Student
import khai.data.lab7.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/student")
class StudentController(@Autowired val studentRepo: StudentRepository) {

    @GetMapping("/init")
    fun createStudents(): String {
        studentRepo.save(Student(0,"Илья", "Телекоммуникации и радиотехника", "Построение телекоммуникационных систем", 93, "A",true, "Чай"))
        studentRepo.save(Student(1,"Владимир", "Компьютерная инженерия", "Особенности процессов компьютеризации", 85, "B", true,"Кофе"))
        studentRepo.save(Student(2,"Тимофей", "Транспортные технологии", "Математические и информационные методы моделирования транспортных процессов", 55, "F", false, "Вода"))
        return "Все записи успешно добавлены"
    }

    @GetMapping("/all")
    fun allStudents() = studentRepo.findAll()


}