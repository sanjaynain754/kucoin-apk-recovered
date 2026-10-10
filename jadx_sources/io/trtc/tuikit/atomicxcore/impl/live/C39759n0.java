package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.n0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39759n0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88349b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39759n0(String str, boolean z11) {
        super(1);
        this.f88348a = str;
        this.f88349b = z11;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveAudienceListener notify = (LiveAudienceListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onAudienceMessageDisabled(new LiveUserInfo(this.f88348a, null, null, 6, null), this.f88349b);
        return Unit.INSTANCE;
    }
}
