package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class CustomMetadataT {
    private String name = null;
    private int[] data = null;

    public int[] getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public void setData(int[] iArr) {
        this.data = iArr;
    }

    public void setName(String str) {
        this.name = str;
    }
}
