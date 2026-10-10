package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class StridedSliceOptionsT {
    private int beginMask = 0;
    private int endMask = 0;
    private int ellipsisMask = 0;
    private int newAxisMask = 0;
    private int shrinkAxisMask = 0;
    private boolean offset = false;

    public int getBeginMask() {
        return this.beginMask;
    }

    public int getEllipsisMask() {
        return this.ellipsisMask;
    }

    public int getEndMask() {
        return this.endMask;
    }

    public int getNewAxisMask() {
        return this.newAxisMask;
    }

    public boolean getOffset() {
        return this.offset;
    }

    public int getShrinkAxisMask() {
        return this.shrinkAxisMask;
    }

    public void setBeginMask(int i11) {
        this.beginMask = i11;
    }

    public void setEllipsisMask(int i11) {
        this.ellipsisMask = i11;
    }

    public void setEndMask(int i11) {
        this.endMask = i11;
    }

    public void setNewAxisMask(int i11) {
        this.newAxisMask = i11;
    }

    public void setOffset(boolean z11) {
        this.offset = z11;
    }

    public void setShrinkAxisMask(int i11) {
        this.shrinkAxisMask = i11;
    }
}
