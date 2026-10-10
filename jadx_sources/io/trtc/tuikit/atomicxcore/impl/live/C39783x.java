package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C39783x extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.Request f88407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39692M f88408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39783x(TUIRoomDefine.Request request, C39692M c39692m) {
        super(1);
        this.f88407a = request;
        this.f88408b = c39692m;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuestListener notify = (GuestListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        LiveUserInfo liveUserInfoM88321a = AbstractC39747j0.m88321a(this.f88407a);
        C39510r c39510r = this.f88408b.f88183f;
        String message = "Listener: onHostInvitationReceived with liveUserInfo=" + liveUserInfoM88321a;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        notify.onHostInvitationReceived(liveUserInfoM88321a);
        return Unit.INSTANCE;
    }
}
