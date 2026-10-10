package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39749k extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveBattleManager.BattleUser f88333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39749k(String str, TUILiveBattleManager.BattleUser battleUser) {
        super(1);
        this.f88332a = str;
        this.f88333b = battleUser;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BattleListener notify = (BattleListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onUserJoinBattle(this.f88332a, AbstractC39719a.m88318a(this.f88333b));
        return Unit.INSTANCE;
    }
}
