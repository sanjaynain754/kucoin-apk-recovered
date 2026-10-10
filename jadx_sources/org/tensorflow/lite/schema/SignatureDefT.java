package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SignatureDefT {
    private TensorMapT[] inputs = null;
    private TensorMapT[] outputs = null;
    private String signatureKey = null;
    private long subgraphIndex = 0;

    public TensorMapT[] getInputs() {
        return this.inputs;
    }

    public TensorMapT[] getOutputs() {
        return this.outputs;
    }

    public String getSignatureKey() {
        return this.signatureKey;
    }

    public long getSubgraphIndex() {
        return this.subgraphIndex;
    }

    public void setInputs(TensorMapT[] tensorMapTArr) {
        this.inputs = tensorMapTArr;
    }

    public void setOutputs(TensorMapT[] tensorMapTArr) {
        this.outputs = tensorMapTArr;
    }

    public void setSignatureKey(String str) {
        this.signatureKey = str;
    }

    public void setSubgraphIndex(long j11) {
        this.subgraphIndex = j11;
    }
}
