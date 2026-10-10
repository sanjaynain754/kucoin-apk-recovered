package io.trtc.tuikit.atomicxcore.api.view;

import io.trtc.tuikit.atomicxcore.api.call.CallStore;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.api.view.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39399b {
    /* JADX INFO: renamed from: a */
    public static Object m88230a(CallStore.Companion companion) {
        return companion.getShared().getObserverState().getActiveCall().getValue();
    }
}
