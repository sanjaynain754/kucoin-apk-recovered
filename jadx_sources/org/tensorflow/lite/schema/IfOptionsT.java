package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class IfOptionsT {
    private int thenSubgraphIndex = 0;
    private int elseSubgraphIndex = 0;

    public int getElseSubgraphIndex() {
        return this.elseSubgraphIndex;
    }

    public int getThenSubgraphIndex() {
        return this.thenSubgraphIndex;
    }

    public void setElseSubgraphIndex(int i11) {
        this.elseSubgraphIndex = i11;
    }

    public void setThenSubgraphIndex(int i11) {
        this.thenSubgraphIndex = i11;
    }
}
