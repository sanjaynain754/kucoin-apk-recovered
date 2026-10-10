package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback;
import io.trtc.tuikit.atomicxcore.api.live.BattleState;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
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
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39767q extends BattleStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88366a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88367b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88368c;

    /* JADX INFO: renamed from: d */
    public final C39510r f88369d;

    /* JADX INFO: renamed from: e */
    public final C39509q f88370e;

    /* JADX INFO: renamed from: f */
    public final TUILiveBattleManager f88371f;

    /* JADX INFO: renamed from: g */
    public final C39752l f88372g;

    /* JADX INFO: renamed from: h */
    public final BattleState f88373h;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88369d;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void acceptBattle(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: acceptBattle called with battleID=", str, this.f88369d, "message", 0);
        this.f88371f.acceptBattle(str, new C39722b(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void addBattleListener(BattleListener battleListener) {
        C39510r c39510r = this.f88369d;
        String message = "API: addBattleListener called with listener=" + battleListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88370e.m88248a(battleListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88369d, "message", 0);
        this.f88371f.addObserver(this.f88372g);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void exitBattle(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: exitBattle called with battleID=", str, this.f88369d, "message", 0);
        this.f88371f.exitBattle(str, new C39758n(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final BattleState getBattleState() {
        return this.f88373h;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void rejectBattle(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: rejectBattle called with battleID=", str, this.f88369d, "message", 0);
        this.f88371f.rejectBattle(str, new C39761o(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void removeBattleListener(BattleListener battleListener) {
        C39510r c39510r = this.f88369d;
        String message = "API: removeBattleListener called with listener=" + battleListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88370e.m88250b(battleListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void requestBattle(BattleConfig config, List userIDList, int i11, BattleRequestCallback battleRequestCallback) {
        TUILiveBattleManager.BattleConfig battleConfig;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        C39510r c39510r = this.f88369d;
        String message = "API: requestBattle called with config=" + config + ", userIDList=" + userIDList + ", timeout=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUILiveBattleManager tUILiveBattleManager = this.f88371f;
        if (config == null) {
            battleConfig = new TUILiveBattleManager.BattleConfig();
        } else {
            TUILiveBattleManager.BattleConfig battleConfig2 = new TUILiveBattleManager.BattleConfig();
            battleConfig2.duration = config.getDuration();
            battleConfig2.needResponse = config.getNeedResponse();
            battleConfig2.extensionInfo = config.getExtensionInfo();
            battleConfig = battleConfig2;
        }
        tUILiveBattleManager.requestBattle(battleConfig, userIDList, i11, new C39764p(this, battleRequestCallback));
    }

    public C39767q(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new BattleInfo(null, null, 0L, 0L, 15, null));
        this.f88366a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88367b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(MapsKt.emptyMap());
        this.f88368c = interfaceC41669nM91009a3;
        this.f88369d = AbstractC39398a.m88229a("BattleStoreImpl", "file", "AtomicXCore-Live", "BattleStoreImpl");
        this.f88370e = new C39509q();
        this.f88371f = roomEngine.getLiveBattleManager();
        this.f88372g = new C39752l(this);
        this.f88373h = new BattleState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleStore
    public final void cancelBattleRequest(String str, List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        C39510r c39510r = this.f88369d;
        String message = "API: cancelBattleRequest called with battleID=" + str + ", userIDList=" + userIDList;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88371f.cancelBattleRequest(str, userIDList, new C39755m(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88369d, "message", 0);
        CollectionsKt.removeAll((List) this.f88370e.f87705a, (Function1) C39506n.f87702a);
        this.f88371f.removeObserver(this.f88372g);
    }
}
