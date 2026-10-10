package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40104h implements BattleRequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreViewDefine.BattleRequestCallback f89202a;

    public C40104h(LiveCoreViewDefine.BattleRequestCallback battleRequestCallback) {
        this.f89202a = battleRequestCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        LiveCoreViewDefine.BattleRequestCallback battleRequestCallback = this.f89202a;
        if (battleRequestCallback != null) {
            battleRequestCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.BattleRequestCallback
    public final void onSuccess(BattleInfo battleInfo, Map resultMap) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        Intrinsics.checkNotNullParameter(resultMap, "resultMap");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : resultMap.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).intValue() == 0) {
                arrayList.add(str);
            }
        }
        LiveCoreViewDefine.BattleRequestCallback battleRequestCallback = this.f89202a;
        if (battleRequestCallback != null) {
            battleRequestCallback.onSuccess(battleInfo.getBattleID(), arrayList);
        }
    }
}
