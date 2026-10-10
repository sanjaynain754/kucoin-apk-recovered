package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.L */
/* JADX INFO: loaded from: classes61.dex */
public final class C39690L extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39690L(C39692M c39692m, boolean z11) {
        super(0);
        this.f88173a = c39692m;
        this.f88174b = z11;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        C39510r c39510r = this.f88173a.f88183f;
        String message = "Response: responseInvitation onSuccess with isAccept=" + this.f88174b;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88173a.f88190m = null;
        return Unit.INSTANCE;
    }
}
