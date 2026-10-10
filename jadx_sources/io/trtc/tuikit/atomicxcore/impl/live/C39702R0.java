package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.R0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39702R0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39716Y0 f88216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39702R0(C39716Y0 c39716y0) {
        super(1);
        this.f88216a = c39716y0;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveSeatListener notify = (LiveSeatListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        AbstractC39465b.m88232a(this.f88216a.f88240g, "Listener: onLocalMicrophoneOpenedByAdmin with policy=UNLOCK_ONLY", "message", 0, "Listener: onLocalMicrophoneOpenedByAdmin with policy=UNLOCK_ONLY");
        notify.onLocalMicrophoneOpenedByAdmin(DeviceControlPolicy.UNLOCK_ONLY);
        return Unit.INSTANCE;
    }
}
