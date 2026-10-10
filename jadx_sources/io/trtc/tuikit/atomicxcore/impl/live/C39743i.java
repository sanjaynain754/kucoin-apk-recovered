package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39743i extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39767q f88318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeatUserInfo f88319b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f88320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39743i(C39767q c39767q, SeatUserInfo seatUserInfo, ArrayList arrayList) {
        super(1);
        this.f88318a = c39767q;
        this.f88319b = seatUserInfo;
        this.f88320c = arrayList;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onBattleStarted((BattleInfo) this.f88318a.f88366a.getValue(), this.f88319b, this.f88320c);
        return Unit.INSTANCE;
    }
}
