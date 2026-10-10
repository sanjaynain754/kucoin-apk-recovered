package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class TensorT {
    private int[] shape = null;
    private byte type = 0;
    private long buffer = 0;
    private String name = null;
    private QuantizationParametersT quantization = null;
    private boolean isVariable = false;
    private SparsityParametersT sparsity = null;
    private int[] shapeSignature = null;
    private boolean hasRank = false;
    private VariantSubTypeT[] variantTensors = null;

    public long getBuffer() {
        return this.buffer;
    }

    public boolean getHasRank() {
        return this.hasRank;
    }

    public boolean getIsVariable() {
        return this.isVariable;
    }

    public String getName() {
        return this.name;
    }

    public QuantizationParametersT getQuantization() {
        return this.quantization;
    }

    public int[] getShape() {
        return this.shape;
    }

    public int[] getShapeSignature() {
        return this.shapeSignature;
    }

    public SparsityParametersT getSparsity() {
        return this.sparsity;
    }

    public byte getType() {
        return this.type;
    }

    public VariantSubTypeT[] getVariantTensors() {
        return this.variantTensors;
    }

    public void setBuffer(long j11) {
        this.buffer = j11;
    }

    public void setHasRank(boolean z11) {
        this.hasRank = z11;
    }

    public void setIsVariable(boolean z11) {
        this.isVariable = z11;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setQuantization(QuantizationParametersT quantizationParametersT) {
        this.quantization = quantizationParametersT;
    }

    public void setShape(int[] iArr) {
        this.shape = iArr;
    }

    public void setShapeSignature(int[] iArr) {
        this.shapeSignature = iArr;
    }

    public void setSparsity(SparsityParametersT sparsityParametersT) {
        this.sparsity = sparsityParametersT;
    }

    public void setType(byte b11) {
        this.type = b11;
    }

    public void setVariantTensors(VariantSubTypeT[] variantSubTypeTArr) {
        this.variantTensors = variantSubTypeTArr;
    }
}
