package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C39688K extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUIRoomDefine.Request f88170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39688K(C39692M c39692m, boolean z11, TUIRoomDefine.Request request) {
        super(0);
        this.f88168a = c39692m;
        this.f88169b = z11;
        this.f88170c = request;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        C39510r c39510r = this.f88168a.f88183f;
        String message = "Response: responseApplication onSuccess with isAccept=" + this.f88169b;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        C39692M c39692m = this.f88168a;
        String userId = this.f88170c.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        C39692M.m88300a(c39692m, userId);
        return Unit.INSTANCE;
    }
}
