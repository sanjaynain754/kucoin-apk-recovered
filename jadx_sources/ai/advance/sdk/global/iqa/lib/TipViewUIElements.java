package ai.advance.sdk.global.iqa.lib;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class TipViewUIElements implements Serializable {

    /* JADX INFO: renamed from: a */
    private Integer f1001a;

    /* JADX INFO: renamed from: b */
    private Integer f1002b;

    /* JADX INFO: renamed from: c */
    private Integer f1003c;

    /* JADX INFO: renamed from: d */
    private Integer f1004d;

    /* JADX INFO: renamed from: e */
    private Integer f1005e;

    /* JADX INFO: renamed from: f */
    private Integer f1006f;

    /* JADX INFO: renamed from: g */
    private Float f1007g;

    /* JADX INFO: renamed from: h */
    private Float f1008h;

    public TipViewUIElements() {
    }

    public TipViewUIElements(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f11) {
        this.f1001a = num;
        this.f1002b = num2;
        this.f1003c = num3;
        this.f1004d = num4;
        this.f1005e = num5;
        this.f1006f = num6;
        this.f1007g = f11;
    }

    public Float getAspectRatio() {
        return this.f1008h;
    }

    public Integer getCardIncompleteDrawableResId() {
        return this.f1003c;
    }

    public Integer getCardOccludedDrawableResId() {
        return this.f1006f;
    }

    public Integer getCardPoorQualityDrawableResId() {
        return this.f1004d;
    }

    public Integer getCardTooSmallDrawableResId() {
        return this.f1002b;
    }

    public Integer getHoldSteadilyDrawableResId() {
        return this.f1005e;
    }

    public Integer getNoCardDrawableResId() {
        return this.f1001a;
    }

    public Float getViewWidthPercentRelativeToCameraView() {
        return this.f1007g;
    }

    public void setAspectRatio(Float f11) {
        this.f1008h = f11;
    }

    public void setCardIncompleteDrawableResId(Integer num) {
        this.f1003c = num;
    }

    public void setCardOccludedDrawableResId(Integer num) {
        this.f1006f = num;
    }

    public void setCardPoorQualityDrawableResId(Integer num) {
        this.f1004d = num;
    }

    public void setCardTooSmallDrawableResId(Integer num) {
        this.f1002b = num;
    }

    public void setHoldSteadilyDrawableResId(Integer num) {
        this.f1005e = num;
    }

    public void setNoCardDrawableResId(Integer num) {
        this.f1001a = num;
    }

    public void setViewWidthPercentRelativeToCameraView(Float f11) {
        this.f1007g = f11;
    }
}
