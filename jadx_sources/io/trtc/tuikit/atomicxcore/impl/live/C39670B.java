package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.NoResponseReason;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C39670B extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39670B f88140a = new C39670B();

    public C39670B() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuestListener notify = (GuestListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onGuestApplicationNoResponse(NoResponseReason.TIMEOUT);
        return Unit.INSTANCE;
    }
}
