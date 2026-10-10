package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMDownloadCallback;
import com.tencent.imsdk.p128v2.V2TIMElem;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C39799C implements V2TIMDownloadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MessageInfo f88440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88441c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88442d;

    public C39799C(C39857r0 c39857r0, MessageInfo messageInfo, CompletionHandler completionHandler, String str) {
        this.f88439a = c39857r0;
        this.f88440b = messageInfo;
        this.f88441c = completionHandler;
        this.f88442d = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        C39857r0.m88335a(this.f88439a, this.f88440b.getMsgID(), 0);
        CompletionHandler completionHandler = this.f88441c;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMDownloadCallback
    public final void onProgress(V2TIMElem.V2ProgressInfo progressInfo) {
        Intrinsics.checkNotNullParameter(progressInfo, "progressInfo");
        C39857r0.m88335a(this.f88439a, this.f88440b.getMsgID(), (int) ((progressInfo.getCurrentSize() * ((long) 100)) / progressInfo.getTotalSize()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f88439a.m88339a(this.f88440b, new C39798B(this.f88442d));
        CompletionHandler completionHandler = this.f88441c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
