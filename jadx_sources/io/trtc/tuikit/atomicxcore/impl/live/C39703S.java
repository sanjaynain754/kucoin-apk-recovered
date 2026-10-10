package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.S */
/* JADX INFO: loaded from: classes61.dex */
public final class C39703S extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveConnectionManager.ConnectionUser f88217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39703S(TUILiveConnectionManager.ConnectionUser connectionUser, String str) {
        super(1);
        this.f88217a = connectionUser;
        this.f88218b = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoHostListener notify = (CoHostListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCoHostRequestReceived(AbstractC39699P0.m88312a(this.f88217a), this.f88218b);
        return Unit.INSTANCE;
    }
}
