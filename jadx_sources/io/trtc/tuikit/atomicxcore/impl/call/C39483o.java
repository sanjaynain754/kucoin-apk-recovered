package io.trtc.tuikit.atomicxcore.impl.call;

import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39483o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f87654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39483o(String str) {
        super(1);
        this.f87654a = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallListener notify = (CallListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCallStarted(this.f87654a, CallMediaType.Audio);
        return Unit.INSTANCE;
    }
}
