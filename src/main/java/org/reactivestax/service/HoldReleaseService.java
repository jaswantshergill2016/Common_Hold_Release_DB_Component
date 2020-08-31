package org.reactivestax.service;


import org.reactivestax.domain.HoldRelease;
import org.reactivestax.repository.HoldReleaseRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Data
@NoArgsConstructor
public class HoldReleaseService {
    //@Autowired
    //@Qualifier("myDAO")
    @Autowired
    private HoldReleaseRepository holdReleaseRepository;


    public void saveHoldReleaseInfo(HoldRelease holdRelease){

        holdReleaseRepository.save(holdRelease);
    }

    public List<HoldRelease> findByReason(String reason){

        return holdReleaseRepository.findByReason(reason);
    }

    public List<HoldRelease> findByReasonAndNextStep(String reason, String nextStep){
        return holdReleaseRepository.findByReasonAndNextStep(reason,nextStep);
    }

}
