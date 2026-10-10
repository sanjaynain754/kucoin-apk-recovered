package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMDownloadCallback;
import com.tencent.imsdk.p128v2.V2TIMElem;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.O */
/* JADX INFO: loaded from: classes61.dex */
public final class C39811O implements V2TIMDownloadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageInfo f88461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88462c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88463d;

    public C39811O(C39857r0 c39857r0, MessageInfo messageInfo, CompletionHandler completionHandler, String str) {
        this.f88460a = c39857r0;
        this.f88461b = messageInfo;
        this.f88462c = completionHandler;
        this.f88463d = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        C39857r0.m88335a(this.f88460a, this.f88461b.getMsgID(), 0);
        CompletionHandler completionHandler = this.f88462c;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMDownloadCallback
    public final void onProgress(V2TIMElem.V2ProgressInfo progressInfo) {
        Intrinsics.checkNotNullParameter(progressInfo, "progressInfo");
        C39857r0.m88335a(this.f88460a, this.f88461b.getMsgID(), (int) ((progressInfo.getCurrentSize() * ((long) 100)) / progressInfo.getTotalSize()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f88460a.m88339a(this.f88461b, new C39810N(this.f88463d));
        CompletionHandler completionHandler = this.f88462c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
