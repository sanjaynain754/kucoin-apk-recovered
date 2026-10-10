package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SubGraphT {
    private TensorT[] tensors = null;
    private int[] inputs = null;
    private int[] outputs = null;
    private OperatorT[] operators = null;
    private String name = null;

    public int[] getInputs() {
        return this.inputs;
    }

    public String getName() {
        return this.name;
    }

    public OperatorT[] getOperators() {
        return this.operators;
    }

    public int[] getOutputs() {
        return this.outputs;
    }

    public TensorT[] getTensors() {
        return this.tensors;
    }

    public void setInputs(int[] iArr) {
        this.inputs = iArr;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOperators(OperatorT[] operatorTArr) {
        this.operators = operatorTArr;
    }

    public void setOutputs(int[] iArr) {
        this.outputs = iArr;
    }

    public void setTensors(TensorT[] tensorTArr) {
        this.tensors = tensorTArr;
    }
}
