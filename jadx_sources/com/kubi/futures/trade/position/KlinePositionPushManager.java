package com.kubi.futures.trade.position;

import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.v1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KlinePositionPushManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/trade/position/KlinePositionPushManager;", "", "<init>", "()V", "TAG", "", "isPushEnabled", "", "aggregateManager", "Lcom/kubi/futures/trade/position/FuturesPositionAggregateManager;", "start", "", InterfaceC33730j9.f70350a, "release", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlinePositionPushManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KlinePositionPushManager f24259a = new KlinePositionPushManager();

    /* JADX INFO: renamed from: b */
    public static boolean f24260b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static FuturesPositionAggregateManager f24261c;

    /* JADX INFO: renamed from: b */
    public final void m27773b() {
        if (f24260b) {
            C44128b.m97259c("KlinePositionPushManager", "start: already started, skip");
            return;
        }
        f24260b = true;
        C44128b.m97259c("KlinePositionPushManager", "start: enabled");
        if (f24261c == null) {
            f24261c = new FuturesPositionAggregateManager(null, 1, null);
        }
        FuturesPositionAggregateManager futuresPositionAggregateManager = f24261c;
        if (futuresPositionAggregateManager != null) {
            futuresPositionAggregateManager.m27743n();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27774c() {
        if (!f24260b) {
            C44128b.m97259c("KlinePositionPushManager", "stop: already stopped, skip");
            return;
        }
        f24260b = false;
        C44128b.m97259c("KlinePositionPushManager", "stop: disabled");
        FuturesPositionAggregateManager futuresPositionAggregateManager = f24261c;
        if (futuresPositionAggregateManager != null) {
            futuresPositionAggregateManager.m27745p();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27772a() {
        m27774c();
        f24261c = null;
    }
}
