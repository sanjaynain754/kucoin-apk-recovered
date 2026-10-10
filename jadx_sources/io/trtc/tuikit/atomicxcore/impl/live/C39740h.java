package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39740h extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveBattleManager.BattleInfo f88312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39740h(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        super(1);
        this.f88312a = battleInfo;
        this.f88313b = battleUser;
        this.f88314c = battleUser2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String battleId = this.f88312a.battleId;
        Intrinsics.checkNotNullExpressionValue(battleId, "battleId");
        notify.onBattleRequestTimeout(battleId, AbstractC39719a.m88318a(this.f88313b), AbstractC39719a.m88318a(this.f88314c));
        return Unit.INSTANCE;
    }
}
