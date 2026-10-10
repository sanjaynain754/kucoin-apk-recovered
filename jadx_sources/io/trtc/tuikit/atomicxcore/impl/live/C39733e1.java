package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryData;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.e1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39733e1 extends LiveSummaryStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f88284i = 0;

    /* JADX INFO: renamed from: a */
    public final String f88285a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88286b;

    /* JADX INFO: renamed from: c */
    public final C39510r f88287c;

    /* JADX INFO: renamed from: d */
    public final TUILiveListManager f88288d;

    /* JADX INFO: renamed from: e */
    public final C39721a1 f88289e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41709m0 f88290f;

    /* JADX INFO: renamed from: g */
    public InterfaceC41775x1 f88291g;

    /* JADX INFO: renamed from: h */
    public final LiveSummaryState f88292h;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88287c;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88288d.getLiveStatistics(this.f88285a, new C39727c1(this));
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88287c, "message", 0);
        this.f88288d.addObserver(this.f88289e);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore
    public final LiveSummaryState getLiveSummaryState() {
        return this.f88292h;
    }

    public C39733e1(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88285a = liveID;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new LiveSummaryData(0L, 0, 0, 0, 0, 0, 0, 127, null));
        this.f88286b = interfaceC41669nM91009a;
        this.f88287c = AbstractC39398a.m88229a("LiveSummaryStoreImpl", "file", "AtomicXCore-Live", "LiveSummaryStoreImpl");
        Object extension = roomEngine.getExtension(TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager");
        this.f88288d = (TUILiveListManager) extension;
        this.f88289e = new C39721a1(this);
        this.f88290f = C41713n0.m91125a(C41782z0.m91392b());
        this.f88292h = new LiveSummaryState(interfaceC41669nM91009a);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88287c, "message", 0);
        this.f88288d.removeObserver(this.f88289e);
        InterfaceC41775x1 interfaceC41775x1 = this.f88291g;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f88291g = null;
    }
}
