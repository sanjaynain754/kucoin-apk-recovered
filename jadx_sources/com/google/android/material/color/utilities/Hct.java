package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    public static Hct fromInt(int i11) {
        return new Hct(i11);
    }

    private void setInternalState(int i11) {
        this.argb = i11;
        Cam16 cam16FromInt = Cam16.fromInt(i11);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i11);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public void setChroma(double d11) {
        setInternalState(HctSolver.solveToInt(this.hue, d11, this.tone));
    }

    public void setHue(double d11) {
        setInternalState(HctSolver.solveToInt(d11, this.chroma, this.tone));
    }

    public void setTone(double d11) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d11));
    }

    public int toInt() {
        return this.argb;
    }

    private Hct(int i11) {
        setInternalState(i11);
    }

    public static Hct from(double d11, double d12, double d13) {
        return new Hct(HctSolver.solveToInt(d11, d12, d13));
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }
}
