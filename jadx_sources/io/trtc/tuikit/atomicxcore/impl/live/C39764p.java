package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39764p implements TUILiveBattleManager.BattleRequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39767q f88359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BattleRequestCallback f88360b;

    public C39764p(C39767q c39767q, BattleRequestCallback battleRequestCallback) {
        this.f88359a = c39767q;
        this.f88360b = battleRequestCallback;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.BattleRequestCallback
    public final void onError(TUICommonDefine.Error error, String s11) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(s11, "s");
        C39510r c39510r = this.f88359a.f88369d;
        String message = "Response: requestBattle failed code=" + error.getValue() + ", message=" + s11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        BattleRequestCallback battleRequestCallback = this.f88360b;
        if (battleRequestCallback != null) {
            battleRequestCallback.onError(error.getValue(), s11);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.BattleRequestCallback
    public final void onSuccess(TUILiveBattleManager.BattleInfo battleInfo, Map map) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        Intrinsics.checkNotNullParameter(map, "map");
        C39510r c39510r = this.f88359a.f88369d;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter("Response: requestBattle success", "message");
        c39510r.m88251a(0, "Response: requestBattle success");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(TuplesKt.m90091to((String) entry.getKey(), Integer.valueOf(((TUILiveBattleManager.BattleCode) entry.getValue()).getValue())));
        }
        Map<String, Integer> map2 = MapsKt.toMap(arrayList);
        BattleRequestCallback battleRequestCallback = this.f88360b;
        if (battleRequestCallback != null) {
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
            battleRequestCallback.onSuccess(new BattleInfo(battleId, new BattleConfig(i11, z11, extensionInfo), battleInfo.startTime, battleInfo.endTime), map2);
        }
    }
}
