package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40078S;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.S */
/* JADX INFO: loaded from: classes61.dex */
public final class C40078S extends TUILiveBattleManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40088Y f89147a;

    /* JADX INFO: renamed from: a */
    public static final void m88446a(TUILiveBattleManager.BattleInfo battleInfo, LiveCoreViewDefine.BattleObserver battleObserver) {
        if (battleObserver != null) {
            battleObserver.onBattleEnded(battleInfo);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88450b(TUILiveBattleManager.BattleInfo battleInfo, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleStarted(battleInfo);
        }
    }

    public C40078S(C40088Y c40088y) {
        this.f89147a = c40088y;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88447a(String str, TUILiveBattleManager.BattleUser battleUser, LiveCoreViewDefine.BattleObserver battleObserver) {
        if (battleObserver != null) {
            battleObserver.onUserExitBattle(str, battleUser);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88451b(String str, TUILiveBattleManager.BattleUser battleUser, LiveCoreViewDefine.BattleObserver battleObserver) {
        if (battleObserver != null) {
            battleObserver.onUserJoinBattle(str, battleUser);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m88452c(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleRequestReceived(battleInfo.battleId, battleUser, battleUser2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m88453d(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleRequestReject(battleInfo.battleId, battleUser, battleUser2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88454e(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleRequestTimeout(battleInfo.battleId, battleUser, battleUser2);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleEnded(final TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleStoppedReason battleStoppedReason) {
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.e
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88446a(battleInfo, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestAccept(final TUILiveBattleManager.BattleInfo battleInfo, final TUILiveBattleManager.BattleUser battleUser, final TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.g
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88445a(battleInfo, battleUser, battleUser2, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestCancelled(final TUILiveBattleManager.BattleInfo battleInfo, final TUILiveBattleManager.BattleUser battleUser, final TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.h
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88449b(battleInfo, battleUser, battleUser2, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestReceived(final TUILiveBattleManager.BattleInfo battleInfo, final TUILiveBattleManager.BattleUser battleUser, final TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.a
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88452c(battleInfo, battleUser, battleUser2, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestReject(final TUILiveBattleManager.BattleInfo battleInfo, final TUILiveBattleManager.BattleUser battleUser, final TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.f
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88453d(battleInfo, battleUser, battleUser2, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestTimeout(final TUILiveBattleManager.BattleInfo battleInfo, final TUILiveBattleManager.BattleUser battleUser, final TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.i
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88454e(battleInfo, battleUser, battleUser2, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleScoreChanged(final String str, final List list) {
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.j
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88448a(str, list, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleStarted(final TUILiveBattleManager.BattleInfo battleInfo) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.d
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88450b(battleInfo, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onUserExitBattle(final String str, final TUILiveBattleManager.BattleUser battleUser) {
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.b
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88447a(str, battleUser, battleObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onUserJoinBattle(final String str, final TUILiveBattleManager.BattleUser battleUser) {
        this.f89147a.m88486a(new InterfaceC40073P() { // from class: ig0.c
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40073P
            /* JADX INFO: renamed from: a */
            public final void mo87175a(LiveCoreViewDefine.BattleObserver battleObserver) {
                C40078S.m88451b(str, battleUser, battleObserver);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m88448a(String str, List list, LiveCoreViewDefine.BattleObserver battleObserver) {
        if (battleObserver != null) {
            battleObserver.onBattleScoreChanged(str, list);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88449b(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleRequestCancelled(battleInfo.battleId, battleUser, battleUser2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88445a(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2, LiveCoreViewDefine.BattleObserver battleObserver) {
        Intrinsics.checkNotNullParameter(battleInfo, "$battleInfo");
        if (battleObserver != null) {
            battleObserver.onBattleRequestAccept(battleInfo.battleId, battleUser, battleUser2);
        }
    }
}
