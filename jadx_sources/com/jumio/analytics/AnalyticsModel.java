package com.jumio.analytics;

import com.google.firebase.perf.util.Constants;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.ConcurrentMutableList;
import com.jumio.core.util.ConcurrentMutableListKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.UUID;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u0006%"}, m90084d2 = {"Lcom/jumio/analytics/AnalyticsModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", DbParams.TABLE_EVENTS, "", "Lcom/jumio/analytics/AnalyticsEvent;", "getEvents", "()Ljava/util/List;", "reporting", "getReporting", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "quota", "", "getQuota", "()I", "setQuota", "(I)V", "time", "", "getTime", "()J", "setTime", "(J)V", "started", "", "getStarted", "()Z", "setStarted", "(Z)V", Constants.ENABLE_DISABLE, "setEnabled", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("AnalyticsModel")
public final class AnalyticsModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMutableList f13413a = ConcurrentMutableListKt.concurrentMutableListOf();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMutableList f13414b = ConcurrentMutableListKt.concurrentMutableListOf();

    /* JADX INFO: renamed from: c */
    public final UUID f13415c;

    /* JADX INFO: renamed from: d */
    public int f13416d;

    /* JADX INFO: renamed from: e */
    public long f13417e;

    /* JADX INFO: renamed from: f */
    public boolean f13418f;

    /* JADX INFO: renamed from: g */
    public boolean f13419g;

    public AnalyticsModel() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.f13415c = uuidRandomUUID;
        this.f13416d = 10;
        this.f13419g = true;
    }
}
