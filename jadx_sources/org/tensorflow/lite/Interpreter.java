package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes61.dex */
public final class Interpreter extends InterpreterImpl implements InterpreterApi {
    private final NativeInterpreterWrapperExperimental wrapperExperimental;

    public static class Options extends InterpreterImpl.Options {
        public Options() {
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegate(Delegate delegate) {
            super.addDelegate(delegate);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            super.addDelegateFactory(delegateFactory);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setCancellable(boolean z11) {
            super.setCancellable(z11);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setNumThreads(int i11) {
            super.setNumThreads(i11);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            super.setRuntime(tfLiteRuntime);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseNNAPI(boolean z11) {
            super.setUseNNAPI(z11);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseXNNPACK(boolean z11) {
            super.setUseXNNPACK(z11);
            return this;
        }

        public Options(InterpreterImpl.Options options) {
            super(options);
        }

        public Options setAllowBufferHandleOutput(boolean z11) {
            this.allowBufferHandleOutput = Boolean.valueOf(z11);
            return this;
        }

        @Deprecated
        public Options setAllowFp16PrecisionForFp32(boolean z11) {
            this.allowFp16PrecisionForFp32 = Boolean.valueOf(z11);
            return this;
        }
    }

    public Interpreter(File file) {
        this(file, (Options) null);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i11, int[] iArr) {
        super.resizeInput(i11, iArr);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2) {
        super.runSignature(map, map2);
    }

    public Interpreter(File file, Options options) {
        this(new NativeInterpreterWrapperExperimental(file.getAbsolutePath(), options));
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i11, int[] iArr, boolean z11) {
        super.resizeInput(i11, iArr, z11);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2, String str) {
        super.runSignature(map, map2, str);
    }

    public void setCancelled(boolean z11) {
        this.wrapper.setCancelled(z11);
    }

    public Interpreter(ByteBuffer byteBuffer) {
        this(byteBuffer, (Options) null);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputIndex(String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensor(int i11) {
        return super.getInputTensor(i11);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensorFromSignature(String str, String str2) {
        return super.getInputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputIndex(String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensor(int i11) {
        return super.getOutputTensor(i11);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensorFromSignature(String str, String str2) {
        return super.getOutputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureInputs(String str) {
        return super.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureKeys() {
        return super.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureOutputs(String str) {
        return super.getSignatureOutputs(str);
    }

    public void resetVariableTensors() {
        checkNotClosed();
        this.wrapperExperimental.resetVariableTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void run(Object obj, Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    public Interpreter(ByteBuffer byteBuffer, Options options) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private Interpreter(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.wrapperExperimental = nativeInterpreterWrapperExperimental;
    }
}
