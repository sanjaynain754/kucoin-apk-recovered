package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39734f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveBattleManager.BattleInfo f88293a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39734f(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        super(1);
        this.f88293a = battleInfo;
        this.f88294b = battleUser;
        this.f88295c = battleUser2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String battleId = this.f88293a.battleId;
        Intrinsics.checkNotNullExpressionValue(battleId, "battleId");
        notify.onBattleRequestReceived(battleId, AbstractC39719a.m88318a(this.f88294b), AbstractC39719a.m88318a(this.f88295c));
        return Unit.INSTANCE;
    }
}
