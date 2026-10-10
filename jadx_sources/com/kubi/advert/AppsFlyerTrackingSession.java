package com.kubi.advert;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.advert.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012B\u0010\b\u001a>\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u000fJE\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\b\u001a>\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerTrackingSession;", "", "elapsedRealtime", "Lkotlin/Function0;", "", "installTraceId", "", "sessionIdProvider", "reporter", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "event", "", "properties", "", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "sessionId", "sessionIndex", "", "sessionStartedAtMs", "startSession", "report", "source", DbParams.KEY_CHANNEL_RESULT, "durationMs", "extras", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "elapsedSinceSessionStart", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppsFlyerTrackingSession {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Long> f15156a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f15157b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<String> f15158c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function2<String, Map<String, ? extends Object>, Unit> f15159d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public String f15160e;

    /* JADX INFO: renamed from: f */
    public int f15161f;

    /* JADX INFO: renamed from: g */
    public long f15162g;

    /* JADX INFO: renamed from: a */
    public final synchronized long m14795a() {
        return RangesKt.coerceAtLeast(this.f15156a.invoke().longValue() - this.f15162g, 0L);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14796b(@NotNull String name, @NotNull String source, @NotNull String result, @Nullable Long l11, @NotNull Map<String, ? extends Object> extras) {
        try {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f15160e.length() == 0) {
                m14797d();
            }
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(extras);
            mutableMap.put("category", "appsflyer");
            mutableMap.put("name", name);
            mutableMap.put("source", source);
            mutableMap.put(DbParams.KEY_CHANNEL_RESULT, result);
            mutableMap.put("$event_duration", Long.valueOf(l11 != null ? l11.longValue() : m14795a()));
            mutableMap.put("session_id", this.f15160e);
            mutableMap.put("session_index", Integer.valueOf(this.f15161f));
            if (this.f15157b.length() > 0) {
                mutableMap.put("install_trace_id", this.f15157b);
            }
            this.f15159d.invoke("duration_event", mutableMap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m14797d() throws Throwable {
        try {
            try {
                this.f15161f++;
                this.f15160e = this.f15158c.invoke();
                this.f15162g = this.f15156a.invoke().longValue();
                m14794c(this, "af_session_start", "af", "ok", 0L, null, 16, null);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsFlyerTrackingSession(@NotNull Function0<Long> elapsedRealtime, @NotNull String installTraceId, @NotNull Function0<String> sessionIdProvider, @NotNull Function2<? super String, ? super Map<String, ? extends Object>, Unit> reporter) {
        Intrinsics.checkNotNullParameter(elapsedRealtime, "elapsedRealtime");
        Intrinsics.checkNotNullParameter(installTraceId, "installTraceId");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f15156a = elapsedRealtime;
        this.f15157b = installTraceId;
        this.f15158c = sessionIdProvider;
        this.f15159d = reporter;
        this.f15160e = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14794c(AppsFlyerTrackingSession appsFlyerTrackingSession, String str, String str2, String str3, Long l11, Map map, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            l11 = null;
        }
        Long l12 = l11;
        if ((i11 & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        appsFlyerTrackingSession.m14796b(str, str2, str3, l12, map);
    }
}
