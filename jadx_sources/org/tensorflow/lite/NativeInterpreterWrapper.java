package org.tensorflow.lite;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes61.dex */
class NativeInterpreterWrapper implements AutoCloseable {
    private static final int ERROR_BUFFER_SIZE = 512;
    private static final RuntimeFlavor RUNTIME_FLAVOR = RuntimeFlavor.APPLICATION;
    private long cancellationFlagHandle;
    private final List<Delegate> delegates;
    long errorHandle;

    @UsedByReflection("nativeinterpreterwrapper_jni.cc")
    private long inferenceDurationNanoseconds;
    private TensorImpl[] inputTensors;
    private Map<String, Integer> inputsIndexes;
    long interpreterHandle;
    private boolean isMemoryAllocated;
    private ByteBuffer modelByteBuffer;
    private long modelHandle;
    private boolean originalGraphHasUnresolvedFlexOp;
    private TensorImpl[] outputTensors;
    private Map<String, Integer> outputsIndexes;
    private final List<Delegate> ownedDelegates;
    private Map<String, NativeSignatureRunnerWrapper> signatureRunnerMap;

    public NativeInterpreterWrapper(String str) {
        this(str, (InterpreterImpl.Options) null);
    }

    private static native long allocateTensors(long j11, long j12);

    private static native void allowBufferHandleOutput(long j11, boolean z11);

    private static native void allowFp16PrecisionForFp32(long j11, boolean z11);

    private static native long createCancellationFlag(long j11);

    private static native long createErrorReporter(int i11);

    private static native long createInterpreter(long j11, long j12, int i11, boolean z11, List<Long> list);

    private static native long createModel(String str, long j11);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j11);

    private static native void delete(long j11, long j12, long j13);

    private static native long deleteCancellationFlag(long j11);

    private static native int getExecutionPlanLength(long j11);

    private static native int getInputCount(long j11);

    private static native String[] getInputNames(long j11);

    private static native int getInputTensorIndex(long j11, int i11);

    private static native int getOutputCount(long j11);

    private static native String[] getOutputNames(long j11);

    private static native int getOutputTensorIndex(long j11, int i11);

    private static native String[] getSignatureKeys(long j11);

    private static native boolean hasUnresolvedFlexOp(long j11);

    private void init(long j11, long j12, InterpreterImpl.Options options) {
        long j13;
        InterpreterImpl.Options options2 = options == null ? new InterpreterImpl.Options() : options;
        if (options2.getAccelerationConfig() != null) {
            options2.getAccelerationConfig().apply(options2);
        }
        this.errorHandle = j11;
        this.modelHandle = j12;
        ArrayList arrayList = new ArrayList();
        long jCreateInterpreter = createInterpreter(j12, j11, options2.getNumThreads(), options2.getUseXNNPACK(), arrayList);
        this.interpreterHandle = jCreateInterpreter;
        this.originalGraphHasUnresolvedFlexOp = hasUnresolvedFlexOp(jCreateInterpreter);
        addDelegates(options2);
        initDelegatesWithInterpreterFactory();
        arrayList.ensureCapacity(this.delegates.size());
        Iterator<Delegate> it = this.delegates.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getNativeHandle()));
        }
        if (arrayList.isEmpty()) {
            j13 = j11;
        } else {
            delete(0L, 0L, this.interpreterHandle);
            j13 = j11;
            this.interpreterHandle = createInterpreter(j12, j13, options2.getNumThreads(), options2.getUseXNNPACK(), arrayList);
        }
        Boolean bool = options2.allowFp16PrecisionForFp32;
        if (bool != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool.booleanValue());
        }
        Boolean bool2 = options2.allowBufferHandleOutput;
        if (bool2 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool2.booleanValue());
        }
        if (options2.isCancellable()) {
            this.cancellationFlagHandle = createCancellationFlag(this.interpreterHandle);
        }
        this.inputTensors = new TensorImpl[getInputCount(this.interpreterHandle)];
        this.outputTensors = new TensorImpl[getOutputCount(this.interpreterHandle)];
        Boolean bool3 = options2.allowFp16PrecisionForFp32;
        if (bool3 != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool3.booleanValue());
        }
        Boolean bool4 = options2.allowBufferHandleOutput;
        if (bool4 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool4.booleanValue());
        }
        allocateTensors(this.interpreterHandle, j13);
        this.isMemoryAllocated = true;
    }

    private static Delegate maybeCreateFlexDelegate(List<Delegate> list) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator<Delegate> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (Delegate) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private static native boolean resizeInput(long j11, long j12, int i11, int[] iArr, boolean z11);

    private static native void run(long j11, long j12);

    private static native void setCancelled(long j11, long j12, boolean z11);

    public void allocateTensors() {
        allocateTensorsIfNeeded();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i11 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i11 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i11];
            if (tensorImpl != null) {
                tensorImpl.close();
                this.inputTensors[i11] = null;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.outputTensors;
            if (i12 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i12];
            if (tensorImpl2 != null) {
                tensorImpl2.close();
                this.outputTensors[i12] = null;
            }
            i12++;
        }
        this.delegates.clear();
        Iterator<Delegate> it = this.ownedDelegates.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.ownedDelegates.clear();
        delete(this.errorHandle, this.modelHandle, this.interpreterHandle);
        deleteCancellationFlag(this.cancellationFlagHandle);
        this.errorHandle = 0L;
        this.modelHandle = 0L;
        this.interpreterHandle = 0L;
        this.cancellationFlagHandle = 0L;
        this.modelByteBuffer = null;
        this.inputsIndexes = null;
        this.outputsIndexes = null;
        this.isMemoryAllocated = false;
    }

    public int getExecutionPlanLength() {
        return getExecutionPlanLength(this.interpreterHandle);
    }

    public TensorImpl getInputTensor(int i11) {
        if (i11 >= 0) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i11 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i11];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j11 = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j11, getInputTensorIndex(j11, i11));
                tensorImplArr[i11] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i11);
    }

    public TensorImpl getOutputTensor(int i11) {
        if (i11 >= 0) {
            TensorImpl[] tensorImplArr = this.outputTensors;
            if (i11 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i11];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j11 = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j11, getOutputTensorIndex(j11, i11));
                tensorImplArr[i11] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i11);
    }

    public String[] getSignatureKeys() {
        return getSignatureKeys(this.interpreterHandle);
    }

    public void resizeInput(int i11, int[] iArr) {
        resizeInput(i11, iArr, false);
    }

    public void run(Object[] objArr, Map<Integer, Object> map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        for (int i11 = 0; i11 < objArr.length; i11++) {
            int[] inputShapeIfDifferent = getInputTensor(i11).getInputShapeIfDifferent(objArr[i11]);
            if (inputShapeIfDifferent != null) {
                resizeInput(i11, inputShapeIfDifferent);
            }
        }
        boolean zAllocateTensorsIfNeeded = allocateTensorsIfNeeded();
        for (int i12 = 0; i12 < objArr.length; i12++) {
            getInputTensor(i12).setTo(objArr[i12]);
        }
        long jNanoTime = System.nanoTime();
        run(this.interpreterHandle, this.errorHandle);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (zAllocateTensorsIfNeeded) {
            for (TensorImpl tensorImpl : this.outputTensors) {
                if (tensorImpl != null) {
                    tensorImpl.refreshShape();
                }
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                getOutputTensor(entry.getKey().intValue()).copyTo(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public void setCancelled(boolean z11) {
        long j11 = this.cancellationFlagHandle;
        if (j11 == 0) {
            throw new IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        setCancelled(this.interpreterHandle, j11, z11);
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer) {
        this(byteBuffer, (InterpreterImpl.Options) null);
    }

    private void addDelegates(InterpreterImpl.Options options) {
        Delegate delegateMaybeCreateFlexDelegate;
        if (this.originalGraphHasUnresolvedFlexOp && (delegateMaybeCreateFlexDelegate = maybeCreateFlexDelegate(options.getDelegates())) != null) {
            this.ownedDelegates.add(delegateMaybeCreateFlexDelegate);
            this.delegates.add(delegateMaybeCreateFlexDelegate);
        }
        addUserProvidedDelegates(options);
        Iterator<DelegateFactory> it = options.getDelegateFactories().iterator();
        while (it.hasNext()) {
            Delegate delegateCreate = it.next().create(RUNTIME_FLAVOR);
            this.ownedDelegates.add(delegateCreate);
            this.delegates.add(delegateCreate);
        }
        if (options.getUseNNAPI()) {
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.ownedDelegates.add(nnApiDelegate);
            this.delegates.add(nnApiDelegate);
        }
    }

    private boolean allocateTensorsIfNeeded() {
        if (this.isMemoryAllocated) {
            return false;
        }
        this.isMemoryAllocated = true;
        allocateTensors(this.interpreterHandle, this.errorHandle);
        for (TensorImpl tensorImpl : this.outputTensors) {
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
        return true;
    }

    private NativeSignatureRunnerWrapper getSignatureRunnerWrapper(String str) {
        String str2;
        if (this.signatureRunnerMap == null) {
            this.signatureRunnerMap = new HashMap();
        }
        if (this.signatureRunnerMap.containsKey(str)) {
            str2 = str;
        } else {
            str2 = str;
            this.signatureRunnerMap.put(str2, new NativeSignatureRunnerWrapper(this.interpreterHandle, this.errorHandle, str2));
        }
        return this.signatureRunnerMap.get(str2);
    }

    private void initDelegatesWithInterpreterFactory() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (Delegate delegate : this.delegates) {
            if (delegate instanceof NnApiDelegate) {
                ((NnApiDelegate) delegate).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
    }

    public int getInputIndex(String str) {
        if (this.inputsIndexes == null) {
            String[] inputNames = getInputNames(this.interpreterHandle);
            this.inputsIndexes = new HashMap();
            if (inputNames != null) {
                for (int i11 = 0; i11 < inputNames.length; i11++) {
                    this.inputsIndexes.put(inputNames[i11], Integer.valueOf(i11));
                }
            }
        }
        if (this.inputsIndexes.containsKey(str)) {
            return this.inputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.inputsIndexes));
    }

    public int getInputTensorCount() {
        return this.inputTensors.length;
    }

    public Long getLastNativeInferenceDurationNanoseconds() {
        long j11 = this.inferenceDurationNanoseconds;
        if (j11 < 0) {
            return null;
        }
        return Long.valueOf(j11);
    }

    public int getOutputIndex(String str) {
        if (this.outputsIndexes == null) {
            String[] outputNames = getOutputNames(this.interpreterHandle);
            this.outputsIndexes = new HashMap();
            if (outputNames != null) {
                for (int i11 = 0; i11 < outputNames.length; i11++) {
                    this.outputsIndexes.put(outputNames[i11], Integer.valueOf(i11));
                }
            }
        }
        if (this.outputsIndexes.containsKey(str)) {
            return this.outputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.outputsIndexes));
    }

    public int getOutputTensorCount() {
        return this.outputTensors.length;
    }

    public void resizeInput(int i11, int[] iArr, boolean z11) {
        if (resizeInput(this.interpreterHandle, this.errorHandle, i11, iArr, z11)) {
            this.isMemoryAllocated = false;
            TensorImpl tensorImpl = this.inputTensors[i11];
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        this.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str);
        if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
            Object[] objArr = new Object[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                objArr[signatureRunnerWrapper.getInputIndex(entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                treeMap.put(Integer.valueOf(signatureRunnerWrapper.getOutputIndex(entry2.getKey())), entry2.getValue());
            }
            run(objArr, treeMap);
            return;
        }
        for (Map.Entry<String, Object> entry3 : map.entrySet()) {
            int[] inputShapeIfDifferent = getInputTensor(entry3.getKey(), str).getInputShapeIfDifferent(entry3.getValue());
            if (inputShapeIfDifferent != null) {
                try {
                    signatureRunnerWrapper.resizeInput(entry3.getKey(), inputShapeIfDifferent);
                } catch (IllegalArgumentException e11) {
                    throw ((IllegalArgumentException) new IllegalArgumentException(String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), str)).initCause(e11));
                }
            }
        }
        signatureRunnerWrapper.allocateTensorsIfNeeded();
        for (Map.Entry<String, Object> entry4 : map.entrySet()) {
            signatureRunnerWrapper.getInputTensor(entry4.getKey()).setTo(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        signatureRunnerWrapper.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (Map.Entry<String, Object> entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                signatureRunnerWrapper.getOutputTensor(entry5.getKey()).copyTo(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public NativeInterpreterWrapper(String str, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        long jCreateErrorReporter = createErrorReporter(512);
        init(jCreateErrorReporter, createModel(str, jCreateErrorReporter), options);
    }

    private void addUserProvidedDelegates(InterpreterImpl.Options options) {
        for (Delegate delegate : options.getDelegates()) {
            if (options.getRuntime() != InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY && !(delegate instanceof NnApiDelegate)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.delegates.add(delegate);
        }
    }

    public String[] getSignatureInputs(String str) {
        return getSignatureRunnerWrapper(str).inputNames();
    }

    public String[] getSignatureOutputs(String str) {
        return getSignatureRunnerWrapper(str).outputNames();
    }

    public TensorImpl getInputTensor(String str, String str2) {
        if (str != null) {
            NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
            if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
                return getInputTensor(signatureRunnerWrapper.getInputIndex(str));
            }
            return signatureRunnerWrapper.getInputTensor(str);
        }
        throw new IllegalArgumentException("Invalid input tensor name provided (null)");
    }

    public TensorImpl getOutputTensor(String str, String str2) {
        if (str != null) {
            NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
            if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
                return getOutputTensor(signatureRunnerWrapper.getOutputIndex(str));
            }
            return signatureRunnerWrapper.getOutputTensor(str);
        }
        throw new IllegalArgumentException("Invalid output tensor name provided (null)");
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        if (byteBuffer != null && ((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            this.modelByteBuffer = byteBuffer;
            long jCreateErrorReporter = createErrorReporter(512);
            init(jCreateErrorReporter, createModelWithBuffer(this.modelByteBuffer, jCreateErrorReporter), options);
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }
}
