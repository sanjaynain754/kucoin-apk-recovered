package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C39872D extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88626b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f88627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39872D(C39934k0 c39934k0, String str, boolean z11) {
        super(1);
        this.f88625a = c39934k0;
        this.f88626b = str;
        this.f88627c = z11;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        C39934k0 c39934k0 = this.f88625a;
        String str = this.f88626b;
        int i11 = C39934k0.f88764C;
        c39934k0.getClass();
        if (Intrinsics.areEqual(TUIRoomEngine.getSelfInfo().userId, str)) {
            notify.onUserMessageDisabled(this.f88627c, this.f88625a.f88786t.f88738a);
        }
        return Unit.INSTANCE;
    }
}
