package com.kubi.operation.lib.realtimev2.common;

import android.os.Handler;
import android.os.Looper;
import at.C4387c;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.ViewLifecycleListener;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CommonRealtimeListener.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeListener;", "Lcom/kubi/home/realtime/ViewLifecycleListener;", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "<init>", "()V", "handler", "Landroid/os/Handler;", "pendingRemovedItems", "Ljava/util/concurrent/CopyOnWriteArrayList;", "flushRemovedRunnable", "Ljava/lang/Runnable;", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "onCardCreate", "", "onCardShow", "onCardHide", "onCardDestroy", "onCardRefresh", "onViewLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonRealtimeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRealtimeListener.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeListener\n+ 2 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n*L\n1#1,77:1\n53#2,4:78\n53#2,4:82\n53#2,4:86\n53#2,4:90\n53#2,4:94\n53#2,4:98\n53#2,4:102\n*S KotlinDebug\n*F\n+ 1 CommonRealtimeListener.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeListener\n*L\n38#1:78,4\n43#1:82,4\n48#1:86,4\n53#1:90,4\n57#1:94,4\n63#1:98,4\n30#1:102,4\n*E\n"})
public final class CommonRealtimeListener implements ViewLifecycleListener<DynamicCardItemEntity> {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f36809d = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Handler f36810a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CopyOnWriteArrayList<DynamicCardItemEntity> f36811b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Runnable f36812c = new Runnable() { // from class: com.kubi.operation.lib.realtimev2.common.e
        @Override // java.lang.Runnable
        public final void run() {
            CommonRealtimeListener.m43564h(this.f36822b);
        }
    };

    /* JADX INFO: compiled from: CommonRealtimeListener.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/common/CommonRealtimeListener$Companion;", "", "<init>", "()V", "TAG", "", "REMOVE_DEBOUNCE_MS", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m43564h(CommonRealtimeListener commonRealtimeListener) {
        if (commonRealtimeListener.f36811b.isEmpty()) {
            return;
        }
        List<DynamicCardItemEntity> list = CollectionsKt.toList(commonRealtimeListener.f36811b);
        commonRealtimeListener.f36811b.clear();
        C4387c c4387c = C4387c.f3817a;
        CommonRealtimeDataHelper.f36803a.m43559j(list);
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: a */
    public void mo30039a() throws JSONException {
        C4387c c4387c = C4387c.f3817a;
        CommonRealtimeDataHelper.f36803a.m43560k();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: b */
    public void mo30040b() {
        C4387c c4387c = C4387c.f3817a;
        CommonRealtimeDataHelper.f36803a.m43558i();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    @NotNull
    /* JADX INFO: renamed from: c */
    public RealTimeViewType mo30041c() {
        return RealTimeViewType.COMMON;
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: d */
    public void mo30042d(@NotNull ViewLifecycleEvent<DynamicCardItemEntity> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getViewType() != RealTimeViewType.COMMON) {
            return;
        }
        C4387c c4387c = C4387c.f3817a;
        if (event instanceof ViewLifecycleEvent.Removed) {
            this.f36811b.add((DynamicCardItemEntity) ((ViewLifecycleEvent.Removed) event).m30140b());
            this.f36810a.removeCallbacks(this.f36812c);
            this.f36810a.postDelayed(this.f36812c, 100L);
        }
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo30043e() {
        C4387c c4387c = C4387c.f3817a;
        CommonRealtimeDataHelper.f36803a.m43561l();
    }

    @Override // com.kubi.home.realtime.ViewLifecycleListener
    /* JADX INFO: renamed from: f */
    public void mo30044f() {
        C4387c c4387c = C4387c.f3817a;
        CommonRealtimeDataHelper.f36803a.m43561l();
    }
}
