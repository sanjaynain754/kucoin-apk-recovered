package com.kubi.monitor.duration;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: DurationSession.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150!j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010!j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010/\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m90084d2 = {"Lcom/kubi/monitor/duration/DurationSession;", "", "Lcom/kubi/monitor/duration/DurationRule;", "rule", "<init>", "(Lcom/kubi/monitor/duration/DurationRule;)V", "", "pointName", "", "c", "(Ljava/lang/String;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "", "extraPros", "b", "(Ljava/util/Map;)V", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "d", "(Ljava/lang/Long;)Z", ReportDataTable.COLUMN_PARAMS, "f", "(Lorg/json/JSONObject;)V", "Lcom/kubi/monitor/duration/DurationRule;", "J", "startTime", "", "Ljava/util/Set;", "dataSet", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "resultMap", "lastKeyPointTime", "", "Ljava/util/List;", "endPoints", "g", "Z", "isReported", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "Ljava/lang/Object;", "lock", "j", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DurationSession {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DurationRule rule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> dataSet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Long> resultMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastKeyPointTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<String> endPoints;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isReported;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Object> extraPros;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: d */
    public final boolean m42436d(Long l11) {
        return l11 != null && l11.longValue() >= 0 && l11.longValue() < 300000;
    }

    public DurationSession(@NotNull DurationRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.rule = rule;
        this.startTime = System.currentTimeMillis();
        this.dataSet = new LinkedHashSet();
        this.resultMap = new HashMap<>();
        this.lastKeyPointTime = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(rule.m42417a());
        this.endPoints = arrayList;
        this.extraPros = new HashMap<>();
        this.lock = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42433a(@NotNull String pointName) {
        JSONObject jSONObjectM42437e;
        Intrinsics.checkNotNullParameter(pointName, "pointName");
        if (this.isReported) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.lock) {
            try {
                if (this.endPoints.remove(pointName)) {
                    this.resultMap.put(pointName, Long.valueOf(jCurrentTimeMillis - this.lastKeyPointTime));
                    HashMap<String, Long> map = this.resultMap;
                    String eventName = this.rule.getEventName();
                    Long l11 = this.resultMap.get(this.rule.getEventName());
                    if (l11 == null) {
                        l11 = 0L;
                    }
                    map.put(eventName, Long.valueOf(Long.max(l11.longValue(), jCurrentTimeMillis - this.startTime)));
                }
                jSONObjectM42437e = this.endPoints.isEmpty() ? m42437e() : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jSONObjectM42437e == null) {
            return false;
        }
        m42438f(jSONObjectM42437e);
        this.isReported = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m42434b(@NotNull Map<String, ? extends Object> extraPros) {
        Intrinsics.checkNotNullParameter(extraPros, "extraPros");
        synchronized (this.lock) {
            this.extraPros.putAll(extraPros);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m42435c(@NotNull String pointName) {
        Intrinsics.checkNotNullParameter(pointName, "pointName");
        if (this.isReported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.lock) {
            if (this.dataSet.contains(pointName)) {
                return;
            }
            this.dataSet.add(pointName);
            this.resultMap.put(pointName, Long.valueOf(jCurrentTimeMillis - this.lastKeyPointTime));
            this.lastKeyPointTime = jCurrentTimeMillis;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m42437e() throws JSONException {
        if (!m42436d(this.resultMap.get(this.rule.getEventName()))) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.extraPros.toString());
        jSONObject.put("name", this.rule.getEventName());
        jSONObject.put("category", this.rule.getEventCate().name());
        jSONObject.put("event_duration", this.resultMap.get(this.rule.getEventName()));
        Iterator<String> it = this.rule.m42420d().iterator();
        int i11 = 1;
        while (it.hasNext()) {
            Long l11 = this.resultMap.get(it.next());
            if (l11 != null) {
                long jLongValue = l11.longValue();
                if (m42436d(Long.valueOf(jLongValue))) {
                    jSONObject.put(Intrinsics.stringPlus(TypedValues.TransitionType.S_DURATION, Integer.valueOf(i11)), jLongValue);
                    i11++;
                }
            }
        }
        Iterator<String> it2 = this.rule.m42417a().iterator();
        while (it2.hasNext()) {
            Long l12 = this.resultMap.get(it2.next());
            if (l12 != null) {
                long jLongValue2 = l12.longValue();
                if (m42436d(Long.valueOf(jLongValue2))) {
                    jSONObject.put(Intrinsics.stringPlus(TypedValues.TransitionType.S_DURATION, Integer.valueOf(i11)), jLongValue2);
                    i11++;
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final void m42438f(JSONObject params) {
        C44128b.m97259c("Monitor:DurationSession", Intrinsics.stringPlus("report:", params));
        C43852m.m96605q("duration_event", params);
    }
}
