package com.jumio.analytics;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.UUID;
import jumio.core.C40534G2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u000bJ\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006#"}, m90084d2 = {"Lcom/jumio/analytics/AnalyticsEvent;", "Ljava/io/Serializable;", "type", "", "valueAsMap", "Lcom/jumio/analytics/MetaInfo;", "<init>", "(ILcom/jumio/analytics/MetaInfo;)V", "payloadValue", "", "payloadMetaInfo", "(ILjava/lang/String;Lcom/jumio/analytics/MetaInfo;)V", "eventElapsedMillis", "", "getEventElapsedMillis", "()J", "eventType", "getEventType", "()I", "payload", "Lcom/jumio/analytics/Payload;", "getPayload", "()Lcom/jumio/analytics/Payload;", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "toString", "hashCode", "equals", "", "other", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnalyticsEvent implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long f13409a;

    /* JADX INFO: renamed from: b */
    public final int f13410b;

    /* JADX INFO: renamed from: c */
    public final C40534G2 f13411c;

    /* JADX INFO: renamed from: d */
    public UUID f13412d;

    public AnalyticsEvent(int i11, @NotNull MetaInfo valueAsMap) {
        Intrinsics.checkNotNullParameter(valueAsMap, "valueAsMap");
        this.f13409a = SystemClock.elapsedRealtime();
        this.f13410b = i11;
        this.f13411c = new C40534G2(valueAsMap, null);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof AnalyticsEvent) {
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
            if (analyticsEvent.f13409a == this.f13409a && Intrinsics.areEqual(analyticsEvent.f13412d, this.f13412d) && analyticsEvent.f13410b == this.f13410b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getEventElapsedMillis, reason: from getter */
    public final long getF13409a() {
        return this.f13409a;
    }

    /* JADX INFO: renamed from: getEventType, reason: from getter */
    public final int getF13410b() {
        return this.f13410b;
    }

    @NotNull
    /* JADX INFO: renamed from: getPayload, reason: from getter */
    public final C40534G2 getF13411c() {
        return this.f13411c;
    }

    @Nullable
    /* JADX INFO: renamed from: getSessionId, reason: from getter */
    public final UUID getF13412d() {
        return this.f13412d;
    }

    public int hashCode() {
        long j11 = this.f13409a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + 31) * 31;
        UUID uuid = this.f13412d;
        return ((i11 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.f13410b;
    }

    public final void setSessionId(@Nullable UUID uuid) {
        this.f13412d = uuid;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AnalyticsEvent ");
        sb2.append(this.f13410b);
        sb2.append(" | ");
        sb2.append(this.f13409a);
        sb2.append(" // ");
        sb2.append(this.f13411c.f89978a);
        if (this.f13411c.f89979b != null) {
            str = " | " + this.f13411c.f89979b;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public AnalyticsEvent(int i11, @NotNull String payloadValue, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(payloadValue, "payloadValue");
        this.f13409a = SystemClock.elapsedRealtime();
        this.f13410b = i11;
        this.f13411c = new C40534G2(payloadValue, metaInfo);
    }
}
