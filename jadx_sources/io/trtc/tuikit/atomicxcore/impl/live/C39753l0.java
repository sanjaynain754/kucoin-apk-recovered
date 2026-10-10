package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.l0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39753l0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39753l0(TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88337a = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveUserInfo it = (LiveUserInfo) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.getUserID(), this.f88337a.userId));
    }
}
