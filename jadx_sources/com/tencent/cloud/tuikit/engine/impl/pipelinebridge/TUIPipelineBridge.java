package com.tencent.cloud.tuikit.engine.impl.pipelinebridge;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine")
public class TUIPipelineBridge {
    private static final String TAG = "TUIPipelineBridge";
    private long mNativePipelineBridge;
    private final List<TUIPipelineBridgeObserver> mObserverList = new CopyOnWriteArrayList();

    public static class APICallRespondCallback {
        private final TUIPipelineBridgeDefine.APICallRespondCallback mCallback;

        @CalledByNative("APICallRespondCallback")
        public void onCallback(int i11, String str, String str2) {
            TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback = this.mCallback;
            if (aPICallRespondCallback != null) {
                aPICallRespondCallback.onCallback(TUICommonDefine.Error.fromInt(i11), str, str2);
            }
        }

        public APICallRespondCallback(TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
            this.mCallback = aPICallRespondCallback;
        }
    }

    private boolean checkPipelineBridge() {
        return this.mNativePipelineBridge != 0;
    }

    private static native String nativeCallAPI(long j11, String str, String str2, APICallRespondCallback aPICallRespondCallback);

    private static native long nativeCreatePipelineBridge(TUIPipelineBridge tUIPipelineBridge, int i11, boolean z11);

    private static native void nativeDestroyPipelineBridge(long j11);

    private static native boolean nativeIsSyncAPI(long j11, String str, String str2);

    private boolean checkPipelineBridge(TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        if (this.mNativePipelineBridge != 0) {
            return true;
        }
        if (aPICallRespondCallback == null) {
            return false;
        }
        aPICallRespondCallback.onCallback(TUICommonDefine.Error.FAILED, "bridge is destroyed", "");
        return false;
    }

    private List<TUIPipelineBridgeObserver> copyOnReadObservers() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    public void addObserver(TUIPipelineBridgeObserver tUIPipelineBridgeObserver) {
        if (tUIPipelineBridgeObserver == null || this.mObserverList.contains(tUIPipelineBridgeObserver)) {
            return;
        }
        this.mObserverList.add(tUIPipelineBridgeObserver);
    }

    public void destroy() {
        long j11 = this.mNativePipelineBridge;
        if (j11 != 0) {
            nativeDestroyPipelineBridge(j11);
            this.mNativePipelineBridge = 0L;
        }
    }

    public long getNativePipelineBridge() {
        return this.mNativePipelineBridge;
    }

    public void removeObserver(TUIPipelineBridgeObserver tUIPipelineBridgeObserver) {
        if (tUIPipelineBridgeObserver == null || !this.mObserverList.contains(tUIPipelineBridgeObserver)) {
            return;
        }
        this.mObserverList.remove(tUIPipelineBridgeObserver);
    }

    public TUIPipelineBridge(TUIPipelineBridgeDefine.PipelineType pipelineType, boolean z11) {
        this.mNativePipelineBridge = nativeCreatePipelineBridge(this, pipelineType.getValue(), z11);
    }

    public String callAPI(String str, String str2, TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        if (!checkPipelineBridge(aPICallRespondCallback)) {
            return "";
        }
        return nativeCallAPI(this.mNativePipelineBridge, str, str2, new APICallRespondCallback(aPICallRespondCallback));
    }

    public boolean isSyncAPI(String str, String str2) {
        if (!checkPipelineBridge()) {
            return false;
        }
        return nativeIsSyncAPI(this.mNativePipelineBridge, str, str2);
    }

    @CalledByNative
    public void onReceiveEventFromPipeline(String str, String str2) {
        Iterator<TUIPipelineBridgeObserver> it = copyOnReadObservers().iterator();
        while (it.hasNext()) {
            it.next().onReceiveEventFromPipeline(str, str2);
        }
    }
}
