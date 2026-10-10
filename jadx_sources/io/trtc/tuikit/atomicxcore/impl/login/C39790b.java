package io.trtc.tuikit.atomicxcore.impl.login;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39790b implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39796h f88417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88419c;

    public C39790b(C39796h c39796h, CompletionHandler completionHandler, String str) {
        this.f88417a = c39796h;
        this.f88418b = completionHandler;
        this.f88419c = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f88417a.f88428a;
        String message = "Response: login failed code=" + i11 + ", desc=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        CompletionHandler completionHandler = this.f88418b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f88417a.f88430c.setValue(LoginStatus.LOGINED);
        AbstractC39465b.m88232a(this.f88417a.f88428a, "Response: login success", "message", 0, "Response: login success");
        CompletionHandler completionHandler = this.f88418b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
        V2TIMManager.getInstance().getUsersInfo(CollectionsKt.listOf(this.f88419c), new C39789a(this.f88417a));
    }
}
