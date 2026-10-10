package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class HashtableOptionsT {
    private int tableId = 0;
    private byte keyDtype = 0;
    private byte valueDtype = 0;

    public byte getKeyDtype() {
        return this.keyDtype;
    }

    public int getTableId() {
        return this.tableId;
    }

    public byte getValueDtype() {
        return this.valueDtype;
    }

    public void setKeyDtype(byte b11) {
        this.keyDtype = b11;
    }

    public void setTableId(int i11) {
        this.tableId = i11;
    }

    public void setValueDtype(byte b11) {
        this.valueDtype = b11;
    }
}
