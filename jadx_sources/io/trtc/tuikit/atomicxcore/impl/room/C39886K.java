package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C39886K extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeviceType f88646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39886K(C39934k0 c39934k0, String str, DeviceType deviceType) {
        super(0);
        this.f88644a = c39934k0;
        this.f88645b = str;
        this.f88646c = deviceType;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f88644a.f88791y.m88347c(this.f88645b, this.f88646c);
        return Unit.INSTANCE;
    }
}
