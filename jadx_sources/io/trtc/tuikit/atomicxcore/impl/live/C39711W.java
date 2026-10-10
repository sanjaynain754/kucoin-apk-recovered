package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.W */
/* JADX INFO: loaded from: classes61.dex */
public final class C39711W extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveConnectionManager.ConnectionUser f88227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39711W(TUILiveConnectionManager.ConnectionUser connectionUser) {
        super(1);
        this.f88227a = connectionUser;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoHostListener notify = (CoHostListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCoHostUserLeft(AbstractC39699P0.m88312a(this.f88227a));
        return Unit.INSTANCE;
    }
}
