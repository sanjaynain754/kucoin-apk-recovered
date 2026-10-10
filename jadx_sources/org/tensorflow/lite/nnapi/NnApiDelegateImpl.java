package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes61.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    private static final long INVALID_DELEGATE_HANDLE = 0;
    private long delegateHandle;

    private static native long createDelegate(int i11, String str, String str2, String str3, int i12, boolean z11, boolean z12, boolean z13, long j11);

    private static native void deleteDelegate(long j11);

    private static native int getNnapiErrno(long j11);

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public int getNnapiErrno() {
        checkNotClosed();
        return getNnapiErrno(this.delegateHandle);
    }

    private void checkNotClosed() {
        if (this.delegateHandle == 0) {
            throw new IllegalStateException("Should not access delegate after it has been closed.");
        }
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.delegateHandle;
        if (j11 != 0) {
            deleteDelegate(j11);
            this.delegateHandle = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.delegateHandle;
    }

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        boolean z11;
        TensorFlowLite.init();
        int executionPreference = options.getExecutionPreference();
        String acceleratorName = options.getAcceleratorName();
        String cacheDir = options.getCacheDir();
        String modelToken = options.getModelToken();
        int maxNumberOfDelegatedPartitions = options.getMaxNumberOfDelegatedPartitions();
        if (options.getUseNnapiCpu() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.delegateHandle = createDelegate(executionPreference, acceleratorName, cacheDir, modelToken, maxNumberOfDelegatedPartitions, z11, options.getUseNnapiCpu() == null || !options.getUseNnapiCpu().booleanValue(), options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }
}
