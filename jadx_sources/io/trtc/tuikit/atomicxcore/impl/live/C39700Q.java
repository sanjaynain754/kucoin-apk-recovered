package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.Q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39700Q extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveConnectionManager.ConnectionUser f88213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeatUserInfo f88214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39700Q(TUILiveConnectionManager.ConnectionUser connectionUser, SeatUserInfo seatUserInfo) {
        super(1);
        this.f88213a = connectionUser;
        this.f88214b = seatUserInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoHostListener notify = (CoHostListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCoHostRequestCancelled(AbstractC39699P0.m88312a(this.f88213a), this.f88214b);
        return Unit.INSTANCE;
    }
}
