package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39930i0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeviceType f88758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39930i0(C39934k0 c39934k0, String str, DeviceType deviceType) {
        super(0);
        this.f88756a = c39934k0;
        this.f88757b = str;
        this.f88758c = deviceType;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f88756a.f88791y.m88346b(this.f88757b, this.f88758c);
        return Unit.INSTANCE;
    }
}
