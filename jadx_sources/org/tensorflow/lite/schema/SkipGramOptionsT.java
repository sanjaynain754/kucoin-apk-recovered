package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SkipGramOptionsT {
    private int ngramSize = 0;
    private int maxSkipSize = 0;
    private boolean includeAllNgrams = false;

    public boolean getIncludeAllNgrams() {
        return this.includeAllNgrams;
    }

    public int getMaxSkipSize() {
        return this.maxSkipSize;
    }

    public int getNgramSize() {
        return this.ngramSize;
    }

    public void setIncludeAllNgrams(boolean z11) {
        this.includeAllNgrams = z11;
    }

    public void setMaxSkipSize(int i11) {
        this.maxSkipSize = i11;
    }

    public void setNgramSize(int i11) {
        this.ngramSize = i11;
    }
}
