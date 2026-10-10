package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class BoundingBoxPropertiesT {
    private long[] index = null;
    private byte type = 0;
    private byte coordinateType = 0;

    public byte getCoordinateType() {
        return this.coordinateType;
    }

    public long[] getIndex() {
        return this.index;
    }

    public byte getType() {
        return this.type;
    }

    public void setCoordinateType(byte b11) {
        this.coordinateType = b11;
    }

    public void setIndex(long[] jArr) {
        this.index = jArr;
    }

    public void setType(byte b11) {
        this.type = b11;
    }
}
