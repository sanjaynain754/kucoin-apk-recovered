package io.trtc.tuikit.atomicxcore.impl.live;

import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.I0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39685I0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39685I0(String str) {
        super(1);
        this.f88163a = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39732e0 notify = (AbstractC39732e0) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onWillLeaveRoom(this.f88163a);
        return Unit.INSTANCE;
    }
}
