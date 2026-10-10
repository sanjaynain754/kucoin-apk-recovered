package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C39674D extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39674D(C39692M c39692m) {
        super(0);
        this.f88146a = c39692m;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC39465b.m88232a(this.f88146a.f88183f, "Response: cancelApplication onSuccess", "message", 0, "Response: cancelApplication onSuccess");
        this.f88146a.f88189l = null;
        return Unit.INSTANCE;
    }
}
