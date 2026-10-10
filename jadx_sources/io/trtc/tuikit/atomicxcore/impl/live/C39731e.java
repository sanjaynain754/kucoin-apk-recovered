package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39731e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveBattleManager.BattleInfo f88281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39731e(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        super(1);
        this.f88281a = battleInfo;
        this.f88282b = battleUser;
        this.f88283c = battleUser2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String battleId = this.f88281a.battleId;
        Intrinsics.checkNotNullExpressionValue(battleId, "battleId");
        notify.onBattleRequestCancelled(battleId, AbstractC39719a.m88318a(this.f88282b), AbstractC39719a.m88318a(this.f88283c));
        return Unit.INSTANCE;
    }
}
