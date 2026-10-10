package com.kubi.resources.widget.lockview;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class Dot implements Serializable {
    private int index;
    private boolean isSelected;

    /* JADX INFO: renamed from: x */
    private float f44942x;

    /* JADX INFO: renamed from: y */
    private float f44943y;

    public int getIndex() {
        return this.index;
    }

    public float getX() {
        return this.f44942x;
    }

    public float getY() {
        return this.f44943y;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setIndex(int i11) {
        this.index = i11;
    }

    public void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    public void setX(float f11) {
        this.f44942x = f11;
    }

    public void setY(float f11) {
        this.f44943y = f11;
    }

    public Dot(float f11, float f12, int i11) {
        this.f44942x = f11;
        this.f44943y = f12;
        this.index = i11;
    }
}
