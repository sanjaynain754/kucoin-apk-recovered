package com.kubi.config.kcrc;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.C5264d;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigParam.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÂ\u0003J\t\u0010\u001d\u001a\u00020\tHÂ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rHÂ\u0003Je\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%J\u0006\u0010&\u001a\u00020\tJ\b\u0010'\u001a\u00020\tH\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "", "intervalDuration", "", "maxDelayAfterPush", "foregroundThrottle", "retryCount", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "country", "uid", "extParam", "", "(JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAppId", "()Ljava/lang/String;", "getForegroundThrottle", "()J", "getIntervalDuration", "getMaxDelayAfterPush", "getRetryCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "queryMap", "", "realCountry", "toString", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class KCRemoteConfigParam {

    @NotNull
    private final String appId;

    @NotNull
    private final String country;

    @NotNull
    private final Map<String, String> extParam;
    private final long foregroundThrottle;
    private final long intervalDuration;
    private final long maxDelayAfterPush;
    private final int retryCount;

    @NotNull
    private final String uid;

    public KCRemoteConfigParam(long j11, long j12, long j13, int i11, @NotNull String appId, @NotNull String country, @NotNull String uid, @NotNull Map<String, String> extParam) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(extParam, "extParam");
        this.intervalDuration = j11;
        this.maxDelayAfterPush = j12;
        this.foregroundThrottle = j13;
        this.retryCount = i11;
        this.appId = appId;
        this.country = country;
        this.uid = uid;
        this.extParam = extParam;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRemoteConfigParam)) {
            return false;
        }
        KCRemoteConfigParam kCRemoteConfigParam = (KCRemoteConfigParam) other;
        return this.intervalDuration == kCRemoteConfigParam.intervalDuration && this.maxDelayAfterPush == kCRemoteConfigParam.maxDelayAfterPush && this.foregroundThrottle == kCRemoteConfigParam.foregroundThrottle && this.retryCount == kCRemoteConfigParam.retryCount && Intrinsics.areEqual(this.appId, kCRemoteConfigParam.appId) && Intrinsics.areEqual(this.country, kCRemoteConfigParam.country) && Intrinsics.areEqual(this.uid, kCRemoteConfigParam.uid) && Intrinsics.areEqual(this.extParam, kCRemoteConfigParam.extParam);
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getUid() {
        return this.uid;
    }

    private final Map<String, String> component8() {
        return this.extParam;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCRemoteConfigParam copy$default(KCRemoteConfigParam kCRemoteConfigParam, long j11, long j12, long j13, int i11, String str, String str2, String str3, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = kCRemoteConfigParam.intervalDuration;
        }
        return kCRemoteConfigParam.copy(j11, (i12 & 2) != 0 ? kCRemoteConfigParam.maxDelayAfterPush : j12, (i12 & 4) != 0 ? kCRemoteConfigParam.foregroundThrottle : j13, (i12 & 8) != 0 ? kCRemoteConfigParam.retryCount : i11, (i12 & 16) != 0 ? kCRemoteConfigParam.appId : str, (i12 & 32) != 0 ? kCRemoteConfigParam.country : str2, (i12 & 64) != 0 ? kCRemoteConfigParam.uid : str3, (i12 & 128) != 0 ? kCRemoteConfigParam.extParam : map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMaxDelayAfterPush() {
        return this.maxDelayAfterPush;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getForegroundThrottle() {
        return this.foregroundThrottle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final KCRemoteConfigParam copy(long intervalDuration, long maxDelayAfterPush, long foregroundThrottle, int retryCount, @NotNull String appId, @NotNull String country, @NotNull String uid, @NotNull Map<String, String> extParam) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(extParam, "extParam");
        return new KCRemoteConfigParam(intervalDuration, maxDelayAfterPush, foregroundThrottle, retryCount, appId, country, uid, extParam);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public final long getForegroundThrottle() {
        return this.foregroundThrottle;
    }

    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    public final long getMaxDelayAfterPush() {
        return this.maxDelayAfterPush;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.intervalDuration) * 31) + Long.hashCode(this.maxDelayAfterPush)) * 31) + Long.hashCode(this.foregroundThrottle)) * 31) + Integer.hashCode(this.retryCount)) * 31) + this.appId.hashCode()) * 31) + this.country.hashCode()) * 31) + this.uid.hashCode()) * 31) + this.extParam.hashCode();
    }

    @NotNull
    public final Map<String, String> queryMap() {
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m90091to(RemoteConfigConstants.RequestFieldKey.APP_ID, this.appId), TuplesKt.m90091to("country", realCountry()), TuplesKt.m90091to("uid", this.uid), TuplesKt.m90091to(RemoteConfigConstants.RequestFieldKey.APP_BUILD, String.valueOf(C5264d.m6164j())), TuplesKt.m90091to("buildId", C5264d.m6155a()));
        mapMutableMapOf.putAll(this.extParam);
        return mapMutableMapOf;
    }

    @NotNull
    public final String realCountry() {
        return C11426l.m20570c(this.country);
    }

    @NotNull
    public String toString() {
        return "KCRemoteConfigParam(intervalDuration=" + this.intervalDuration + ", maxDelayAfterPush=" + this.maxDelayAfterPush + ", retryCount=" + this.retryCount + ", queryMap=" + queryMap() + ')';
    }

    public /* synthetic */ KCRemoteConfigParam(long j11, long j12, long j13, int i11, String str, String str2, String str3, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, (i12 & 8) != 0 ? 3 : i11, str, str2, str3, (i12 & 128) != 0 ? MapsKt.emptyMap() : map);
    }
}
