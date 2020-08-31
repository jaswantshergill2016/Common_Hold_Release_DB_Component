package org.reactivestax.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HoldRelease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer holdReleaseId;
    private Integer transactionId;
    private String reason;
    private String nextStep;
    @Column( length = 100000 )
    private String payload ;
    private LocalDateTime timeReceived = LocalDateTime.now();
    private LocalDateTime timeProcessed;

    public HoldRelease(Integer transactionId, String reason, String nextStep, String payload, LocalDateTime timeProcessed) {
        this.transactionId = transactionId;
        this.reason = reason;
        this.nextStep = nextStep;
        this.payload = payload;
        this.timeReceived = timeReceived;
        this.timeProcessed = timeProcessed;
    }

    @Override
    public String toString() {
        return "HoldRelease{" +
                "holdReleaseId=" + holdReleaseId +
                ", transactionId=" + transactionId +
                ", reason='" + reason + '\'' +
                ", nextStep='" + nextStep + '\'' +
                ", payload='" + payload + '\'' +
                ", timeReceived=" + timeReceived +
                ", timeProcessed=" + timeProcessed +
                '}';
    }
}



