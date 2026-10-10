package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C39505m implements V2TIMValueCallback {
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        IMLog.m75914e("AtomicXCore-DataReporter", "reportFeatureUsage failed: " + i11 + ' ' + str);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
    }
}
