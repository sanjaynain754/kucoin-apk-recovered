package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.i1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39745i1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39760n1 f88328a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39745i1(C39760n1 c39760n1) {
        super(0);
        this.f88328a = c39760n1;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC39465b.m88232a(this.f88328a.f88351a, "Response: logout room engine success", "message", 0, "Response: logout room engine success");
        return Unit.INSTANCE;
    }
}
