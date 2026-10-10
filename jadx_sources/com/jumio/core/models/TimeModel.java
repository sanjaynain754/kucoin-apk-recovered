package com.jumio.core.models;

import android.os.SystemClock;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.JsonUtilKt;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/models/TimeModel;", "Lcom/jumio/core/model/StaticModel;", "serverTime", "", "startRealtime", "<init>", "(JJ)V", "getServerTime", "()J", "getStartRealtime", "getCurrentTime", "elapsedRealtime", "getCurrentTimeAsDate", "Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("TimeModel")
public final /* data */ class TimeModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final long f14368a;

    /* JADX INFO: renamed from: b */
    public final long f14369b;

    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/models/TimeModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/TimeModel;", "jsonObject", "Lorg/json/JSONObject;", "startRealtime", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static /* synthetic */ TimeModel fromJson$default(Companion companion, JSONObject jSONObject, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = SystemClock.elapsedRealtime();
            }
            return companion.fromJson(jSONObject, j11);
        }

        @NotNull
        public final TimeModel fromJson(@NotNull JSONObject jsonObject, long startRealtime) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Date dateOptDate$default = JsonUtilKt.optDate$default(jsonObject, "timestamp", "yyyy-MM-dd'T'HH:mm:ss.S'Z'", null, null, null, 28, null);
            return new TimeModel(dateOptDate$default != null ? dateOptDate$default.getTime() : Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis(), startRealtime);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TimeModel() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) other;
        return this.f14368a == timeModel.f14368a && this.f14369b == timeModel.f14369b;
    }

    public TimeModel(long j11, long j12) {
        this.f14368a = j11;
        this.f14369b = j12;
    }

    public static /* synthetic */ TimeModel copy$default(TimeModel timeModel, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timeModel.f14368a;
        }
        if ((i11 & 2) != 0) {
            j12 = timeModel.f14369b;
        }
        return timeModel.copy(j11, j12);
    }

    public static /* synthetic */ long getCurrentTime$default(TimeModel timeModel, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = SystemClock.elapsedRealtime();
        }
        return timeModel.getCurrentTime(j11);
    }

    public static /* synthetic */ Date getCurrentTimeAsDate$default(TimeModel timeModel, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = SystemClock.elapsedRealtime();
        }
        return timeModel.getCurrentTimeAsDate(j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getF14368a() {
        return this.f14368a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14369b() {
        return this.f14369b;
    }

    @NotNull
    public final TimeModel copy(long serverTime, long startRealtime) {
        return new TimeModel(serverTime, startRealtime);
    }

    public final long getCurrentTime(long elapsedRealtime) {
        return (elapsedRealtime - this.f14369b) + this.f14368a;
    }

    @NotNull
    public final Date getCurrentTimeAsDate(long elapsedRealtime) {
        return new Date(getCurrentTime(elapsedRealtime));
    }

    public final long getServerTime() {
        return this.f14368a;
    }

    public final long getStartRealtime() {
        return this.f14369b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14369b) + (Long.hashCode(this.f14368a) * 31);
    }

    @NotNull
    public String toString() {
        return "TimeModel(serverTime=" + this.f14368a + ", startRealtime=" + this.f14369b + ')';
    }

    public TimeModel(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() : j11, (i11 & 2) != 0 ? SystemClock.elapsedRealtime() : j12);
    }
}
