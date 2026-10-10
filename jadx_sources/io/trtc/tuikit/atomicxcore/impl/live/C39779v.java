package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.HostListener;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39779v extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.Request f88402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39779v(C39692M c39692m, TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88401a = c39692m;
        this.f88402b = request;
        this.f88403c = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HostListener notify = (HostListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        C39510r c39510r = this.f88401a.f88183f;
        String message = "Listener: onGuestApplicationProcessedByOtherHost with userID=" + this.f88402b.userId + ", operateUserID=" + this.f88403c.userId;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        notify.onGuestApplicationProcessedByOtherHost(AbstractC39747j0.m88321a(this.f88402b), AbstractC39747j0.m88322a(this.f88403c));
        return Unit.INSTANCE;
    }
}
