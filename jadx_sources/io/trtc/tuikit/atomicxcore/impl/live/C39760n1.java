package io.trtc.tuikit.atomicxcore.impl.live;

import android.content.Context;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.login.C39796h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.n1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39760n1 {

    /* JADX INFO: renamed from: d */
    public static final C39760n1 f88350d = new C39760n1();

    /* JADX INFO: renamed from: a */
    public final C39510r f88351a = AbstractC39398a.m88229a("RoomEngineLogin", "file", "AtomicXCore-Live", "RoomEngineLogin");

    /* JADX INFO: renamed from: b */
    public InterfaceC41775x1 f88352b;

    /* JADX INFO: renamed from: c */
    public C39736f1 f88353c;

    /* JADX INFO: renamed from: a */
    public final void m88323a() {
        C39510r c39510r = this.f88351a;
        Intrinsics.checkNotNullParameter("API: startAutoLogin called", "message");
        c39510r.m88251a(0, "API: startAutoLogin called");
        LoginStore loginStore = LoginStore.shared;
        Intrinsics.checkNotNull(loginStore, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.impl.login.LoginStoreImpl");
        C39796h c39796h = (C39796h) loginStore;
        if (c39796h.f88436i.getLoginStatus().getValue() == LoginStatus.LOGINED) {
            Context context = c39796h.f88435h;
            int sdkAppID = c39796h.getSdkAppID();
            String str = c39796h.f88433f;
            String str2 = c39796h.f88434g;
            C39510r c39510r2 = this.f88351a;
            String message = "API: login room engine with userId=" + str;
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r2.m88251a(0, message);
            TUIRoomEngine.login(context, sdkAppID, str, str2, new C39495c(null, new C39739g1(this, sdkAppID, str, str2, context), new C39742h1(this), 1));
        }
        Intrinsics.checkNotNull(loginStore, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.impl.login.LoginStoreImpl");
        InterfaceC41775x1 interfaceC41775x1 = this.f88352b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f88352b = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C39757m1(c39796h, this, null), 3, null);
    }
}
