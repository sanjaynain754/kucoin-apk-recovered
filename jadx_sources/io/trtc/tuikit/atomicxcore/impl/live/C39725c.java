package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39725c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveBattleManager.BattleInfo f88259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39725c(TUILiveBattleManager.BattleInfo battleInfo) {
        super(1);
        this.f88259a = battleInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        TUILiveBattleManager.BattleInfo battleInfo = this.f88259a;
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        String battleId = battleInfo.battleId;
        Intrinsics.checkNotNullExpressionValue(battleId, "battleId");
        TUILiveBattleManager.BattleConfig battleConfig = battleInfo.config;
        Intrinsics.checkNotNullExpressionValue(battleConfig, "config");
        Intrinsics.checkNotNullParameter(battleConfig, "battleConfig");
        int i11 = battleConfig.duration;
        boolean z11 = battleConfig.needResponse;
        String extensionInfo = battleConfig.extensionInfo;
        Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
        notify.onBattleEnded(new BattleInfo(battleId, new BattleConfig(i11, z11, extensionInfo), battleInfo.startTime, battleInfo.endTime), BattleEndedReason.TIME_OVER);
        return Unit.INSTANCE;
    }
}
