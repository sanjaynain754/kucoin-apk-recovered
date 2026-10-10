package io.trtc.tuikit.atomicxcore.impl.live;

import android.content.Context;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.login.C39796h;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.l1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39754l1 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39760n1 f88338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39796h f88339b;

    public C39754l1(C39760n1 c39760n1, C39796h c39796h) {
        this.f88338a = c39760n1;
        this.f88339b = c39796h;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        LoginStatus loginStatus = (LoginStatus) obj;
        C39510r c39510r = this.f88338a.f88351a;
        String message = "Listener: loginStatus changed to " + loginStatus;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        int i11 = AbstractC39751k1.f88335a[loginStatus.ordinal()];
        if (i11 == 1) {
            C39736f1 c39736f1 = this.f88338a.f88353c;
            int sdkAppID = this.f88339b.getSdkAppID();
            C39796h c39796h = this.f88339b;
            String str = c39796h.f88433f;
            String str2 = c39796h.f88434g;
            Context context = c39796h.f88435h;
            if (c39736f1 == null || c39736f1.f88299a != sdkAppID || !Intrinsics.areEqual(c39736f1.f88300b, str) || !Intrinsics.areEqual(c39736f1.f88301c, str2)) {
                C39760n1 c39760n1 = this.f88338a;
                C39510r c39510r2 = c39760n1.f88351a;
                String message2 = "API: login room engine with userId=" + str;
                Intrinsics.checkNotNullParameter(message2, "message");
                c39510r2.m88251a(0, message2);
                TUIRoomEngine.login(context, sdkAppID, str, str2, new C39495c(null, new C39739g1(c39760n1, sdkAppID, str, str2, context), new C39742h1(c39760n1), 1));
            }
        } else if (i11 == 2) {
            C39760n1 c39760n2 = this.f88338a;
            if (c39760n2.f88353c != null) {
                C39510r c39510r3 = c39760n2.f88351a;
                Intrinsics.checkNotNullParameter("API: logout room engine", "message");
                c39510r3.m88251a(0, "API: logout room engine");
                TUIRoomEngine.logout(new C39495c(null, new C39745i1(c39760n2), new C39748j1(c39760n2), 1));
                this.f88338a.f88353c = null;
            }
        }
        return Unit.INSTANCE;
    }
}
