package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class VariantSubTypeT {
    private int[] shape = null;
    private byte type = 0;
    private boolean hasRank = false;

    public boolean getHasRank() {
        return this.hasRank;
    }

    public int[] getShape() {
        return this.shape;
    }

    public byte getType() {
        return this.type;
    }

    public void setHasRank(boolean z11) {
        this.hasRank = z11;
    }

    public void setShape(int[] iArr) {
        this.shape = iArr;
    }

    public void setType(byte b11) {
        this.type = b11;
    }
}
