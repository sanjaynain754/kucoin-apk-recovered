package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ReverseSequenceOptionsT {
    private int seqDim = 0;
    private int batchDim = 0;

    public int getBatchDim() {
        return this.batchDim;
    }

    public int getSeqDim() {
        return this.seqDim;
    }

    public void setBatchDim(int i11) {
        this.batchDim = i11;
    }

    public void setSeqDim(int i11) {
        this.seqDim = i11;
    }
}
