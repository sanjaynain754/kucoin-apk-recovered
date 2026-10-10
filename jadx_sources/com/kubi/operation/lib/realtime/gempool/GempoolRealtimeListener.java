package com.kubi.operation.lib.realtime.gempool;

import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.ViewLifecycleListener;
import org.jetbrains.annotations.NotNull;
import p842zs.C46913b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.realtime.gempool.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GempoolRealtimeListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeListener;", "Lcom/kubi/home/realtime/ViewLifecycleListener;", "Lcom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeData;", "<init>", "()V", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "onCardCreate", "", "onCardShow", "onCardHide", "onCardDestroy", "onCardRefresh", "onViewLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GempoolRealtimeListener implements ViewLifecycleListener<GemPoolRealtimeData> {
    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: a */
    public void mo30039a() {
        C46913b.f104783a.m103333d("[gempool]onCardShow");
        GempoolRealtimeDataHelper.f36778a.m43519j();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: b */
    public void mo30040b() {
        C46913b.f104783a.m103333d("[gempool]onCardHide");
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    @NotNull
    /* JADX INFO: renamed from: c */
    public RealTimeViewType mo30041c() {
        return RealTimeViewType.GEM_POOL;
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: d */
    public void mo30042d(@NotNull ViewLifecycleEvent<GemPoolRealtimeData> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getViewType() != RealTimeViewType.GEM_POOL) {
            return;
        }
        C46913b.f104783a.m103333d("[gempool]onViewLifecycleEvent,event:" + event);
        if (event instanceof ViewLifecycleEvent.DialogShow) {
            GempoolRealtimeDataHelper.f36778a.m43517h(true, (GemPoolRealtimeData) ((ViewLifecycleEvent.DialogShow) event).m30138b());
            return;
        }
        if (event instanceof ViewLifecycleEvent.Hide) {
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (event instanceof ViewLifecycleEvent.Removed) {
            GempoolRealtimeDataHelper.f36778a.m43518i((GemPoolRealtimeData) ((ViewLifecycleEvent.Removed) event).m30140b());
        } else if (event instanceof ViewLifecycleEvent.Show) {
            GempoolRealtimeDataHelper.f36778a.m43517h(false, (GemPoolRealtimeData) ((ViewLifecycleEvent.Show) event).m30141b());
        } else {
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo30043e() {
        C46913b.f104783a.m103333d("[gempool]onCardRefresh");
        GempoolRealtimeDataHelper gempoolRealtimeDataHelper = GempoolRealtimeDataHelper.f36778a;
        gempoolRealtimeDataHelper.m43521l();
        gempoolRealtimeDataHelper.m43519j();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: f */
    public void mo30044f() {
        C46913b.f104783a.m103333d("[gempool]onCardCreate");
        GempoolRealtimeDataHelper.f36778a.m43519j();
    }
}
