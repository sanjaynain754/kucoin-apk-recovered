package com.tencent.rmonitor.sla;

import com.tencent.bugly.proguard.C33868q0;
import com.tencent.rmonitor.base.reporter.DiscardReason;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u001e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J.\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ0\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u000bH\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/tencent/rmonitor/sla/StatisticsReporter;", "", "()V", "eventMap", "Ljava/util/HashMap;", "", "Lcom/tencent/rmonitor/sla/StatisticsEvent;", "Lkotlin/collections/HashMap;", "uploadRunnable", "Ljava/lang/Runnable;", "deleteDataInDB", "", "list", "", "Lcom/tencent/rmonitor/sla/AttaEvent;", "fillAttaEvent", "statisticsEvent", "getEvent", "baseType", "subType", "recordDiscard", "discardReason", "Lcom/tencent/rmonitor/base/reporter/DiscardReason;", "recordDiscardInternal", "recordUpload", "success", "", "contentLength", "", "cost", "recordUploadInternal", "saveDataToDB", "upload", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StatisticsReporter {

    @NotNull
    private static final String TAG = "RMonitor_sla_StatisticsReporter";
    private static final long UPLOAD_INTERVAL = 600000;

    @NotNull
    private final HashMap<String, StatisticsEvent> eventMap;

    @NotNull
    private final Runnable uploadRunnable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<StatisticsReporter> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<StatisticsReporter>() { // from class: com.tencent.rmonitor.sla.StatisticsReporter$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final StatisticsReporter invoke() {
            return new StatisticsReporter(null);
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/StatisticsReporter$Companion;", "", "()V", "TAG", "", "UPLOAD_INTERVAL", "", "instance", "Lcom/tencent/rmonitor/sla/StatisticsReporter;", "getInstance", "()Lcom/tencent/rmonitor/sla/StatisticsReporter;", "instance$delegate", "Lkotlin/Lazy;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final StatisticsReporter getInstance() {
            return (StatisticsReporter) StatisticsReporter.instance$delegate.getValue();
        }
    }

    public /* synthetic */ StatisticsReporter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StatisticsReporter() {
        this.eventMap = new HashMap<>();
        Runnable runnable = new Runnable() { // from class: com.tencent.rmonitor.sla.g
            @Override // java.lang.Runnable
            public final void run() {
                StatisticsReporter.m103837uploadRunnable$lambda0(this.f75345b);
            }
        };
        this.uploadRunnable = runnable;
        ReporterMachine.INSTANCE.postDelayed(runnable, 600000L);
    }

    private final void deleteDataInDB(List<AttaEvent> list) {
        AttaDBManager.INSTANCE.batchDeleteData(list);
    }

    private final StatisticsEvent getEvent(String baseType, String subType) {
        String str = baseType + '-' + subType;
        StatisticsEvent statisticsEvent = this.eventMap.get(str);
        if (statisticsEvent == null) {
            statisticsEvent = new StatisticsEvent(baseType, subType);
        }
        this.eventMap.put(str, statisticsEvent);
        return statisticsEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: recordDiscard$lambda-2, reason: not valid java name */
    public static final void m103835recordDiscard$lambda2(StatisticsReporter this$0, String baseType, String subType, DiscardReason discardReason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(baseType, "$baseType");
        Intrinsics.checkNotNullParameter(subType, "$subType");
        Intrinsics.checkNotNullParameter(discardReason, "$discardReason");
        this$0.recordDiscardInternal(baseType, subType, discardReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: recordUpload$lambda-1, reason: not valid java name */
    public static final void m103836recordUpload$lambda1(StatisticsReporter this$0, String baseType, String subType, boolean z11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(baseType, "$baseType");
        Intrinsics.checkNotNullParameter(subType, "$subType");
        this$0.recordUploadInternal(baseType, subType, z11, i11, i12);
    }

    private final void saveDataToDB(StatisticsEvent statisticsEvent) {
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(TAG, "saveDataToDB baseType:" + statisticsEvent.getBaseType() + " subType:" + statisticsEvent.getSubType());
        }
        fillAttaEvent(statisticsEvent);
        AttaDBManager.INSTANCE.saveData(statisticsEvent.getAttaEvent());
    }

    private final void upload() {
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(TAG, "upload statistics data");
        }
        if (this.eventMap.isEmpty()) {
            Logger.INSTANCE.mo77130d(TAG, "statistics data is empty , wait next upload");
        } else {
            ArrayList arrayList = new ArrayList();
            Collection<StatisticsEvent> collectionValues = this.eventMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "eventMap.values");
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(((StatisticsEvent) it.next()).getAttaEvent());
            }
            if (AttaEventReporter.INSTANCE.getInstance().batchReportSync(arrayList, false)) {
                this.eventMap.clear();
                deleteDataInDB(arrayList);
            }
        }
        ReporterMachine.INSTANCE.postDelayed(this.uploadRunnable, 600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadRunnable$lambda-0, reason: not valid java name */
    public static final void m103837uploadRunnable$lambda0(StatisticsReporter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.upload();
    }

    public final void recordDiscard(@NotNull final String baseType, @NotNull final String subType, @NotNull final DiscardReason discardReason) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(discardReason, "discardReason");
        if (C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_RECORD_REPORT)) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(TAG, "recordDiscard baseType:" + baseType + ", subType:" + subType);
            }
            ReporterMachine.INSTANCE.post(new Runnable() { // from class: com.tencent.rmonitor.sla.h
                @Override // java.lang.Runnable
                public final void run() {
                    StatisticsReporter.m103835recordDiscard$lambda2(this.f75346b, baseType, subType, discardReason);
                }
            });
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(TAG, "recordDiscard, [" + baseType + ", " + subType + "] miss hit");
        }
    }

    public final void recordUpload(@NotNull final String baseType, @NotNull final String subType, final boolean success, final int contentLength, final int cost) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(subType, "subType");
        if (!C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_RECORD_REPORT)) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(TAG, "recordUpload, [" + baseType + ", " + subType + "] miss hit");
                return;
            }
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(TAG, "recordUpload [" + baseType + ", " + subType + "], success:" + success + ", length:" + contentLength + ", cost:" + cost);
        }
        ReporterMachine.INSTANCE.post(new Runnable() { // from class: com.tencent.rmonitor.sla.i
            @Override // java.lang.Runnable
            public final void run() {
                StatisticsReporter.m103836recordUpload$lambda1(this.f75350b, baseType, subType, success, contentLength, cost);
            }
        });
    }

    private final void fillAttaEvent(StatisticsEvent statisticsEvent) {
        AttaEvent attaEvent = statisticsEvent.getAttaEvent();
        AttaEventHelper.INSTANCE.fillBaseInfo(attaEvent);
        attaEvent.setParam0(statisticsEvent.getBaseType());
        attaEvent.setParam1(statisticsEvent.getSubType());
        attaEvent.setParam2(String.valueOf(statisticsEvent.getDiscardCount()));
        attaEvent.setParam3(String.valueOf(statisticsEvent.getFailCount()));
        attaEvent.setParam4(String.valueOf(statisticsEvent.getSuccCount()));
        attaEvent.setParam5(String.valueOf(statisticsEvent.getExpiredCount()));
        attaEvent.setParam10(String.valueOf(statisticsEvent.getSuccContentLengthSum()));
        attaEvent.setParam11(String.valueOf(statisticsEvent.getFailContentLengthSum()));
        attaEvent.setParam12(String.valueOf(statisticsEvent.getSuccCostSum()));
        attaEvent.setParam13(String.valueOf(statisticsEvent.getFailCostSum()));
    }

    private final void recordDiscardInternal(String baseType, String subType, DiscardReason discardReason) {
        StatisticsEvent event = getEvent(baseType, subType);
        if (discardReason == DiscardReason.CACHE_EXPIRE) {
            event.setExpiredCount(event.getExpiredCount() + 1);
        } else if (discardReason == DiscardReason.RETRY_EXCEEDED) {
            event.setDiscardCount(event.getDiscardCount() + 1);
        }
        saveDataToDB(event);
    }

    private final void recordUploadInternal(String baseType, String subType, boolean success, int contentLength, int cost) {
        StatisticsEvent event = getEvent(baseType, subType);
        if (success) {
            event.setSuccCount(event.getSuccCount() + 1);
            event.setSuccContentLengthSum(event.getSuccContentLengthSum() + contentLength);
            event.setSuccCostSum(event.getSuccCostSum() + cost);
        } else {
            event.setFailCount(event.getFailCount() + 1);
            event.setFailContentLengthSum(event.getFailContentLengthSum() + contentLength);
            event.setFailCostSum(event.getFailCostSum() + cost);
        }
        saveDataToDB(event);
    }
}
