package com.kubi.home.realtime.frame.manager;

import android.os.Handler;
import android.os.Looper;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BasePendingRefreshHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper;", "", "<init>", "()V", "pendingAdditions", "", "", "Lcom/kubi/home/realtime/IRealTimeData;", "pendingUpdates", "pendingRemovals", "", "refreshHandler", "Landroid/os/Handler;", "refreshRunnable", "Ljava/lang/Runnable;", "isRefreshScheduled", "", "lock", "addCard", "", "data", "immediate", "updateCard", "removeCard", "removeAll", "forceRefresh", "cleanup", "scheduleRefresh", "executeRefresh", "executeUIOperations", "operations", "Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper$PendingOperations;", "getPendingOperationsCount", "Lkotlin/Triple;", "", "Companion", "PendingOperations", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBasePendingRefreshHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePendingRefreshHelper.kt\ncom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public abstract class BasePendingRefreshHelper {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f26144h = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public Runnable f26149e;

    /* JADX INFO: renamed from: f */
    public boolean f26150f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<String, IRealTimeData> f26145a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, IRealTimeData> f26146b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Set<IRealTimeData> f26147c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Handler f26148d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Object f26151g = new Object();

    /* JADX INFO: compiled from: BasePendingRefreshHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper$Companion;", "", "<init>", "()V", "REFRESH_INTERVAL_MS", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper$a, reason: from toString */
    /* JADX INFO: compiled from: BasePendingRefreshHelper.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper$PendingOperations;", "", "additions", "", "", "Lcom/kubi/home/realtime/IRealTimeData;", "updates", "removals", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getAdditions", "()Ljava/util/Map;", "getUpdates", "getRemovals", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PendingOperations {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final Map<String, IRealTimeData> additions;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Map<String, IRealTimeData> updates;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final Set<IRealTimeData> removals;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingOperations)) {
                return false;
            }
            PendingOperations pendingOperations = (PendingOperations) other;
            return Intrinsics.areEqual(this.additions, pendingOperations.additions) && Intrinsics.areEqual(this.updates, pendingOperations.updates) && Intrinsics.areEqual(this.removals, pendingOperations.removals);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PendingOperations(@NotNull Map<String, ? extends IRealTimeData> additions, @NotNull Map<String, ? extends IRealTimeData> updates, @NotNull Set<? extends IRealTimeData> removals) {
            Intrinsics.checkNotNullParameter(additions, "additions");
            Intrinsics.checkNotNullParameter(updates, "updates");
            Intrinsics.checkNotNullParameter(removals, "removals");
            this.additions = additions;
            this.updates = updates;
            this.removals = removals;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, IRealTimeData> m30151a() {
            return this.additions;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<IRealTimeData> m30152b() {
            return this.removals;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, IRealTimeData> m30153c() {
            return this.updates;
        }

        public int hashCode() {
            return (((this.additions.hashCode() * 31) + this.updates.hashCode()) * 31) + this.removals.hashCode();
        }

        @NotNull
        public String toString() {
            return "PendingOperations(additions=" + this.additions + ", updates=" + this.updates + ", removals=" + this.removals + ')';
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo30094d(@NotNull PendingOperations pendingOperations);

    /* JADX INFO: renamed from: b */
    public final void m30144b(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f26151g) {
            this.f26145a.put(data.getUniqueId(), data);
            this.f26146b.remove(data.getUniqueId());
            this.f26147c.remove(data);
        }
        m30149h(z11);
    }

    /* JADX INFO: renamed from: c */
    public final void m30145c() {
        PendingOperations pendingOperations;
        synchronized (this.f26151g) {
            pendingOperations = new PendingOperations(MapsKt.toMap(this.f26145a), MapsKt.toMap(this.f26146b), CollectionsKt.toSet(this.f26147c));
            this.f26145a.clear();
            this.f26146b.clear();
            this.f26147c.clear();
            this.f26150f = false;
        }
        mo30094d(pendingOperations);
    }

    /* JADX INFO: renamed from: e */
    public final void m30146e() {
        synchronized (this.f26151g) {
            try {
                if (this.f26150f) {
                    Handler handler = this.f26148d;
                    Runnable runnable = this.f26149e;
                    if (runnable == null) {
                        return;
                    }
                    handler.removeCallbacks(runnable);
                    this.f26150f = false;
                }
                Unit unit = Unit.INSTANCE;
                m30145c();
                synchronized (this.f26151g) {
                    m30149h(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m30147f(boolean z11) {
        synchronized (this.f26151g) {
            this.f26145a.clear();
            this.f26146b.clear();
            this.f26147c.clear();
            Unit unit = Unit.INSTANCE;
        }
        m30149h(z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m30148g(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f26151g) {
            this.f26147c.add(data);
            this.f26145a.remove(data.getUniqueId());
            this.f26146b.remove(data.getUniqueId());
        }
        m30149h(z11);
    }

    /* JADX INFO: renamed from: h */
    public final void m30149h(boolean z11) {
        if (z11) {
            m30146e();
            return;
        }
        synchronized (this.f26151g) {
            if (this.f26150f) {
                return;
            }
            if (this.f26145a.isEmpty() && this.f26146b.isEmpty() && this.f26147c.isEmpty()) {
                return;
            }
            this.f26150f = true;
            Unit unit = Unit.INSTANCE;
            Runnable runnable = new Runnable() { // from class: mj.a
                @Override // java.lang.Runnable
                public final void run() {
                    BasePendingRefreshHelper.m30143i(this.f94228b);
                }
            };
            this.f26149e = runnable;
            this.f26148d.postDelayed(runnable, 5000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30150j(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f26151g) {
            try {
                if (this.f26145a.containsKey(data.getUniqueId())) {
                    this.f26145a.put(data.getUniqueId(), data);
                } else {
                    this.f26146b.put(data.getUniqueId(), data);
                }
                this.f26147c.remove(data);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m30149h(z11);
    }

    /* JADX INFO: renamed from: i */
    public static final void m30143i(BasePendingRefreshHelper basePendingRefreshHelper) {
        basePendingRefreshHelper.m30145c();
    }
}
