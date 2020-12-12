package com.martyx.junit.tdd.meetingApp.domain;

import sun.awt.image.ImageWatched;

import java.time.LocalDate;
import java.util.List;

public class StretnutiaNaDen {
    private LocalDate den;
    private List <Stretnutie> stretnutie;

    public LocalDate getDen() {
        return den;
    }

    public void setDen(LocalDate den) {
        this.den = den;
    }

    public List<Stretnutie> getStretnutie() {
        return stretnutie;
    }

    public void setStretnutie(List<Stretnutie> stretnutie) {
        this.stretnutie = stretnutie;
    }
}
