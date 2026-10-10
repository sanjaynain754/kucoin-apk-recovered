package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.L */
/* JADX INFO: loaded from: classes61.dex */
public final class C39888L extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeviceType f88652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39888L(C39934k0 c39934k0, DeviceType deviceType) {
        super(0);
        this.f88651a = c39934k0;
        this.f88652b = deviceType;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        C39915b c39915b = this.f88651a.f88791y;
        DeviceType device = this.f88652b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        c39915b.f88729c.remove(device);
        return Unit.INSTANCE;
    }
}
