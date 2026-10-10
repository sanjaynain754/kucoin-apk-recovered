package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.u */
/* JADX INFO: loaded from: classes61.dex */
public final class C39777u extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88399a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.Request f88400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39777u(C39692M c39692m, TUIRoomDefine.Request request) {
        super(1);
        this.f88399a = c39692m;
        this.f88400b = request;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuestListener notify = (GuestListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        C39510r c39510r = this.f88399a.f88183f;
        String message = "Listener: onHostInvitationCancelled with userID=" + this.f88400b.userId;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        notify.onHostInvitationCancelled(AbstractC39747j0.m88321a(this.f88400b));
        return Unit.INSTANCE;
    }
}
