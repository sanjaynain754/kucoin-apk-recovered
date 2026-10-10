package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class DimensionMetadataT {
    private byte format = 0;
    private int denseSize = 0;
    private SparseIndexVectorUnion arraySegments = null;
    private SparseIndexVectorUnion arrayIndices = null;

    public SparseIndexVectorUnion getArrayIndices() {
        return this.arrayIndices;
    }

    public SparseIndexVectorUnion getArraySegments() {
        return this.arraySegments;
    }

    public int getDenseSize() {
        return this.denseSize;
    }

    public byte getFormat() {
        return this.format;
    }

    public void setArrayIndices(SparseIndexVectorUnion sparseIndexVectorUnion) {
        this.arrayIndices = sparseIndexVectorUnion;
    }

    public void setArraySegments(SparseIndexVectorUnion sparseIndexVectorUnion) {
        this.arraySegments = sparseIndexVectorUnion;
    }

    public void setDenseSize(int i11) {
        this.denseSize = i11;
    }

    public void setFormat(byte b11) {
        this.format = b11;
    }
}
