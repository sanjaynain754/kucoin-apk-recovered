package io.trtc.tuikit.atomicxcore.impl.gift;

import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.gift.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39663b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Gift f88122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f88123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LiveUserInfo f88124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39663b(String str, Gift gift, long j11, LiveUserInfo liveUserInfo) {
        super(1);
        this.f88121a = str;
        this.f88122b = gift;
        this.f88123c = j11;
        this.f88124d = liveUserInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GiftListener notify = (GiftListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onReceiveGift(this.f88121a, this.f88122b, (int) this.f88123c, this.f88124d);
        return Unit.INSTANCE;
    }
}
