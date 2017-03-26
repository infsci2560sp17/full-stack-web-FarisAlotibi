/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.Certification;
import org.springframework.data.repository.PagingAndSortingRepository;
import javax.transaction.Transactional;
/**
 *
 * @author faris
 */
public interface CertificationRepository extends PagingAndSortingRepository<Certification, Long> {

    @Transactional
    public long deleteById(Long id);
    public Certification findById(Long id);
}
