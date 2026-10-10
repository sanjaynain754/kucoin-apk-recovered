package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveKickedOutReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.y0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39786y0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveKickedOutReason f88412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39786y0(String str, LiveKickedOutReason liveKickedOutReason, String str2) {
        super(1);
        this.f88411a = str;
        this.f88412b = liveKickedOutReason;
        this.f88413c = str2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveListListener notify = (LiveListListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onKickedOutOfLive(this.f88411a, this.f88412b, this.f88413c);
        return Unit.INSTANCE;
    }
}
