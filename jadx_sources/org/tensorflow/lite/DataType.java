package org.tensorflow.lite;

/* JADX INFO: loaded from: classes61.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);

    private final int value;

    /* JADX INFO: renamed from: c */
    public int m95360c() {
        return this.value;
    }

    DataType(int i11) {
        this.value = i11;
    }

    public int byteSize() {
        switch (this) {
            case FLOAT32:
            case INT32:
                return 4;
            case UINT8:
            case INT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
            case BOOL:
                return -1;
            case INT16:
                return 2;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
