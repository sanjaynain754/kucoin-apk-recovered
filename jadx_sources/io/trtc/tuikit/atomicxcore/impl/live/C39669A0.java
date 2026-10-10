package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.A0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39669A0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveEndedReason f88139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39669A0(String str, LiveEndedReason liveEndedReason) {
        super(1);
        this.f88138a = str;
        this.f88139b = liveEndedReason;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveListListener notify = (LiveListListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onLiveEnded(this.f88138a, this.f88139b, "");
        return Unit.INSTANCE;
    }
}
