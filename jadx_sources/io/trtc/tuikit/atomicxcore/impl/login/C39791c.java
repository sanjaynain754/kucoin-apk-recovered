package io.trtc.tuikit.atomicxcore.impl.login;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39791c implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39796h f88420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88421b;

    public C39791c(C39796h c39796h, CompletionHandler completionHandler) {
        this.f88420a = c39796h;
        this.f88421b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f88420a.f88428a;
        String message = "Response: logout failed code=" + i11 + ", desc=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        CompletionHandler completionHandler = this.f88421b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f88420a.f88430c.setValue(LoginStatus.UNLOGIN);
        AbstractC39465b.m88232a(this.f88420a.f88428a, "Response: logout success", "message", 0, "Response: logout success");
        CompletionHandler completionHandler = this.f88421b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
