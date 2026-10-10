package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SparsityParametersT {
    private int[] traversalOrder = null;
    private int[] blockMap = null;
    private DimensionMetadataT[] dimMetadata = null;

    public int[] getBlockMap() {
        return this.blockMap;
    }

    public DimensionMetadataT[] getDimMetadata() {
        return this.dimMetadata;
    }

    public int[] getTraversalOrder() {
        return this.traversalOrder;
    }

    public void setBlockMap(int[] iArr) {
        this.blockMap = iArr;
    }

    public void setDimMetadata(DimensionMetadataT[] dimensionMetadataTArr) {
        this.dimMetadata = dimensionMetadataTArr;
    }

    public void setTraversalOrder(int[] iArr) {
        this.traversalOrder = iArr;
    }
}
