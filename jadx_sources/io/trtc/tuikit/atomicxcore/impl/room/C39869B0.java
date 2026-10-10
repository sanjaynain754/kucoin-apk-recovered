package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.B0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39869B0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIConferenceListManager.ConferenceInfo f88619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39869B0(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88619a = conferenceInfo;
        this.f88620b = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onScheduledRoomCancelled(AbstractC39939m0.m88364a(this.f88619a), AbstractC39939m0.m88368a(this.f88620b));
        return Unit.INSTANCE;
    }
}
