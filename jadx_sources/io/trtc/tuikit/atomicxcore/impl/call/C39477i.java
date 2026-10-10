package io.trtc.tuikit.atomicxcore.impl.call;

import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39477i extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallMediaType f87643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39477i(CallMediaType callMediaType) {
        super(1);
        this.f87643a = callMediaType;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallListener notify = (CallListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCallStarted("", this.f87643a);
        return Unit.INSTANCE;
    }
}
