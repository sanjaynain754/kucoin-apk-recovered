package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39773s extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f88382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39773s(C39692M c39692m, int i11, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88381a = c39692m;
        this.f88382b = i11;
        this.f88383c = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuestListener notify = (GuestListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        C39510r c39510r = this.f88381a.f88183f;
        String message = "Listener: onKickedOffSeat with seatIndex=" + this.f88382b + ", operateUserID=" + this.f88383c.userId;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        notify.onKickedOffSeat(this.f88382b, AbstractC39747j0.m88322a(this.f88383c));
        return Unit.INSTANCE;
    }
}
