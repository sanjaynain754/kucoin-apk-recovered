package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class WhileOptionsT {
    private int condSubgraphIndex = 0;
    private int bodySubgraphIndex = 0;

    public int getBodySubgraphIndex() {
        return this.bodySubgraphIndex;
    }

    public int getCondSubgraphIndex() {
        return this.condSubgraphIndex;
    }

    public void setBodySubgraphIndex(int i11) {
        this.bodySubgraphIndex = i11;
    }

    public void setCondSubgraphIndex(int i11) {
        this.condSubgraphIndex = i11;
    }
}
