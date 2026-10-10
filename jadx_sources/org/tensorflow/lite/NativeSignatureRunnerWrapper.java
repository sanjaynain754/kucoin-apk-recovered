package org.tensorflow.lite;

/* JADX INFO: loaded from: classes61.dex */
final class NativeSignatureRunnerWrapper {
    private final long errorHandle;
    private boolean isMemoryAllocated = false;
    private final long signatureRunnerHandle;

    private static native void nativeAllocateTensors(long j11, long j12);

    private static native int nativeGetInputIndex(long j11, String str);

    private static native int nativeGetOutputIndex(long j11, String str);

    private static native long nativeGetSignatureRunner(long j11, String str);

    private static native int nativeGetSubgraphIndex(long j11);

    private static native String[] nativeInputNames(long j11);

    private static native void nativeInvoke(long j11, long j12);

    private static native String[] nativeOutputNames(long j11);

    private static native boolean nativeResizeInput(long j11, long j12, String str, int[] iArr);

    public boolean resizeInput(String str, int[] iArr) {
        this.isMemoryAllocated = false;
        return nativeResizeInput(this.signatureRunnerHandle, this.errorHandle, str, iArr);
    }

    public void allocateTensorsIfNeeded() {
        if (this.isMemoryAllocated) {
            return;
        }
        nativeAllocateTensors(this.signatureRunnerHandle, this.errorHandle);
        this.isMemoryAllocated = true;
    }

    public int getInputIndex(String str) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.signatureRunnerHandle, str);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new IllegalArgumentException("Input error: input " + str + " not found.");
    }

    public TensorImpl getInputTensor(String str) {
        return TensorImpl.fromSignatureInput(this.signatureRunnerHandle, str);
    }

    public int getOutputIndex(String str) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.signatureRunnerHandle, str);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new IllegalArgumentException("Input error: output " + str + " not found.");
    }

    public TensorImpl getOutputTensor(String str) {
        return TensorImpl.fromSignatureOutput(this.signatureRunnerHandle, str);
    }

    public int getSubgraphIndex() {
        return nativeGetSubgraphIndex(this.signatureRunnerHandle);
    }

    public String[] inputNames() {
        return nativeInputNames(this.signatureRunnerHandle);
    }

    public void invoke() {
        nativeInvoke(this.signatureRunnerHandle, this.errorHandle);
    }

    public String[] outputNames() {
        return nativeOutputNames(this.signatureRunnerHandle);
    }

    public NativeSignatureRunnerWrapper(long j11, long j12, String str) {
        this.errorHandle = j12;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(j11, str);
        this.signatureRunnerHandle = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner != -1) {
            return;
        }
        throw new IllegalArgumentException("Input error: Signature " + str + " not found.");
    }
}
