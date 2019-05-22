package khai.data.lab7.repositories

import khai.data.lab7.entities.Student
import org.springframework.data.repository.CrudRepository

interface StudentRepository: CrudRepository<Student, Long>