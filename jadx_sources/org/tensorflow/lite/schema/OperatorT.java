package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class OperatorT {
    private long opcodeIndex = 0;
    private int[] inputs = null;
    private int[] outputs = null;
    private BuiltinOptionsUnion builtinOptions = null;
    private int[] customOptions = null;
    private byte customOptionsFormat = 0;
    private boolean[] mutatingVariableInputs = null;
    private int[] intermediates = null;

    public BuiltinOptionsUnion getBuiltinOptions() {
        return this.builtinOptions;
    }

    public int[] getCustomOptions() {
        return this.customOptions;
    }

    public byte getCustomOptionsFormat() {
        return this.customOptionsFormat;
    }

    public int[] getInputs() {
        return this.inputs;
    }

    public int[] getIntermediates() {
        return this.intermediates;
    }

    public boolean[] getMutatingVariableInputs() {
        return this.mutatingVariableInputs;
    }

    public long getOpcodeIndex() {
        return this.opcodeIndex;
    }

    public int[] getOutputs() {
        return this.outputs;
    }

    public void setBuiltinOptions(BuiltinOptionsUnion builtinOptionsUnion) {
        this.builtinOptions = builtinOptionsUnion;
    }

    public void setCustomOptions(int[] iArr) {
        this.customOptions = iArr;
    }

    public void setCustomOptionsFormat(byte b11) {
        this.customOptionsFormat = b11;
    }

    public void setInputs(int[] iArr) {
        this.inputs = iArr;
    }

    public void setIntermediates(int[] iArr) {
        this.intermediates = iArr;
    }

    public void setMutatingVariableInputs(boolean[] zArr) {
        this.mutatingVariableInputs = zArr;
    }

    public void setOpcodeIndex(long j11) {
        this.opcodeIndex = j11;
    }

    public void setOutputs(int[] iArr) {
        this.outputs = iArr;
    }
}
