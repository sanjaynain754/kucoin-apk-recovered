package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LikeListener;
import io.trtc.tuikit.atomicxcore.api.live.LikeState;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39744i0 extends LikeStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88321a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88322b;

    /* JADX INFO: renamed from: c */
    public final C39510r f88323c;

    /* JADX INFO: renamed from: d */
    public final C39509q f88324d;

    /* JADX INFO: renamed from: e */
    public final C39738g0 f88325e;

    /* JADX INFO: renamed from: f */
    public final TUILiveGiftManager f88326f;

    /* JADX INFO: renamed from: g */
    public final LikeState f88327g;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88323c;
        String message = "API: afterEnterRoom called with liveID=" + liveInfo.getLiveID();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LikeStore
    public final void addLikeListener(LikeListener likeListener) {
        C39510r c39510r = this.f88323c;
        String message = "API: addLikeListener called with listener=" + likeListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88324d.m88248a(likeListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88323c, "message", 0);
        this.f88326f.addObserver(this.f88325e);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LikeStore
    public final LikeState getLikeState() {
        return this.f88327g;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LikeStore
    public final void removeLikeListener(LikeListener likeListener) {
        C39510r c39510r = this.f88323c;
        String message = "API: removeLikeListener called with listener=" + likeListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88324d.m88250b(likeListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LikeStore
    public final void sendLike(int i11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88323c;
        String message = "API: sendLike called with count=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88326f.sendLike(this.f88321a, i11, new C39741h0(this, completionHandler));
    }

    public C39744i0(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88321a = liveID;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(0L);
        this.f88322b = interfaceC41669nM91009a;
        this.f88323c = AbstractC39398a.m88229a("LikeStoreImpl", "file", "AtomicXCore-Live", "LikeStoreImpl");
        this.f88324d = new C39509q();
        this.f88325e = new C39738g0(this);
        Object extension = roomEngine.getExtension(TUICommonDefine.ExtensionType.LIVE_GIFT_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager");
        this.f88326f = (TUILiveGiftManager) extension;
        this.f88327g = new LikeState(interfaceC41669nM91009a);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88323c, "message", 0);
        CollectionsKt.removeAll((List) this.f88324d.f87705a, (Function1) C39506n.f87702a);
        this.f88326f.removeObserver(this.f88325e);
    }
}
