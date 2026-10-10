package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.t0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39953t0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.RoomInfo f88823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39953t0(TUIRoomDefine.RoomInfo roomInfo, boolean z11) {
        super(1);
        this.f88823a = roomInfo;
        this.f88824b = z11;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCallHandledByOtherDevice(AbstractC39939m0.m88365a(this.f88823a, RoomStatus.RUNNING), this.f88824b);
        return Unit.INSTANCE;
    }
}
