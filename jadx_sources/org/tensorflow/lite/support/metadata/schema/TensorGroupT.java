package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class TensorGroupT {
    private String name = null;
    private String[] tensorNames = null;

    public String getName() {
        return this.name;
    }

    public String[] getTensorNames() {
        return this.tensorNames;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTensorNames(String[] strArr) {
        this.tensorNames = strArr;
    }
}
