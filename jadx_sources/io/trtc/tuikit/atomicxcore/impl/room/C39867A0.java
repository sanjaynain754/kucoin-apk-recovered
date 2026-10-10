package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.A0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39867A0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIConferenceListManager.ConferenceInfo f88616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39867A0(TUIConferenceListManager.ConferenceInfo conferenceInfo) {
        super(1);
        this.f88616a = conferenceInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onRoomEnded(AbstractC39939m0.m88364a(this.f88616a));
        return Unit.INSTANCE;
    }
}
