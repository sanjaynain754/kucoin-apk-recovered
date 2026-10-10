package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.h0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39928h0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeviceType f88752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39928h0(C39934k0 c39934k0, DeviceType deviceType, String str) {
        super(0);
        this.f88751a = c39934k0;
        this.f88752b = deviceType;
        this.f88753c = str;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f88751a.f88791y.m88345a(this.f88752b, this.f88753c);
        return Unit.INSTANCE;
    }
}
