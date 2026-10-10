package com.tencent.rmonitor.sla;

import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u001e\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEventReporter;", "", "()V", C33590cg.f69440j, "Ljava/util/ArrayList;", "Lcom/tencent/rmonitor/sla/AttaEvent;", "Lkotlin/collections/ArrayList;", "addEvent", "", "attaEvent", "batchReportAsync", TIMPushConstants.PUSH_REPORT_EVENT_LIST_KEY, "", "cacheToDb", "", "batchReportSync", "doReport", "getAttaUrl", "Ljava/net/URL;", "prepareReport", "reportAsync", "event", "reportSync", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaEventReporter {
    private static final int MAX_MERGE_COUNT = 10;

    @NotNull
    private static final String TAG = "RMonitor_sla_AttaEventReporter";

    @NotNull
    private final ArrayList<AttaEvent> cache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AttaEventReporter> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<AttaEventReporter>() { // from class: com.tencent.rmonitor.sla.AttaEventReporter$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final AttaEventReporter invoke() {
            return new AttaEventReporter(null);
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;", "", "()V", "MAX_MERGE_COUNT", "", "TAG", "", "instance", "Lcom/tencent/rmonitor/sla/AttaEventReporter;", "getInstance", "()Lcom/tencent/rmonitor/sla/AttaEventReporter;", "instance$delegate", "Lkotlin/Lazy;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final AttaEventReporter getInstance() {
            return (AttaEventReporter) AttaEventReporter.instance$delegate.getValue();
        }
    }

    public /* synthetic */ AttaEventReporter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AttaEventReporter() {
        this.cache = new ArrayList<>(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addEvent$lambda-2$lambda-1, reason: not valid java name */
    public static final void m103833addEvent$lambda2$lambda1(AttaEventReporter this$0, ArrayList copyCache) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(copyCache, "$copyCache");
        this$0.doReport(copyCache, true);
    }

    public static /* synthetic */ void batchReportAsync$default(AttaEventReporter attaEventReporter, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        attaEventReporter.batchReportAsync(list, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: batchReportAsync$lambda-0, reason: not valid java name */
    public static final void m103834batchReportAsync$lambda0(AttaEventReporter this$0, List eventList, boolean z11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventList, "$eventList");
        this$0.doReport(eventList, z11);
    }

    public static /* synthetic */ boolean batchReportSync$default(AttaEventReporter attaEventReporter, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return attaEventReporter.batchReportSync(list, z11);
    }

    private final URL getAttaUrl() {
        try {
            return new URL(BaseInfo.urlMeta.getAttaUrl());
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
            return null;
        }
    }

    public static /* synthetic */ void reportAsync$default(AttaEventReporter attaEventReporter, AttaEvent attaEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        attaEventReporter.reportAsync(attaEvent, z11);
    }

    public static /* synthetic */ boolean reportSync$default(AttaEventReporter attaEventReporter, AttaEvent attaEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return attaEventReporter.reportSync(attaEvent, z11);
    }

    public final void addEvent(@NotNull AttaEvent attaEvent) {
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        Logger logger = Logger.INSTANCE;
        logger.mo77130d(TAG, "addEvent, eventCode:" + attaEvent.getEventCode());
        AttaEventHelper.INSTANCE.fillBaseInfo(attaEvent);
        AttaDBManager.INSTANCE.saveData(attaEvent);
        synchronized (this.cache) {
            try {
                logger.mo77130d(TAG, "current cache size:" + this.cache.size() + " , do add event");
                this.cache.add(attaEvent);
                if (this.cache.size() >= 10) {
                    final ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.cache);
                    ReporterMachine.INSTANCE.post(new Runnable() { // from class: com.tencent.rmonitor.sla.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            AttaEventReporter.m103833addEvent$lambda2$lambda1(this.f75343b, arrayList);
                        }
                    });
                    this.cache.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void batchReportAsync(@NotNull final List<AttaEvent> eventList, final boolean cacheToDb) {
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Logger.INSTANCE.mo77130d(TAG, "reportAsync size:" + eventList.size());
        if (prepareReport(eventList, cacheToDb)) {
            ReporterMachine.INSTANCE.post(new Runnable() { // from class: com.tencent.rmonitor.sla.e
                @Override // java.lang.Runnable
                public final void run() {
                    AttaEventReporter.m103834batchReportAsync$lambda0(this.f75340b, eventList, cacheToDb);
                }
            });
        }
    }

    public final boolean batchReportSync(@NotNull List<AttaEvent> eventList, boolean cacheToDb) {
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Logger.INSTANCE.mo77130d(TAG, "reportSync size:" + eventList.size());
        if (prepareReport(eventList, cacheToDb)) {
            return doReport(eventList, cacheToDb);
        }
        return false;
    }

    public final void reportAsync(@NotNull AttaEvent event, boolean cacheToDb) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.INSTANCE.mo77130d(TAG, "reportAsync , eventCode:" + event.getEventCode());
        batchReportAsync(CollectionsKt.arrayListOf(event), cacheToDb);
    }

    public final boolean reportSync(@NotNull AttaEvent event, boolean cacheToDb) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.INSTANCE.mo77130d(TAG, "reportSync , eventCode:" + event.getEventCode());
        return batchReportSync(CollectionsKt.arrayListOf(event), cacheToDb);
    }

    private final boolean doReport(List<AttaEvent> eventList, boolean cacheToDb) {
        URL attaUrl = getAttaUrl();
        if (attaUrl != null) {
            boolean zReport = new AttaEventReportTask(attaUrl, eventList).report();
            if (zReport && cacheToDb) {
                AttaDBManager.INSTANCE.batchDeleteData(eventList);
            }
            return zReport;
        }
        Logger.INSTANCE.mo77134w(TAG, "can not get atta url");
        return false;
    }

    private final boolean prepareReport(List<AttaEvent> eventList, boolean cacheToDb) {
        if (eventList.isEmpty()) {
            return false;
        }
        AttaEventHelper.INSTANCE.fillBaseInfo(eventList);
        if (cacheToDb) {
            AttaDBManager.INSTANCE.batchSaveData(eventList);
            return true;
        }
        return true;
    }
}
