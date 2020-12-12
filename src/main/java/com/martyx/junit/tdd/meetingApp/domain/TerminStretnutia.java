package com.martyx.junit.tdd.meetingApp.domain;

import java.time.Duration;
import java.time.LocalTime;

public class TerminStretnutia {
    private LocalTime cas;
    private Duration dlzka;

    public LocalTime getCas() {
        return cas;
    }

    public Duration getDlzka() {
        return dlzka;
    }
}
