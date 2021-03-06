/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;
import java.util.List;

import edu.infsci2560.models.InfoArm;
import org.springframework.data.repository.PagingAndSortingRepository;
import javax.transaction.Transactional;

/**
 *
 * @author kolobj
 */
public interface InfoArmRepository extends PagingAndSortingRepository<InfoArm, Long> {
    @Transactional
    public long deleteById(Long id);
    public InfoArm findById(Long id);
}
