package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.k0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39750k0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39750k0(TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88334a = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveAudienceListener notify = (LiveAudienceListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onAudienceJoined(AbstractC39747j0.m88322a(this.f88334a));
        return Unit.INSTANCE;
    }
}
