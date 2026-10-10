package com.tencent.cloud.tuikit.engine.impl.call;

import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridge;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.utils.SoLoader;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.trtc.TRTCCloud;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine")
public class TUICallEngineJni {
    private long mNativeTUICallEngineJni;
    private final TUIPipelineBridge mPipelineBridge;

    private static native long nativeCreatePipeline(TUICallEngineJni tUICallEngineJni, long j11);

    private static native void nativeDestroyPipeline(long j11);

    private static native long nativeGetJObjectAddress(Object obj);

    private static native TRTCCloud nativeGetTRTCCloudInstance(long j11);

    public synchronized TRTCCloud getTRTCCloudInstance() {
        long j11 = this.mNativeTUICallEngineJni;
        if (j11 == 0) {
            return null;
        }
        return nativeGetTRTCCloudInstance(j11);
    }

    public static long getJObjectAddress(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return nativeGetJObjectAddress(obj);
    }

    public void destroy() {
        long j11 = this.mNativeTUICallEngineJni;
        if (j11 != 0) {
            nativeDestroyPipeline(j11);
            this.mNativeTUICallEngineJni = 0L;
        }
        this.mPipelineBridge.destroy();
    }

    public TUIPipelineBridge getPipelineBridge() {
        return this.mPipelineBridge;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TUICallEngineJni() {
        TUIPipelineBridge tUIPipelineBridge = new TUIPipelineBridge(TUIPipelineBridgeDefine.PipelineType.Call, true);
        this.mPipelineBridge = tUIPipelineBridge;
        this.mNativeTUICallEngineJni = nativeCreatePipeline(this, tUIPipelineBridge.getNativePipelineBridge());
    }
}
