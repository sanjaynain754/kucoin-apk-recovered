package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMDownloadCallback;
import com.tencent.imsdk.p128v2.V2TIMElem;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C39807K implements V2TIMDownloadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageInfo f88454b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88455c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88456d;

    public C39807K(C39857r0 c39857r0, MessageInfo messageInfo, CompletionHandler completionHandler, String str) {
        this.f88453a = c39857r0;
        this.f88454b = messageInfo;
        this.f88455c = completionHandler;
        this.f88456d = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        C39857r0.m88335a(this.f88453a, this.f88454b.getMsgID(), 0);
        CompletionHandler completionHandler = this.f88455c;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMDownloadCallback
    public final void onProgress(V2TIMElem.V2ProgressInfo progressInfo) {
        Intrinsics.checkNotNullParameter(progressInfo, "progressInfo");
        C39857r0.m88335a(this.f88453a, this.f88454b.getMsgID(), (int) ((progressInfo.getCurrentSize() * ((long) 100)) / progressInfo.getTotalSize()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f88453a.m88339a(this.f88454b, new C39806J(this.f88456d));
        CompletionHandler completionHandler = this.f88455c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
