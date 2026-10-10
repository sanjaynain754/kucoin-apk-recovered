package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.T */
/* JADX INFO: loaded from: classes61.dex */
public final class C39705T extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveConnectionManager.ConnectionUser f88220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39705T(TUILiveConnectionManager.ConnectionUser connectionUser) {
        super(1);
        this.f88220a = connectionUser;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoHostListener notify = (CoHostListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCoHostRequestRejected(AbstractC39699P0.m88312a(this.f88220a));
        return Unit.INSTANCE;
    }
}
