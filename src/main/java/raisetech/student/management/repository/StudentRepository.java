package raisetech.student.management.repository;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.data.Student;

@Mapper
public interface StudentRepository {
  @Select("SELECT * FROM students ")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<StudentsCourses> searchStudentsCourses();

  @Insert("INSERT INTO students (id, name, kana_name, email) VALUES (#{id}, #{name}, #{kanaName}, #{email})")
  void registerStudent(Student student);

}
