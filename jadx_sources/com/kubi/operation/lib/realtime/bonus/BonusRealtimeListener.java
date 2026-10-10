package com.kubi.operation.lib.realtime.bonus;

import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.ViewLifecycleListener;
import org.jetbrains.annotations.NotNull;
import p842zs.C46913b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.realtime.bonus.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BonusRealtimeListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeListener;", "Lcom/kubi/home/realtime/ViewLifecycleListener;", "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;", "<init>", "()V", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "onCardCreate", "", "onCardShow", "onCardHide", "onCardDestroy", "onCardRefresh", "onViewLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BonusRealtimeListener implements ViewLifecycleListener<BonusRealtimeData> {
    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: a */
    public void mo30039a() {
        C46913b.f104783a.m103333d("[bonus]onCardShow");
        BonusRealtimeDataHelper.f36764a.m43497h();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: b */
    public void mo30040b() {
        C46913b.f104783a.m103333d("[bonus]onCardHide");
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    @NotNull
    /* JADX INFO: renamed from: c */
    public RealTimeViewType mo30041c() {
        return RealTimeViewType.WELFARE_BONUS;
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: d */
    public void mo30042d(@NotNull ViewLifecycleEvent<BonusRealtimeData> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getViewType() != RealTimeViewType.WELFARE_BONUS) {
            return;
        }
        C46913b.f104783a.m103333d("[bonus]onViewLifecycleEvent,event:" + event);
        if ((event instanceof ViewLifecycleEvent.DialogShow) || (event instanceof ViewLifecycleEvent.Hide)) {
            return;
        }
        if (event instanceof ViewLifecycleEvent.Removed) {
            BonusRealtimeDataHelper.f36764a.m43496g((BonusRealtimeData) ((ViewLifecycleEvent.Removed) event).m30140b());
        } else {
            boolean z11 = event instanceof ViewLifecycleEvent.Show;
        }
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo30043e() {
        C46913b.f104783a.m103333d("[bonus]onCardRefresh");
        BonusRealtimeDataHelper bonusRealtimeDataHelper = BonusRealtimeDataHelper.f36764a;
        bonusRealtimeDataHelper.m43499j();
        bonusRealtimeDataHelper.m43497h();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: f */
    public void mo30044f() {
        C46913b.f104783a.m103333d("[bonus]onCardCreate");
        BonusRealtimeDataHelper.f36764a.m43497h();
    }
}
