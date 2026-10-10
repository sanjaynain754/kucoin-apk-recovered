package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.C39763o1;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.G */
/* JADX INFO: loaded from: classes61.dex */
public final class C40055G implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveSeatStore f89108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveCoreView f89109b;

    public C40055G(LiveSeatStore liveSeatStore, LiveCoreView liveCoreView) {
        this.f89108a = liveSeatStore;
        this.f89109b = liveCoreView;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) throws Exception {
        List list = (List) obj;
        C39763o1 c39763o1 = new C39763o1(this.f89108a.getLiveSeatState().getCanvas().getValue(), list);
        C39510r logger = this.f89109b.getLogger();
        String message = "oid:" + this.f89109b.getOid() + ", onSeatListChanged-Core currentSeatLayout:" + c39763o1 + ",lastSeatLayout:" + this.f89109b.getLastSeatLayout();
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        if (!list.isEmpty()) {
            AbstractC40069N.m88434a(this.f89109b, c39763o1);
        }
        return Unit.INSTANCE;
    }
}
