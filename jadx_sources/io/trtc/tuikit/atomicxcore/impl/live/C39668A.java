package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C39668A extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39668A(String str) {
        super(1);
        this.f88137a = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuestListener notify = (GuestListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onGuestApplicationResponded(false, new LiveUserInfo(this.f88137a, null, null, 6, null));
        return Unit.INSTANCE;
    }
}
