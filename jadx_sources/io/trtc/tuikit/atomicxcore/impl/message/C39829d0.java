package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.d0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39829d0 implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88494a;

    public C39829d0(CompletionHandler completionHandler) {
        this.f88494a = completionHandler;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        CompletionHandler completionHandler = this.f88494a;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f88494a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
