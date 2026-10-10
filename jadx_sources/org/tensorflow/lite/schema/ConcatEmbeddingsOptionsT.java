package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ConcatEmbeddingsOptionsT {
    private int numChannels = 0;
    private int[] numColumnsPerChannel = null;
    private int[] embeddingDimPerChannel = null;

    public int[] getEmbeddingDimPerChannel() {
        return this.embeddingDimPerChannel;
    }

    public int getNumChannels() {
        return this.numChannels;
    }

    public int[] getNumColumnsPerChannel() {
        return this.numColumnsPerChannel;
    }

    public void setEmbeddingDimPerChannel(int[] iArr) {
        this.embeddingDimPerChannel = iArr;
    }

    public void setNumChannels(int i11) {
        this.numChannels = i11;
    }

    public void setNumColumnsPerChannel(int[] iArr) {
        this.numColumnsPerChannel = iArr;
    }
}
