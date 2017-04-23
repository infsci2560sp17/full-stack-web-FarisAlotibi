package edu.infsci2560.repositories;

import edu.infsci2560.models.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import javax.transaction.Transactional;
/**
 *
 * @author faris
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

    @Transactional
    public long deleteById(Long id);
    Course findById(Long id);
}