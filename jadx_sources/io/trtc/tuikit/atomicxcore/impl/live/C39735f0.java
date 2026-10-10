package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LikeListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.f0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39735f0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f88297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LiveUserInfo f88298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39735f0(String str, long j11, LiveUserInfo liveUserInfo) {
        super(1);
        this.f88296a = str;
        this.f88297b = j11;
        this.f88298c = liveUserInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LikeListener notify = (LikeListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onReceiveLikesMessage(this.f88296a, this.f88297b, this.f88298c);
        return Unit.INSTANCE;
    }
}
