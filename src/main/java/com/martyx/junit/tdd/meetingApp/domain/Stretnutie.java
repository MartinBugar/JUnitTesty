package com.martyx.junit.tdd.meetingApp.domain;

public class Stretnutie {
    private TerminStretnutia terminStretnutia;
    private Klient klient;

    public TerminStretnutia getTerminStretnutia() {
        return terminStretnutia;
    }

    public void setTerminStretnutia(TerminStretnutia terminStretnutia) {
        this.terminStretnutia = terminStretnutia;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
