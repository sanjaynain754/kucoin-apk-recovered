package com.kubi.sdk.performance.pageopen;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43848i;
import p569qq.C43852m;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PageOpenReporter.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"Bi\b\u0000\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012:\u0010\u0007\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002JL\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\rH\u0002J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J>\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0002R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0007\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;", "Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;", "sensorsTrack", "Lkotlin/Function2;", "", "Lorg/json/JSONObject;", "", "kunlunTrack", "Lkotlin/Function3;", "", "", "", "isKunlunReportingEnabled", "", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "report", "Lcom/kubi/sdk/performance/pageopen/PageOpenReport;", "reportSummary", "reportStage", "stage", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "buildSensorsSummary", "buildSensorsStage", "buildKunlunDimensions", "category", "type", "stageName", DbParams.KEY_CHANNEL_RESULT, "includeCacheHit", "buildKunlunSummaryMetrics", "reportKunlunMetric", "durationMs", "", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPageOpenReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageOpenReporter.kt\ncom/kubi/sdk/performance/pageopen/PageOpenReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,194:1\n1869#2,2:195\n1#3:197\n123#4,13:198\n*S KotlinDebug\n*F\n+ 1 PageOpenReporter.kt\ncom/kubi/sdk/performance/pageopen/PageOpenReporter\n*L\n52#1:195,2\n38#1:198,13\n*E\n"})
public final class PageOpenReporter implements PageOpenReportSink {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f47194d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final PageOpenReporter f47195e = new PageOpenReporter(new Function2() { // from class: com.kubi.sdk.performance.pageopen.f
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return PageOpenReporter.m57353j((String) obj, (JSONObject) obj2);
        }
    }, new Function3() { // from class: com.kubi.sdk.performance.pageopen.g
        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return PageOpenReporter.m57354k((String) obj, (Map) obj2, (Map) obj3);
        }
    }, false);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function2<String, JSONObject, Unit> f47196a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function3<String, Map<String, ? extends Object>, Map<String, ? extends Number>, Unit> f47197b;

    /* JADX INFO: renamed from: c */
    public final boolean f47198c;

    /* JADX INFO: compiled from: PageOpenReporter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenReporter$Companion;", "", "<init>", "()V", "TAG", "", "SENSORS_EVENT_NAME", "KUNLUN_EVENT_NAME", "CATEGORY_PAGE_OPEN", "CATEGORY_PAGE_OPEN_STAGE", "IS_KUNLUN_REPORTING_ENABLED", "", "default", "Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;", "getDefault", "()Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PageOpenReporter getDefault() {
            return PageOpenReporter.f47195e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageOpenReporter(@NotNull Function2<? super String, ? super JSONObject, Unit> sensorsTrack, @NotNull Function3<? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Number>, Unit> kunlunTrack, boolean z11) {
        Intrinsics.checkNotNullParameter(sensorsTrack, "sensorsTrack");
        Intrinsics.checkNotNullParameter(kunlunTrack, "kunlunTrack");
        this.f47196a = sensorsTrack;
        this.f47197b = kunlunTrack;
        this.f47198c = z11;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Map m57352f(PageOpenReporter pageOpenReporter, PageOpenReport pageOpenReport, String str, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            str4 = pageOpenReport.getResult().getValue();
        }
        String str6 = str4;
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        return pageOpenReporter.m57356e(pageOpenReport, str, str2, str5, str6, z11);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m57353j(String eventName, JSONObject properties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(properties, "properties");
        C43852m.m96605q(eventName, properties);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m57354k(String eventName, Map map, Map map2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (map == null || map.isEmpty()) {
            C44128b.m97260d("kunlun dimensions is null");
        } else {
            for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
                if (map2 == null || map2.isEmpty()) {
                    interfaceC44169a.mo94079b(eventName, MapsKt.toMutableMap(map));
                } else {
                    interfaceC44169a.mo94078a(eventName, MapsKt.toMutableMap(map2), MapsKt.toMutableMap(map));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.performance.pageopen.PageOpenReportSink
    /* JADX INFO: renamed from: a */
    public void mo57355a(@NotNull PageOpenReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (report.getSampled()) {
            m57362n(report);
            Iterator<T> it = report.m57409k().iterator();
            while (it.hasNext()) {
                m57361m(report, (PageOpenStageRecord) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m57358h(PageOpenReport pageOpenReport, PageOpenStageRecord pageOpenStageRecord) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "page_open_stage");
        jSONObject.put("name", pageOpenStageRecord.getName());
        jSONObject.put("page_id", pageOpenReport.getPageId());
        jSONObject.put("page_trace_id", pageOpenReport.getPageTraceId());
        jSONObject.put("open_mode", pageOpenReport.getOpenMode().getValue());
        jSONObject.put("source", pageOpenReport.getSource());
        jSONObject.put("$event_duration", pageOpenStageRecord.getDurationMs());
        jSONObject.put(DbParams.KEY_CHANNEL_RESULT, pageOpenStageRecord.getF47240c().getValue());
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m57359i(PageOpenReport pageOpenReport) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "page_open");
        jSONObject.put("page_id", pageOpenReport.getPageId());
        jSONObject.put("page_trace_id", pageOpenReport.getPageTraceId());
        jSONObject.put("open_mode", pageOpenReport.getOpenMode().getValue());
        jSONObject.put("source", pageOpenReport.getSource());
        jSONObject.put(DbParams.KEY_CHANNEL_RESULT, pageOpenReport.getResult().getValue());
        Long ttidMs = pageOpenReport.getTtidMs();
        if (ttidMs != null) {
            jSONObject.put("duration1", ttidMs.longValue());
        }
        jSONObject.put("$event_duration", pageOpenReport.getDurationMs());
        if (pageOpenReport.getResult() == PageOpenResult.SUCCESS) {
            Long dataPhaseMs = pageOpenReport.getDataPhaseMs();
            if (dataPhaseMs != null) {
                jSONObject.put("duration2", dataPhaseMs.longValue());
            }
            Long renderPhaseMs = pageOpenReport.getRenderPhaseMs();
            if (renderPhaseMs != null) {
                jSONObject.put("duration3", renderPhaseMs.longValue());
            }
            Boolean cacheHit = pageOpenReport.getCacheHit();
            if (cacheHit != null) {
                jSONObject.put("cache_hit", cacheHit.booleanValue());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: l */
    public final void m57360l(PageOpenReport pageOpenReport, String str, String str2, long j11, String str3, String str4) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f47197b.invoke("frontend_rnpage_count_cost_milliseconds", m57352f(this, pageOpenReport, str, str2, str3, str4, false, 32, null), MapsKt.mapOf(TuplesKt.m90091to(TypedValues.TransitionType.S_DURATION, Long.valueOf(j11))));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n("PageOpenReporter", "PageOpen Kunlun stage report failed");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m57361m(PageOpenReport pageOpenReport, PageOpenStageRecord pageOpenStageRecord) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f47196a.invoke("duration_event", m57358h(pageOpenReport, pageOpenStageRecord));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n("PageOpenReporter", "PageOpen sensors stage report failed");
        }
        if (this.f47198c) {
            m57360l(pageOpenReport, "page_open_stage", "stage", pageOpenStageRecord.getDurationMs(), pageOpenStageRecord.getName(), PageOpenStageResult.SUCCESS.getValue());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m57362n(PageOpenReport pageOpenReport) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f47196a.invoke("duration_event", m57359i(pageOpenReport));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n("PageOpenReporter", "PageOpen sensors summary report failed");
        }
        if (this.f47198c) {
            try {
                this.f47197b.invoke("frontend_rnpage_count_cost_milliseconds", m57352f(this, pageOpenReport, "page_open", "summary", null, null, true, 24, null), m57357g(pageOpenReport));
                objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                C44128b.m97270n("PageOpenReporter", "PageOpen Kunlun summary report failed");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m57356e(PageOpenReport pageOpenReport, String str, String str2, String str3, String str4, boolean z11) {
        Boolean cacheHit;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("category", str);
        mapCreateMapBuilder.put("type", str2);
        mapCreateMapBuilder.put("page_id", pageOpenReport.getPageId());
        mapCreateMapBuilder.put("open_mode", pageOpenReport.getOpenMode().getValue());
        mapCreateMapBuilder.put("open_source", pageOpenReport.getSource());
        mapCreateMapBuilder.put(DbParams.KEY_CHANNEL_RESULT, str4);
        if (str3 != null) {
            mapCreateMapBuilder.put("name", str3);
        }
        if (z11 && pageOpenReport.getResult() == PageOpenResult.SUCCESS && (cacheHit = pageOpenReport.getCacheHit()) != null) {
            mapCreateMapBuilder.put("cache_hit", cacheHit);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, Number> m57357g(PageOpenReport pageOpenReport) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (pageOpenReport.getResult() == PageOpenResult.SUCCESS) {
            mapCreateMapBuilder.put("ttfd", Long.valueOf(pageOpenReport.getDurationMs()));
            Long ttidMs = pageOpenReport.getTtidMs();
            if (ttidMs != null) {
            }
            Long dataPhaseMs = pageOpenReport.getDataPhaseMs();
            if (dataPhaseMs != null) {
            }
            Long renderPhaseMs = pageOpenReport.getRenderPhaseMs();
            if (renderPhaseMs != null) {
                mapCreateMapBuilder.put("render_phase", Long.valueOf(renderPhaseMs.longValue()));
            }
        } else {
            mapCreateMapBuilder.put("terminal_duration", Long.valueOf(pageOpenReport.getDurationMs()));
            Long ttidMs2 = pageOpenReport.getTtidMs();
            if (ttidMs2 != null) {
                mapCreateMapBuilder.put("ttid", Long.valueOf(ttidMs2.longValue()));
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
