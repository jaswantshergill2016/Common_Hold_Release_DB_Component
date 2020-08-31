package org.reactivestax.repository;


import org.reactivestax.domain.HoldRelease;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository//("myDAO")

public interface HoldReleaseRepository extends CrudRepository<HoldRelease,Integer>{

    List<HoldRelease> findByReason(String reason);

    List<HoldRelease> findByReasonAndNextStep(String reason, String nextStep);
}

