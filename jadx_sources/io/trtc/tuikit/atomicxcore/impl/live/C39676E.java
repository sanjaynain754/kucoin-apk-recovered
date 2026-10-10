package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C39676E extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39676E(C39692M c39692m, String str) {
        super(0);
        this.f88148a = c39692m;
        this.f88149b = str;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC39465b.m88232a(this.f88148a.f88183f, "Response: cancelInvitation onSuccess", "message", 0, "Response: cancelInvitation onSuccess");
        C39692M.m88301b(this.f88148a, this.f88149b);
        return Unit.INSTANCE;
    }
}
